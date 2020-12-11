/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Moisés López
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of aula1.GenericResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/getValor/{peso}/{destino}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getValor(@PathParam("peso") double peso, @PathParam("destino") String destino) {

        double frete = 0;

        if (peso <= 5) {
            frete += 10;
        } else if (peso > 5 && peso <= 10) {
            frete += 20;
        } else {
            frete += 50;
        }

        switch (destino) {
            case "RS":
                frete += 5;
                break;
            case "SC":
                frete += 15;
                break;
            case "PR":
            case "SP":
            case "RJ":
            case "ES":
            case "MG":
            case "MS":
                frete += 40;
                break;
            default:
                frete += 70;
        }

        return "O valor do frete e: " + frete + " R$";
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     *
     * @param content representation for the resource
     * @return
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public String putXml(String content) {
        return "Resultado: " + content;
    }
}
