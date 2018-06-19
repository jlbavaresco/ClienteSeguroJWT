/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.cliente;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:ServicoNumero [numero]<br>
 * USAGE:
 * <pre>
 *        ClienteNumero client = new ClienteNumero();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Jorge
 */
public class ClienteNumero {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/ServicoSeguroJWT/servicos";

    public ClienteNumero() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("numero");
    }    

    public <T> T gerar(Class<T> responseType, String token) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("gerar");        
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).
                header("Authorization", token).get(responseType);
    }

    public void close() {
        client.close();
    }
    
}
