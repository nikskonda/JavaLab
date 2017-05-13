/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.bntu.fitr.nikShk.util;

import by.bntu.fitr.nikShk.Printer.Printer;
import java.io.*;
/**
 *
 * @author niksk
 */
public class MySerialization {
    public static void writeObject(Object obj, String fileName){
        ObjectOutputStream o = null;
        try{ 
            o = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(fileName)));
            o.writeObject("kek");
            o.close();
        }catch (Exception ex){
            Printer.printer(ex.toString());
            
        }
    }
    
    public static Object readObject(String fileName){
        ObjectInputStream i = null;
        Object obj = null;
        try{ 
            i = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(fileName)));
            obj = i.readObject();
            i.close();
        }catch (Exception ex){
            Printer.printer(ex.toString());
        } finally {
            return obj;
        }
    }
}
