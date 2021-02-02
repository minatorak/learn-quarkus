package org.acme.commandmode

import javax.validation.constraints.NotBlank
import javax.ws.rs.*
import javax.ws.rs.core.Context
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.UriInfo

@Path("/hello") // define url path
class GreetingResource {

    companion object {
        enum class Order { desc, asc; }
    }

    @GET //action to http get
    @Produces(MediaType.APPLICATION_JSON) // define media type are returned
    fun hello(
        @Context uriInfo: UriInfo,
        @QueryParam("order") order: Order,
        @NotBlank @HeaderParam("authorization") authorization: String
    ): String {
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