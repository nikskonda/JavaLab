/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.entityWithMyCollection;

import by.bntu.fitr.nikShk.model.entutyWithMyCollection.AudioList;
import by.bntu.fitr.nikShk.exception.AudioListIndexException;
import by.bntu.fitr.nikShk.model.entity.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author niksk
 */
public class TestAudioList {
    public AudioList a;
    
    
    public TestAudioList() {
    }
        
    @Before
    public void setUp() {
        a = new AudioList("Test");
        a.addSong(new RockSong());
        a.addSong(new RapSong());
        a.addSong(new ClassicSong());
    }
    
    
    @Test
    public void testCreate(){
        assertNotNull(this.a);
    }
    
    @Test
    public void testAdd(){
        this.a.addSong(new Song());
        System.out.println(this.a);
        assertEquals(4, this.a.qntSongs());
    }
    
    
    @Test
    public void testGet(){
        Song s = this.a.getSongOfIndex(0);
        assertNotNull(s);
    }
    
    @Test(expected = AudioListIndexException.class)
    public void testGetExc(){
        Song s = this.a.getSongOfIndex(-3);
    }
    
    @Test
    public void testSet(){
        Song expect = new Song("Name", Types.REMIX.toString(), 10);
        this.a.setSongOfIndex(expect, 0);
        assertEquals(expect, this.a.getSongOfIndex(0));
    }
    
    @Test(expected = AudioListIndexException.class)
    public void testSetExc(){
        this.a.setSongOfIndex(new Song(), -3);
    }
    
}
