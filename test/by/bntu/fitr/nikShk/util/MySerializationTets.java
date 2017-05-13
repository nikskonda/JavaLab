/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.util;

import by.bntu.fitr.nikShk.model.entityWithCollection.BoxWithDiscs;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author niksk
 */
public class MySerializationTets {
    BoxWithDiscs box;
    public MySerializationTets() {
    }
    @Before
    public void setUp() {
        box = Generate.creatBox("Boxes");
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void readTest(){
        Serialization.writeObjeck(box, "box.dat");
        System.out.println(this.box.getAudioListOfIndex(0));
        System.out.println(Serialization.readObject("box.dat").getAudioListOfIndex(0));
        assertEquals(this.box.getAudioListOfIndex(0), Serialization.readObject("box.dat").getAudioListOfIndex(0));       
    }
    
     @Test(expected = Exception.class)
    public void readTestEx(){
        Serialization.writeObjeck(box, "box.dat");
//        System.out.println(this.box.getAudioListOfIndex(0));
        System.out.println(Serialization.readObject("b.dat").getAudioListOfIndex(0));     
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
