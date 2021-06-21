/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uniacademia.rs_avaliativa2.service;

import com.google.gson.Gson;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author savio
 */

@Path("/formatar")
public class ServiceFormatacao {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/get/cpf={cpf}")
    public String formatarCPF(@PathParam("cpf") String cpf){
        return null;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/get/cnpj={cnpj}")
    public String formatarCNPJ(@PathParam("cnpj") String cnpj){
        return null;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/get/cep={cep}")
    public String formatarCEP(@PathParam("cep") String cep){
       return null; 
    }
}
