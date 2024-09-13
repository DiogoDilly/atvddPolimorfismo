/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepolimorfismo;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class ContaPoupanca extends ContaBancaria{
    Scanner sc =new Scanner (System.in);
    private int conta = 1500;
    private int valor;
    @Override
    public void sacar (){
        System.out.println("bem vindo a sua conta poupança quanto deseja sacar ?");
        int valor = sc.nextInt();
    conta = conta - valor;
        System.out.println("você sacou "+valor+" você tem na sua conta " +conta);
        
        
    }
    @Override
    public void depositar(){
        System.out.println("bem vindo a sua conta poupança quanto deseja depositar ?");
     int valor = sc.nextInt();
     conta = conta + valor;
        System.out.println("você depositou "+ valor +" sua conta tem ao todo "+ conta);
    }
    
    
    
}
