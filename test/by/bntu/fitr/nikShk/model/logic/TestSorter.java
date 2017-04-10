/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.logic;

import by.bntu.fitr.nikShk.model.entity.TypesOfSorts;
import by.bntu.fitr.nikShk.model.entityWithCollection.AudioList;
import by.bntu.fitr.nikShk.model.entityWithCollection.BoxWithDiscs;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author niksk
 */
public class TestSorter {
    
    BoxWithDiscs box = new BoxWithDiscs("Test");
    AudioList a1 = new AudioList("A");
    AudioList a2 = new AudioList("B");
    AudioList a3 = new AudioList("C");
    AudioList a4 = new AudioList("D");
    
    public TestSorter() {
    }
    
    @Before
    public void setUp() {
        box.addAudioList(a1);
        box.addAudioList(a4);
        box.addAudioList(a2);
        box.addAudioList(a3);
    }
    
    @Test
    public void testSortACS(){
//        BoxWithDiscs box2 = new BoxWithDiscs("Test");
//        box2.addAudioList(a1);
//        box2.addAudioList(a2);
//        box2.addAudioList(a3);
//        box2.addAudioList(a4);
        Sorter.sort(box, TypesOfSorts.NAME_ASC);
//        assertEquals(box2, box);
        assertEquals(a1, this.box.getAudioListOfIndex(0));
        assertEquals(a2, this.box.getAudioListOfIndex(1));
        assertEquals(a3, this.box.getAudioListOfIndex(2));
        assertEquals(a4, this.box.getAudioListOfIndex(3));
    }
    
    @Test
    public void testSortDEC(){
        Sorter.sort(box, TypesOfSorts.NAME_DEC);
//        assertEquals(box2, box);
        assertEquals(a1, this.box.getAudioListOfIndex(3));
        assertEquals(a2, this.box.getAudioListOfIndex(2));
        assertEquals(a3, this.box.getAudioListOfIndex(1));
        assertEquals(a4, this.box.getAudioListOfIndex(0));
    }

    
}
