/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import subsitema1.crm.CrmService;
import subsitema2.cep.CepApi;

/**
 *
 * @author Mateus Ferraz
 */
public class Facade {
    public void migrarCliente (String nome, String cep){
        String cidade = CepApi .getInstancia().recuperarCidade(cep);
        String estado = CepApi .getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado);
             
        
    }
}
