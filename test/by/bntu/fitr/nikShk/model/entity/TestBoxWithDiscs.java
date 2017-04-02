/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.entity;

import by.bntu.fitr.nikShk.exception.DiscsIndexException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
    public void testGet(){
        AudioList a = this.box.getAudioListOfIndex(0);
        assertNotNull(a);
    }
    
    @Test (expected = DiscsIndexException.class)
    public void testExc(){
        AudioList a = this.box.getAudioListOfIndex(-3);
    }
}
