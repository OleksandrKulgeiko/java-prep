package com.kulgeiko.apachecamel.camelaggregation;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Created by akulgeiko on 8/20/2018.
 */
public class AggregationExample {
    public static void main(String args[]) throws Exception {

        // create CamelContext
        CamelContext context = new DefaultCamelContext();

        // Routes
        AggregationRoute aggregationRoute = new AggregationRoute();

        // add our route to the CamelContext
        context.addRoutes(new AggregationRoute());

        // start Camel context
        context.start();

        // Send sample data to aggregation route
        ProducerTemplate producerTemplate = context.createProducerTemplate();
        producerTemplate.sendBodyAndHeader("direct:start", "A", "myId", 1);
        producerTemplate.sendBodyAndHeader("direct:start", "A", "myId", 1);
        producerTemplate.sendBodyAndHeader("direct:start", "F", "myId", 2);
        producerTemplate.sendBodyAndHeader("direct:start", "C", "myId", 1);

        Thread.sleep(10000);

        // stop the CamelContext
        context.stop();
    }




}
