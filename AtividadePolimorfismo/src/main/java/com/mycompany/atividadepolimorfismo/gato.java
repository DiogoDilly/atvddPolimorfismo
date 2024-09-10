/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepolimorfismo;

/**
 *
 * @author aluno.saolucas
 */
public class gato extends Animal{
    @Override
    public void emitirsom(){
        System.out.println("miau miau");
    }
    @Override
    public void mover(){
        System.out.println("ele saltou");
    }
    
}
