/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.entity;

import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author niksk
 */
public class SongTest {
    
    public SongTest() {
    }

    @Test
    public void testSongCreateWithoutParam(){
        Song s = new Song();
        Assert.assertNotNull(s);
    }
    
    @Test
    public void testSongCreateWithParam(){
        Song s = new Song("Q", "W", 1000);
        Assert.assertNotNull(s);
    }
    
    @Test
    public void testSongName(){
        String str = "Q";
        Song s = new Song("Q", "", 0);
        Assert.assertEquals(str,  s.getName());
    }
    
    @Test
    public void testSongType(){
        String str = "W";
        Song s = new Song("", "W", 0);
        Assert.assertEquals(str, s.getType());
    }
    
    @Test
    public void testSongTime(){
        int expect = 13;
        Song s = new Song("", "", 13);
        Assert.assertEquals(expect, s.getTime());
    }
    
    @Test (expected = IndexOutOfBoundsException.class)
    public void testSongTimeExept(){
        Song s = new Song();
        s.setTime(0);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
