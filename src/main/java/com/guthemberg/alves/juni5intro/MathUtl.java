/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guthemberg.alves.juni5intro;

import java.util.Objects;

/**
 *
 * @author frist
 */
public class MathUtl {
    
    //                       10,  16
    public static int mdc(int a, int b) {
//        if (a < b){
//            int c = b;
//            b = a;
//            a = c;
//        }
        //propriedade 7
        a = Math.abs(a);
        b = Math.abs(b);
        
        //propriedade 6
        //          16            10, 16
        final int maior = Math.max(a, b);
      //10         10, 16
        b = Math.min(a, b);
      //16
        a = maior;
      //  10       16 % 10 == 1,6 (não entra)
        if(b > 0 && a % b == 0){ // se b>0 e divisor de a
            return b;
        }
        
        //propriedade 1
        //10 != 0 (não entra)
        if(b == 0){
            return Math.abs(a);
        }
        
        //propriedade 3 e 9
        int mdc = 0; 
        while(a % b != 0 ){
            mdc = a % b;
            a = b;
            b = mdc;
        }
        if(mdc != 0){
            return mdc;
        }
        return -1;
    }
    public static int mdc(int ...valores ) {
        Objects.requireNonNull(valores, "mdc não aceita valor null como entrada");
        
        if(valores.length<1){
            throw new IllegalArgumentException("mdc requer no mínimo um argumento");
        }
        int a = valores[0];
        int cont=1;
        do {
            a = MathUtl.mdc(a, valores[cont]);
            cont++;
        } while (cont < valores.length);
        return a;
    }
   
}
