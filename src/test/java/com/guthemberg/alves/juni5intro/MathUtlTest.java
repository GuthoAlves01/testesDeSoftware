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
        final int atual = MathUtl.mdc1(a,b);
        assertEquals(esperado, atual);
    }
    @Test
    public void testMdcAImppar1() {
        final int a = 9;
        final int b = 3;
        final int esperado = 3;
        final int atual = MathUtl.mdc1(a,b);
        assertEquals(esperado, atual);
    }
    

}
