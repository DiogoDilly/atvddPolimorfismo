/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepolimorfismo;

/**
 *
 * @author aluno.saolucas
 */
public class triangulo extends FormaGeometrica{
    double altura = 7.3;
    double base = 9.4;
    
    public triangulo(double altuira,double base){
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public void calcularArea (){
        double area =  altura * base /2;
        System.out.println("sua area e:"+ area);   
        
        
    }
}
