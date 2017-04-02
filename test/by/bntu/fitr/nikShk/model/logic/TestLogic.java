/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import by.bntu.fitr.nikShk.model.entity.*;

/**
 *
 * @author niksk
 */
public class TestLogic {
    public BoxWithDiscs box;
    
    
    public TestLogic() {
    }
    
    
    @Before
    public void setUp() {
        this.box = new BoxWithDiscs();
        AudioList a1 = new AudioList();
        a1.addSong(new Song("Q", "W", 10));
        a1.addSong(new ClassicSong("Q", 20, 0, 0));
        a1.addSong(new RapSong("", 30, 0));
        this.box.addAudioList(a1);
        AudioList a2 = new AudioList();
        a1.addSong(new RockSong("", 23, 0, 0));     
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testLogic(){
        assertEquals(83, Logic.calcTime(box));     
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
