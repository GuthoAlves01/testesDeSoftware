/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guthemberg.alves.juni5intro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author frist
 */
public class MathUtlTest {

    @Test
    public void testMdcAPar1() {
        final int a = 6;
        final int b = 3;
        final int esperado = 3;
        final int atual = MathUtl.mdc(a,b);
        assertEquals(esperado, atual);
    }
    @Test
    public void testMdcAImppar1() {
        final int a = 9;
        final int b = 3;
        final int esperado = 3;
        final int atual = MathUtl.mdc(a,b);
        assertEquals(esperado, atual);
    }
    @Test
    public void testMdc2() {
        final int a = 16;
        final int b = 8;
        final int divisor = 4; 
        final int atual = MathUtl.mdc(a,b);
        assertTrue(atual % divisor==0);
    }
    
    @Test
    public void testMdc3APositivo() {
        final int a = 15;
        final int b = 0; 
        final int esperado = 15;
        final int atual = MathUtl.mdc(a,b);
        assertEquals(esperado, atual);

    }
    @Test
    public void testMdc3ANegativo() {
        final int a = -30;
        final int b = 0; 
        final int esperado = 30;
        final int atual = MathUtl.mdc(a,b);
        assertEquals(esperado, atual);

    }
    
    @Test
    public void testMdc4(){
        final int a = 9;
        final int b = 3;
        final int c = 2;
        final int esperado = MathUtl.mdc(a*c, b*c);
        final int atual = c*MathUtl.mdc(a, b);
        assertEquals(esperado, atual);
        
    }
    
    @Test
    public void testMdc5(){
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = MathUtl.mdc(a*b, c);
        final int atual = MathUtl.mdc(b, c);
        assertEquals(esperado, atual);
        
    }
    
     @Test
    public void testMdc5Resto1(){
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = 1;
        final int atual = MathUtl.mdc(b, c);
        assertEquals(esperado, atual);
    }
    @Test
    public void testMdc6(){
        final int a = 8;
        final int b = 2;
        final int esperado = MathUtl.mdc(a, b);
        final int atual = MathUtl.mdc(b, a);
        assertEquals(esperado, atual);
    }
    @Test
    public void testMdc6tst2(){
        final int a = 10;
        final int b = 16;
        final int esperado = 2;
        final int atual = MathUtl.mdc(a, b);
        assertEquals(esperado, atual);
    }
    @Test
    public void testMdc7(){
        final int a = -8;
        final int b = -2;
        final int esperado = 2;
        final int atual = MathUtl.mdc(a, b);
        assertEquals(esperado, atual);
    }
    @Test
    public void testMdc7test2(){
        final int a = -10;
        final int b = -16;
        final int esperado = 2;
        final int atual = MathUtl.mdc(a, b);
        assertEquals(esperado, atual);
    }
    @Test
    public void testMdc8(){
        final int a = 5;
        
        final int esperado = a;
        final int atual = MathUtl.mdc(a, a);
        assertEquals(esperado, atual);
    }
    
    @Test
    public void testMdc9(){
        int[] valores = new int[3];
        valores[0] = 10;
        valores[1] = 16;
        valores[2] = 30;
        
        final int esperado = 2;
        int atual = MathUtl.mdc(valores);
        assertEquals(esperado, atual);
    }
    
    @Test
    public void testMdc12Primo2(){
        final int p = 2;
        final int a = 15;
        final int esperado = 1;
        final int atual = MathUtl.mdc(p, a);
        assertEquals(esperado, atual);
    }
    @Test
    public void testMdc12Primo3(){
        final int p = 3;
        final int a = 13;
        final int esperado = 1;
        final int atual = MathUtl.mdc(p, a);
        assertEquals(esperado, atual);
    }
    @Test
    public void testMdc12Primo5(){
        final int p = 5;
        final int a = 15;
        final int esperado = 5;
        final int atual = MathUtl.mdc(p, a);
        assertEquals(esperado, atual);
    }
    @Test
    public void testMdc12Primo23(){
        final int p = 23;
        final int a = 15;
        final int esperado = 1;
        final int atual = MathUtl.mdc(p, a);
        assertEquals(esperado, atual);
    }
    @Test
    public void testMdc13SParam(){
        assertThrows(IllegalArgumentException.class, ()->MathUtl.mdc());
    }
    @Test
    public void testMdc13CParamNull(){
//        MathUtl.mdc(null);
        assertThrows(NullPointerException.class, ()->MathUtl.mdc(null));
        
    }

}
