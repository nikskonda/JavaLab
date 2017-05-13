/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.util;

import by.bntu.fitr.nikShk.Printer.Printer;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author niksk
 */
public class CustomSerialization {
        public static Object readObject(String url) {
       Object o = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(url))) {
            o = ois.readObject();
        } catch (Exception ex) {
            Printer.printer("File error\n"+ex);
        }
        finally {
            return o;
        }
    }

    public static void writeObjeck(Object obj, String url) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(url))) {
            oos.writeObject(obj);
        } catch (Exception e) {
            Printer.printer("File error\n" + e);
        }
    }
}
