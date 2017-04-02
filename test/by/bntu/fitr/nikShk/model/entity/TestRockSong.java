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
public class TestRockSong {

    public TestRockSong() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testRockSongCreateWithoutParam() {
        RockSong s = new RockSong();
        assertNotNull(s);
    }

    @Test
    public void testRockSongCreateWithParam() {
        RockSong s = new RockSong("W", 4, 8, 3);
        assertNotNull(s);
    }

    @Test
    public void testSongName() {
        String str = "Q";
        RockSong s = new RockSong("Q", 0, 0, 0);
        assertEquals(str, s.getName());
    }

    @Test
    public void testSongTime() {
        int expect = 13;
        RockSong s = new RockSong("", 13, 0, 0);
        assertEquals(expect, s.getTime());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testExept() {
        RockSong s = new RockSong();
        s.setGitars(-100);
    }
    
    @Test (expected = IndexOutOfBoundsException.class)
    public void testSongTimeExept(){
        ClassicSong s = new ClassicSong();
        s.setTime(0);
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testDrumExept() {
        RockSong s = new RockSong();
        s.setDrumbabum(-100);
    }
    
}
