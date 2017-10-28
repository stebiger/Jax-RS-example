package de.oc.hg.de.oc.hg.rest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.core.MediaType;

public class MessageJerseyClient {

    public static void main(String[] args) {
        callService();
    }

    public static void callService() {
        WebResource service = Client.create().resource("http://localhost:8080/rest");
        System.out.println(service.path("message").accept(MediaType.TEXT_PLAIN).get(String.class));
    }

    public static void testPathParams() {
        WebResource s1 = Client.create().resource( "http://localhost:8080/rest" );
        WebResource.Builder sb1 = s1.path("message").path("user").path("chris").accept(MediaType.TEXT_PLAIN);
        System.out.println( sb1.get( String.class ) );

        WebResource s2 = Client.create().resource( "http://localhost:8080/rest" );
        WebResource.Builder sb2 = s2.path("message").path("user").path("chris")
                .path("search").path("kitesurfing")
                .accept( MediaType.TEXT_PLAIN);
        System.out.println( sb2.get( String.class ) );
    }
}
