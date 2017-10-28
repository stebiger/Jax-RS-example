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
}
