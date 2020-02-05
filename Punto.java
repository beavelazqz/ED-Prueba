/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nogal.ud7;

/**
 *
 * @author enrique.nogal
 */
public class Punto {

    private int x;
    private int y;

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }

    
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = 0;
        this.y = 0;
    }
    
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void imprimirPunto() {
        System.out.println(this.x + ":" + this.y);
    }
    
    public void moverPunto() {
        this.x = 0;
        this.y = 0;
    }
    
    public void moverPunto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void moverPunto(String txt, int x){
        this.x = x;
        this.y = 0;
        System.out.println(txt);
    }
    
    public void moverPunto(int y, String txt){
        this.x = 0;
        this.y = y;
        System.out.println(txt);
    }

}
