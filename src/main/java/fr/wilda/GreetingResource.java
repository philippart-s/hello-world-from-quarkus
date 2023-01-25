package fr.wilda;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        String color = System.getenv("COLOR");
        if ("green".equalsIgnoreCase(color)) {
            return "🟢 👋  Hello, World ! 🌍 🟢";
        } else if ("blue".equalsIgnoreCase(color)) {
            return "🔵 👋  Hello, World ! 🌍 🔵";
        } else {
            return "👋  Hello, World ! 🌍";
        }
    }
}