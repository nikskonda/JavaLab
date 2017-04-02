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
public class TestClassicSong {

    public TestClassicSong() {
    }

    @Test
    public void testClassicSongCreateWithoutParam() {
        ClassicSong s = new ClassicSong();
        assertNotNull(s);
    }

    @Test
    public void testClassicSongCreateWithParam() {
        ClassicSong s = new ClassicSong();
        assertNotNull(s);
    }

    @Test
    public void testSongName() {
        String str = "Q";
        ClassicSong s = new ClassicSong("Q", 0, 0, 0);
        assertEquals(str, s.getName());
    }

    @Test
    public void testSongTime() {
        int expect = 13;
        ClassicSong s = new ClassicSong("", 13, 0, 0);
        assertEquals(expect, s.getTime());
    }
    
    @Test (expected = IndexOutOfBoundsException.class)
    public void testSongTimeExept(){
        ClassicSong s = new ClassicSong();
        s.setTime(0);
    }
    
    @Test (expected = IndexOutOfBoundsException.class)
    public void testSongPianoExept(){
        ClassicSong s = new ClassicSong();
        s.setPiano(-15);
    }
    
    @Test (expected = IndexOutOfBoundsException.class)
    public void testSongVioExept(){
        ClassicSong s = new ClassicSong();
        s.setVioline(-15);
    }
}
