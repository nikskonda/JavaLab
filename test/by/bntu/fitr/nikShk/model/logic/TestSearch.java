/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.logic;

import by.bntu.fitr.nikShk.model.entity.RockSong;
import by.bntu.fitr.nikShk.model.entity.Song;
import by.bntu.fitr.nikShk.model.entity.TypesOfSearch;
import by.bntu.fitr.nikShk.model.entityWithCollection.AudioList;
import by.bntu.fitr.nikShk.model.entityWithCollection.BoxWithDiscs;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author niksk
 */
public class TestSearch {
    BoxWithDiscs box = new BoxWithDiscs("Test");
    Song s1;
    RockSong s2;
    Song s3;

    public TestSearch() {
    }
    
    @Before
    public void setUp() {
        AudioList a1 = new AudioList("Kek");
        s1 = new Song("Kek", "Remix", 14);
        s2 = new RockSong("Q", 14, 1, 2);
        s3 = new Song("W", "R", 15);
        a1.addSong(s1);
        a1.addSong(s2);
        a1.addSong(s3);
        box.addAudioList(a1);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSearch1(){
        ArrayList<Song> s = (ArrayList<Song>)Search.search(box, TypesOfSearch.SONG_NAME, "Kek");
        assertEquals(s1, s.get(0));
    }
    
    @Test
    public void testSearch2(){
        ArrayList<Song> s = (ArrayList<Song>)Search.search(box, TypesOfSearch.SONG_TYPE, "Remix");
        assertEquals(s1, s.get(0));
    }
    
    @Test
    public void testSearch3(){
        ArrayList<Song> s = (ArrayList<Song>)Search.search(box, TypesOfSearch.SONG, s1);
        assertEquals(s1, s.get(0));
    }
    
    @Test
    public void testSearch4(){
        ArrayList<Song> s = (ArrayList<Song>)Search.search(box, TypesOfSearch.SONG_TIME, 15);
        assertEquals(s3, s.get(0));
    }
    
    @Test
    public void testSearch5(){
        ArrayList<Song> s = (ArrayList<Song>)Search.search(box, TypesOfSearch.SONG_TYPE, "Rock");
        assertEquals(s2, s.get(0));
    }
}
