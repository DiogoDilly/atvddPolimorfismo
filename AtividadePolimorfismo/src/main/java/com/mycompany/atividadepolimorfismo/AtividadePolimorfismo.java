

package com.mycompany.atividadepolimorfismo;


public class AtividadePolimorfismo {

    public static void main(String[] args) {
    FormaGeometrica t1 = new retangulo(3.4,5.6); 
    FormaGeometrica t2 = new circulo(4.8);
    FormaGeometrica t3 = new triangulo(3.4,6.9);   
    Animal t4 = new passaro();
    Animal t5 = new Cachorro();
    Animal t6 = new gato();
    

    
    t1.calcularArea();
    t2.calcularArea();
    t3.calcularArea();
    t4.emitirsom();
    t4.mover();
    t5.emitirsom();
    t5.mover();
    t6.emitirsom();
    t6.mover();
    
    }
}
