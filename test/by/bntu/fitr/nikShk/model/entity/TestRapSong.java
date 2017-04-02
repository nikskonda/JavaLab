/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.entity;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author niksk
 */
public class TestRapSong {
    
    public TestRapSong() {
    }

    @Test
    public void testRapSongCreateWithoutParam(){
        RapSong s = new RapSong();
        System.out.println(s);
        assertNotNull(s);
    }
    
    @Test
    public void testRapSongCreateWithParam(){
        RapSong s = new RapSong("R",613,623);
        assertNotNull(s);
    }
    
    @Test
    public void testSongName(){
        String str = "Q";
        RapSong s = new RapSong("Q",0, 0);
        assertEquals(str,  s.getName());
    }
   
    
    @Test
    public void testSongTime(){
        int expect = 13;
        RapSong s = new RapSong("", 13, 0);
        assertEquals(expect, s.getTime());
    }
    
    @Test (expected = IndexOutOfBoundsException.class)
    public void testSongTimeExept(){
        RapSong s = new RapSong();
        s.setTime(0);
    }
    
    @Test (expected = IndexOutOfBoundsException.class)
    public void testSongBitExept(){
        RapSong s = new RapSong();
        s.setBitboxers(-15);
    }
}
