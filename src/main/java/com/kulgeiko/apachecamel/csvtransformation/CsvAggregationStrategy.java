package com.kulgeiko.apachecamel.csvtransformation;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akulgeiko on 9/5/2018.
 */
public class CsvAggregationStrategy implements AggregationStrategy {

    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

        //if(newExchange.getIn().getBody() == null) return newExchange;

        if (oldExchange == null) {
            PurchaseOrder newBody = newExchange.getIn().getBody(PurchaseOrder.class);
            List<PurchaseOrder> listOrders = new ArrayList<>();
            listOrders.add(newBody);
            newExchange.getIn().setBody(listOrders);
            return newExchange;
        }

        // if its the NULL body message then do not aggregate
        if (newExchange.getIn().getBody() == null) {
            return oldExchange;
        }

        List<PurchaseOrder> oldBody = oldExchange.getIn().getBody(List.class);
        PurchaseOrder newBody = newExchange.getIn().getBody(PurchaseOrder.class);

        oldBody.add(newBody);
        oldExchange.getIn().setBody(oldBody);

        return oldExchange;
    }

}
