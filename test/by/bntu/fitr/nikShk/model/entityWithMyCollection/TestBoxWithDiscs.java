/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.entityWithMyCollection;

import by.bntu.fitr.nikShk.model.entutyWithMyCollection.BoxWithDiscs;
import by.bntu.fitr.nikShk.model.entutyWithMyCollection.AudioList;
import by.bntu.fitr.nikShk.exception.DiscsIndexException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author niksk
 */
public class TestBoxWithDiscs {
    public BoxWithDiscs box;
    
    
    public TestBoxWithDiscs() {
    }
        
    @Before
    public void setUp() {
        this.box = new BoxWithDiscs("Test");
        this.box.addAudioList(new AudioList());
        this.box.addAudioList(new AudioList());
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCreate(){
        assertNotNull(this.box);
    }
    
    @Test
    public void testAdd(){
        this.box.addAudioList(new AudioList());
        assertEquals(3, this.box.qntAudioList());
    }
    
    @Test
    public void testGet() throws DiscsIndexException{
        AudioList a = this.box.getAudioListOfIndex(0);
        assertNotNull(a);
    }
    
    @Test (expected = DiscsIndexException.class)
    public void test() throws DiscsIndexException{
        AudioList a = this.box.getAudioListOfIndex(-3);
    }
    
    @Test
    public void testSet(){
        AudioList expect = new AudioList("Vasia");
        this.box.setAudioListOfIndex(expect, 0);
        assertEquals(expect, this.box.getAudioListOfIndex(0));

    }
    
    @Test(expected = DiscsIndexException.class)
    public void testSetExc(){
        this.box.setAudioListOfIndex(new AudioList(), -3);
    }
}
