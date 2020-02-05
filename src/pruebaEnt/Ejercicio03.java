/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nogal.ud6.ej1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author enrique.nogal
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> al = new ArrayList<Double>();
        double d;
        
//        al.add(3.2);al.add(4.6);al.add(-7.0);al.add(-50d);al.add(0.0);al.add(11.0);al.add(14.0);al.add(88d);al.add(24.0);
//        al.add(3.2);al.add(4.6);al.add(-7.0);al.add(-50d);al.add(0.0);al.add(11.0);al.add(14.0);al.add(88d);al.add(24.0);
//        al.add(3.2);al.add(4.6);al.add(-7.0);al.add(-50d);al.add(0.0);al.add(11.0);al.add(14.0);al.add(88d);al.add(24.0);
//        al.add(3.2);al.add(4.6);al.add(-7.0);al.add(-50d);al.add(0.0);al.add(11.0);al.add(14.0);al.add(88d);al.add(24.0);
//        al.add(3.2);al.add(4.6);al.add(-7.0);al.add(-50d);al.add(0.0);al.add(11.0);al.add(14.0);al.add(88d);al.add(24.0);
//        al.add(3.2);al.add(4.6);al.add(-7.0);al.add(-50d);al.add(0.0);al.add(11.0);al.add(14.0);al.add(88d);al.add(24.0);
//        al.add(3.2);al.add(4.6);al.add(-7.0);al.add(-50d);al.add(0.0);al.add(11.0);al.add(14.0);al.add(88d);al.add(24.0);
//        al.add(3.2);al.add(4.6);al.add(-7.0);al.add(-50d);al.add(0.0);al.add(11.0);al.add(14.0);al.add(88d);al.add(24.0);
//        al.add(3.2);al.add(4.6);al.add(-7.0);al.add(-50d);al.add(0.0);al.add(11.0);al.add(14.0);al.add(88d);al.add(24.0);

        for (int i = 0; i < 10; i++) {
            d = Double.parseDouble(sc.nextLine());
            al.add(d);
        }


        for (int i = 0; i < al.size(); i++) {
            if (al.get(i)<=10) {
                System.out.println("X[" + i + "]="+al.get(i));
            }
        }
        
    }
    
}
