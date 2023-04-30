/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsitema2.cep;

/**
 *
 * @author Mateus Ferraz
 */
public class CepApi {
    
    private static final  CepApi instancia = new CepApi();

    private CepApi() {
        
    }

    public static CepApi getInstancia() {
        return instancia;
}
    public  String recuperarCidade (String cep){
        
        return "BeloHorizonte";
        
    }
    public  String recuperarEstado(String cep){
        return "MG";
}
    
}