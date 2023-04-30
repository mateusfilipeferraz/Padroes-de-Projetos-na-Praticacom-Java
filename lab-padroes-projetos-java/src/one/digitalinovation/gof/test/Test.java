/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package one.digitalinovation.gof.test;

import Facade.Facade;
import one.digitalinovation.gof.SingletonEager;
import one.digitalinovation.gof.SingletonLazy;
import one.digitalinovation.gof.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.ComportamentoAgresivamente;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

/**
 *
 * @author Mateus Ferraz
 */
public class Test {

    public static void main(String[] args){
//singleton
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        //strategy
        Comportamento normal =new ComportamentoNormal();
        Comportamento defencivo =new ComportamentoDefensivo();
        Comportamento agressivo =new ComportamentoAgresivamente();
         
        Robo robo =new Robo();
        robo.setComportamento(normal);
                robo.mover();
                robo.mover();
                
    
        robo.setComportamento(defencivo);
                robo.mover();
                robo.mover();
               
        robo.setComportamento(agressivo);
                robo.mover();
                robo.mover();
                
                // Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
  }
}
