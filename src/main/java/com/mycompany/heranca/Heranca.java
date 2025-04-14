/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author 10725116225
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca;

public class Heranca{
    public static void main(String[] args) {
        Triangulo Triangulo = new Triangulo();
        Triangulo.leitura();
        System.out.println("area do triângulo:" + Triangulo.getArea());
        
        Circulo  circulo = new Circulo("Branco",3);
        System.out.println(circulo.paraString());
        System.out.println("area do círculo:" + circulo.getArea());
    }
}