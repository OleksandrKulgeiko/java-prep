package com.kulgeiko.apachecamel.filecopy;

/**
 * Created by akulgeiko on 7/25/2018.
 */
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;


public class FileCopierWithCamel {

    public static void main(String args[]) throws Exception {

        // create CamelContext
        CamelContext context = new DefaultCamelContext();

        // add our route to the CamelContext

        context.addRoutes(new RouteBuilder() {
            public void configure() {
                from("file:data\\inbox?noop=true").to("file:data/outbox");
            }
        });


        // multi-casting
        /*
        String multicastDest1 = "file:data/outbox1multi";
        String multicastDest2 = "file:data/outbox2multi";
        context.addRoutes(new RouteBuilder() {
            public void configure() {
                from("file:data/inbox?noop=true").multicast()
                        //.to("file:data/outbox1multi","file:data/outbox2multi");
                        .to(multicastDest1,multicastDest2);
            }
        });
        */

        // recipient-List
        /*
        String recipients = "file:data/outbox1multi,file:data/outbox2multi";
        context.addRoutes(new RouteBuilder() {
            public void configure() {
                from("file:data/inbox?noop=true")
                        .setHeader("CamelFileName", constant("MyNewFile.txt"))
                        .recipientList(constant(recipients),",");
            }
        });
        */


        // start the route and let it do its work
        context.start();
        Thread.sleep(10000);

        // stop the CamelContext
        context.stop();
    }
}