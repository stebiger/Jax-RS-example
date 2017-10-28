package de.oc.hg.de.oc.hg.rest;


import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

import javax.swing.*;
import java.io.IOException;

public class StartRestServer {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServerFactory.create("http://localhost:8080/rest");
        server.start();

        JOptionPane.showMessageDialog(null, "Stop Server");
        server.stop(0);
    }
}
