package org.acme.commandmode

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello(): String {
        return "hello minato rak"
    }
}