

package com.mycompany.atividadepolimorfismo;


public class AtividadePolimorfismo {

    public static void main(String[] args) {
    FormaGeometrica t1 = new retangulo(3.4,5.6); 
    FormaGeometrica t2 = new circulo(4.8);
    FormaGeometrica t3 = new triangulo(3.4,6.9);   
        
    t1.calcularArea();
    t2.calcularArea();
    t3.calcularArea();
    
    }
}
