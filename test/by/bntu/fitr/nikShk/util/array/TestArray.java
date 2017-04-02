/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.util.array;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author niksk
 */
public class TestArray {
    
    public Array<Integer> a;
    
    public TestArray() {
    }
    
    @Before
    public void setUp() {
        a = new Array(new Integer[] {1,2,3});
        a.addObject(4);
        a.addObject(6);
        a.addObject(2);
        a.addObject(3);
     }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void testQnt(){
        int expect = 7;
        assertEquals(expect, this.a.qntObjects());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
