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
public class TestQueue {

    private Queue<Integer> q;

    public TestQueue() {
    }

    @Before
    public void setUp() {
        q = new Queue();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSize() {
        int expect = 0;
        assertEquals(expect, q.qntObject());
    }

    @Test
    public void testAdd() {
        q.add(4);
        q.add(2);
        int expect = 2;
        System.out.println(q);
        assertEquals(expect, q.qntObject());
    }

    @Test
    public void testGet() {
        q.add(3);
        q.add(4);
        q.add(2);
        Integer expect = 3;
        System.out.println(q);
        assertEquals(expect, q.get());
    }

    @Test
    public void testCut() {
        q.add(3);
        q.add(4);
        q.add(2);
        int expect1 = 2;
        Integer expect2 = 3;
        System.out.println(q);
        assertEquals(expect2, q.cut());
        assertEquals(expect1, q.qntObject());
    }

    @Test
    public void testRemove() {
        q.add(1);
        q.add(2);
        q.add(3);
        int expect = 2;
        System.out.println(q);
        q.remove();
        assertEquals(expect, q.qntObject());
    }

    @Test
    public void testGetNull() {
        assertNull(q.get());
    }

    @Test
    public void testCutNull() {
        assertNull(q.cut());
    }

    @Test
    public void testGetAsArray() {
        Integer[] a = {1, 2, 3};
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("***\n");
        System.out.println(q);
        assertArrayEquals(a, q.getAsArray());
    }

    @Test
    public void testCreatArray() {
        Integer[] a = {1, 2, 3};
        Queue<Integer> b = new Queue<>(a);
        System.out.println(b);
        int expect = 3;
        assertEquals(expect, b.qntObject());
    }

    @Test
    public void testGetAsArrayAndClear() {
        Integer[] a = {1, 2, 3};
        q.add(1);
        q.add(2);
        q.add(3);
        assertArrayEquals(a, q.getAsArrayAndClear());
        int expect = 0;
        assertEquals(expect, q.qntObject());
    }

}
