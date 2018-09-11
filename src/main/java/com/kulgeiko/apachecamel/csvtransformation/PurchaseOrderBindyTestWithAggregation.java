package com.kulgeiko.apachecamel.csvtransformation;

import com.kulgeiko.apachecamel.camelaggregation.MyAggregationStrategy;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Predicate;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.dataformat.BindyType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.apache.camel.builder.ProcessorBuilder.setHeader;

/**
 * Created by akulgeiko on 9/5/2018.
 */
public class PurchaseOrderBindyTestWithAggregation {

    public static void main(String args[]) throws Exception {

        // Camel context
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(createRoute());
        context.start();

        // Orders
        PurchaseOrder order1 = new PurchaseOrder("Camel in Action", new BigDecimal("49.95"), 1);
        PurchaseOrder order2 = new PurchaseOrder("Scala", new BigDecimal("60.98"), 2);
        PurchaseOrder order3 = new PurchaseOrder("Oracle PL/SQL", new BigDecimal("60.98"), 2);
        PurchaseOrder order4 = new PurchaseOrder("Kafka in Action", new BigDecimal("60.98"), 2);
        PurchaseOrder order5 = new PurchaseOrder("Java 8", new BigDecimal("60.98"), 2);


        // Push to endpoint
        ProducerTemplate template = context.createProducerTemplate();
        template.sendBodyAndHeader("direct:toCsv", order1, "id", 1);
        template.sendBodyAndHeader("direct:toCsv", order2, "id", 1);
        template.sendBodyAndHeader("direct:toCsv", order3, "id", 1);
        template.sendBodyAndHeader("direct:toCsv", order4, "id", 1);
        template.sendBodyAndHeader("direct:toCsv", order5, "id", 1);
        template.sendBodyAndHeader("direct:toCsv", null, "id", 1);
        //template.sendBody("direct:toCsv", order1);
        //template.sendBody("direct:toCsv", order2);

    }

    public static RouteBuilder createRoute() {
        return new RouteBuilder() {
            public void configure() throws Exception {
                from("direct:toCsv")
                        .choice()
                            .when(PurchaseOrderBindyTestWithAggregation::bodyIsEmpty)
                            .setHeader("messagesComplete", constant("complete"))
                        .end()

                        .aggregate(header("id"), new CsvAggregationStrategy())
                        .completionPredicate(body().isNull()).eagerCheckCompletion()

                        .marshal().bindy(BindyType.Csv, "com.kulgeiko.apachecamel.csvtransformation")
                        .to("file://target/orders/received?fileName=report-${header.id}.csv");
            }
        };




    }


    public static boolean bodyIsEmpty(Exchange e){
        if(e.getIn().getBody() == null)
            return true;
        else return false;
    }

    public static boolean hasCompletionHeader(Exchange e){
        if(e.getIn().getHeader("messagesComplete").equals("complete"))
            return true;
        else return false;
    }


}
