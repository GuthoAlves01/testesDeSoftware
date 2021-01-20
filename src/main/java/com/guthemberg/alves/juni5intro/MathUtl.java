/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guthemberg.alves.juni5intro;

/**
 *
 * @author frist
 */
public class MathUtl {

    public static int mdc1(int a, int b) {
        if(b > 0 && a % b ==0){
            return b;
        }
        if(b==0){
            return Math.abs(a);
        }
        return -1;
    } 
}
