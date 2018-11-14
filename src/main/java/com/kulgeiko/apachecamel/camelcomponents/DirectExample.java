package com.kulgeiko.apachecamel.camelcomponents;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Created by akulgeiko on 7/25/2018.
 */
public class DirectExample {

    public static void main(String args[]) throws Exception {

        // create CamelContext
        CamelContext context = new DefaultCamelContext();

        // add our route to the CamelContext
        context.addRoutes(new RouteBuilder() {
            public void configure() {

                // timer generates idle messages
                from("timer://myTimer?period=2000")
                        .setBody().simple("Current time is ${header.firedTime}")
                        .to("direct:directComponent");

                // from direct component to system output
                from("direct:directComponent").to("stream:out");


            }
        });


        // start the route and let it do its work
        context.start();
        Thread.sleep(10000);

        // stop the CamelContext
        context.stop();
    }
}
