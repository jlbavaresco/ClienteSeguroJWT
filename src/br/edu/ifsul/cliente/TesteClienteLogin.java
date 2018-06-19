/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.cliente;

/**
 *
 * @author Prof. Me. Jorge Luis Boeira Bavaresco
 * @email jorge.bavaresco@passofundo.ifsul.edu.br
 * @organization IFSUL - Campus Passo Fundo
 */
public class TesteClienteLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u = new Usuario();
        u.setLogin("jorge");
        u.setSenha("123");
        ClienteLogin clienteLogin = new ClienteLogin();
        String token = clienteLogin.login(u).readEntity(String.class);
        System.out.println("TOKEN: " + token);
        ClienteNumero clienteNumero = new ClienteNumero();
        System.out.println("Numero gerado: " + clienteNumero.gerar(String.class, token));
    }
    
}
