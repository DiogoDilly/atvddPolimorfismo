/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepolimorfismo;


public class retangulo extends FormaGeometrica{
    double base = 5.6;
    double altura = 9.3;
    public retangulo(double base,double altura){
        this.altura = altura;
        this.base = base;
        
        
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override 
    public void calcularArea(){
    double area = altura * base;
        System.out.println("a area do retangulo e:"+area); 
        
        
    }
    
}
