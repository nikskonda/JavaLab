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
public class RWTxtFile {
    public static void writeInTxtFile(String msg, String fileName){
        try{
            FileWriter writer = new FileWriter(fileName);
            writer.write(msg);
            
            writer.flush();
        }
        catch(IOException ex){
             
            Printer.printer(ex.toString());
        } 
    }
    
    public static String readFromTxtFile(String fileName){
        String msg = "";
        try {
            FileReader reader = new FileReader(fileName);
            int c = 0;
            while ((c = reader.read())!=-1){
                msg+=(char)c;
            }
        }catch (Exception ex){
            Printer.printer(ex.toString());
        } finally{
            return msg; 
        }

    }
    
}
