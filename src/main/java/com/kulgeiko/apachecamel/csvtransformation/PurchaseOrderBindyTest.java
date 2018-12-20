package com.kulgeiko.apachecamel.csvtransformation;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.dataformat.BindyType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by akulgeiko on 9/4/2018.
 */
public class PurchaseOrderBindyTest {

    public static void main(String args[]) throws Exception {

        // Camel context
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(createRoute());
        context.start();

        // Orders
        PurchaseOrder order1 = new PurchaseOrder();
        order1.setAmount(1);
        order1.setPrice(new BigDecimal("49.95"));
        order1.setName("Camel in Action");

        PurchaseOrder order2 = new PurchaseOrder();
        order2.setAmount(2);
        order2.setPrice(new BigDecimal("60.98"));
        order2.setName("Scala");

        PurchaseOrder order3 = new PurchaseOrder();

        // Array of orders
        List orders = new ArrayList<PurchaseOrder>();
        orders.add(order1);
        orders.add(order3);
        orders.add(order2);

        // Push to endpoint
        ProducerTemplate template = context.createProducerTemplate();
        template.sendBody("direct:toCsv", orders);

    }

    public static RouteBuilder createRoute() {
        return new RouteBuilder() {
            public void configure() throws Exception {
                from("direct:toCsv")
                        .marshal().bindy(BindyType.Csv, "com.kulgeiko.apachecamel.csvtransformation")
                        .to("file://target/orders/received?fileName=report-${header.Date}.csv");
            }
        };
    }
}

