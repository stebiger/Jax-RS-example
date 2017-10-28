package de.oc.hg.de.oc.hg.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

@Path("message")
public class MessageResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String message() {
        return "Yea! ";
    }

    @GET
    @Path("serverinfo")
    @Produces(MediaType.TEXT_XML)
    public ServerInfo serverinfo() {
        ServerInfo info = new ServerInfo();
        info.server = System.getProperty("os.name") + " " + System.getProperty("os.version");
        return info;
    }

    @GET
    @Path("serverinfojson")
    @Produces(MediaType.APPLICATION_JSON)
    public ServerInfo serverinfoJson() {
        ServerInfo info = new ServerInfo();
        info.server = System.getProperty("os.name") + " " + System.getProperty("os.version");
        return info;
    }

    @GET
    @Path("serverinfoall")
    @Produces({MediaType.TEXT_XML, MediaType.APPLICATION_JSON})
    public ServerInfo serverinfoAll() {
        ServerInfo info = new ServerInfo();
        info.server = System.getProperty("os.name") + " " + System.getProperty("os.version");
        return info;
    }

    @XmlRootElement
    static class ServerInfo
    {
        public String server;
    }
}
