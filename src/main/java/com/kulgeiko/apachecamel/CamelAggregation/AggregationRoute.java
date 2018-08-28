package com.kulgeiko.apachecamel.CamelAggregation;

import org.apache.camel.builder.RouteBuilder;


class AggregationRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        /* Core points of aggregation
        1 - Correlation identifier: which incoming message belong together
        2 - Completion condition: predicate/time-based condition to send group
        3 - Aggregation strategy: how to combine messages into single message
         */

        from("direct:start")
                .log("Sending ${body} with correlation key ${header.myId}")
                .aggregate(header("myId"), new MyAggregationStrategy())
                .completionSize(3)
                .log("Sending out ${body}")
                .to("mock:result");
    }

}
