/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.util;

import by.bntu.fitr.nikShk.model.entityWithCollection.BoxWithDiscs;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author niksk
 */
public class RWTxtFileTest {
    
    public RWTxtFileTest() {
    }
    
    @Test
    public void testRW(){
        BoxWithDiscs box  = Generate.creatBox("Vasilii");
        String fileName = "kek.txt";
        RWTxtFile.writeInTxtFile(box.toString(), fileName);       
        assertEquals(box.toString(), RWTxtFile.readFromTxtFile("kek.txt"));
    }
    
    @Test (expected = FileNotFoundException.class)
    public void testRWEx(){
        BoxWithDiscs box  = Generate.creatBox("Vasilii");
        String fileName = "kek.txt";
        RWTxtFile.writeInTxtFile(box.toString(), fileName);       
        RWTxtFile.readFromTxtFile("kek1.txt");
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
