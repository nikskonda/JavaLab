/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.util;

import by.bntu.fitr.nikShk.Printer.Printer;
import by.bntu.fitr.nikShk.model.entityWithCollection.BoxWithDiscs;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author niksk
 */
public class Serialization {

    public static BoxWithDiscs readObject(String url) {
        BoxWithDiscs box = new BoxWithDiscs();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(url))) {
            box = (BoxWithDiscs) ois.readObject();
            return box;
        } catch (Exception ex) {
            Printer.printer("File error\n");
            return box;
        }
    }

    public static void writeObjeck(BoxWithDiscs box, String url) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(url))) {
            oos.writeObject(box);
        } catch (Exception e) {
            Printer.printer("File error\n" + e);
        }
    }
}
