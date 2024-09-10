/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepolimorfismo;

/**
 *
 * @author aluno.saolucas
 */
public class circulo extends FormaGeometrica {
    double raio = 8.4;
    
    public circulo(double raio){
        this.raio = raio;
    }
    
    @Override
    public void calcularArea(){
    double area = Math.PI * Math.pow(raio, 2);
    
        System.out.println("a area do circulo e:"+area);
    
    }
    
    
    
    
}
