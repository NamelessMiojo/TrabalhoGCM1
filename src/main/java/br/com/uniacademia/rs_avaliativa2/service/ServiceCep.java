/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uniacademia.rs_avaliativa2.service;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;

/**
 *
 * @author savio
 */

@Path("/cep")
public class ServiceCep {
    private final String USER_AGENT = "Mozilla/5.0";
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/get/cep={cep}")
    public String buscarCEP(@PathParam("cep") String cep){
        return null;
    }
    
    
    private String sendGet(String url) throws Exception {
       return null;
    }
}
