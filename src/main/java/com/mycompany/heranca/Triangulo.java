/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author 10725116225
 */

package com.mycompany.heranca;

//import javax.swing.*;

import javax.swing.JOptionPane;

/**
 *
 * @author chicl
 */
public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo() {
        this(0,0,"");
    }


    public Triangulo(double base, double altura, String cor) {
        super(cor);
        this.base = base;
        this.altura = altura;
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
    public void leitura (){
        super.leitura();
        setBase(Double.parseDouble(JOptionPane.showInputDialog("digite a base: ")));
        setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: ")));
            
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null,"A base é: "+getBase());
        JOptionPane.showMessageDialog(null,"A altura é: ");
         
    }
    public String paraString(){
        return (super.paraString() + "/base: "+getBase() +"/altura = "+getAltura());
    }
    public double getArea(){
        return ((getBase()*getAltura())/2);
    }
    
    
    
        
}

