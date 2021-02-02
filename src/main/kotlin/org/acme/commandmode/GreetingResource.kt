package org.acme.commandmode

import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.PUT
import javax.ws.rs.DELETE
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.Consumes
import javax.ws.rs.core.MediaType

@Path("/hello") // define url path
class GreetingResource {

    @GET //action to http get
    @Produces(MediaType.APPLICATION_JSON) // define media type are returned
    fun hello(): String {
        return "hello minato rak"
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    fun create(message: String) {
        println("create")
    }

    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    fun update(message: String): String {
        println("update + $message")
        return message
    }

    @DELETE
    fun delete() {
        print("delete")
    }
}