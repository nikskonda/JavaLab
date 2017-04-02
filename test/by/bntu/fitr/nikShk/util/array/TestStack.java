/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.util.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author niksk
 */
public class TestStack {

    public TestStack() {
    }

    public Stack<Integer> i;

    @Before
    public void setUp() {
//        this.i = new Stack(new Integer[]{1, 2, 3});
        this.i = new Stack<>();
        this.i.add(1);
        this.i.add(2);
        this.i.add(3);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAdd() {
        this.i.add(4);
        int expect = 4;
        System.out.println(this.i);
        assertEquals(expect, this.i.qntObject());
    }

    @Test
    public void testRemove() {
        this.i.add(5);
        this.i.remove();
        this.i.remove();
        this.i.add(9);
        int expect = 3;
        System.out.println(this.i);
        assertEquals(expect, this.i.qntObject());
    }

    @Test
    public void testAddMany() {
        for (int i1 = 0; i1++ < 10;) {
            this.i.add(i1 * 10);
        }
        System.out.println(this.i);
        int expect = 13;
        assertEquals(expect, this.i.qntObject());
    }

    @Test
    public void testGet() {
        this.i.add(Integer.MAX_VALUE);
        System.out.println(this.i);
        assertEquals((Integer) Integer.MAX_VALUE, this.i.get());
    }

    @Test
    public void testGetAsArray() {
        Integer[] a = {1, 2, 3};
        System.out.println("***\n");
        System.out.println(i);
        assertArrayEquals(a, i.getAsArray());
    }

    @Test
    public void testCutNull() {
        Stack<Integer> in = new Stack();
        assertNull(in.cut());
    }
    
    
    @Test
    public void testGetAsArrayAndClear() {
        Integer[] a = {3, 2, 1};
        System.out.println(i);
        assertArrayEquals(a, i.getAsArrayAndClear());  
        int expect = 0;
        assertEquals(expect, i.qntObject());
    }

}
