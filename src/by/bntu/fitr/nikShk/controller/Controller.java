/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.controller;

import by.bntu.fitr.nikShk.Printer.PrintLog;
import by.bntu.fitr.nikShk.Printer.Printer;
import by.bntu.fitr.nikShk.model.entity.Song;
import by.bntu.fitr.nikShk.model.entity.TypesOfSearch;
import by.bntu.fitr.nikShk.model.entity.TypesOfSorts;
import by.bntu.fitr.nikShk.model.logic.Sorter;
import by.bntu.fitr.nikShk.model.*;
import by.bntu.fitr.nikShk.model.entity.SongsConst;
import by.bntu.fitr.nikShk.model.entityWithCollection.BoxWithDiscs;
import by.bntu.fitr.nikShk.model.logic.Search;
import by.bntu.fitr.nikShk.util.CustomSerialization;
import by.bntu.fitr.nikShk.util.Generate;
import by.bntu.fitr.nikShk.util.MySerialization;
import by.bntu.fitr.nikShk.util.RWTxtFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javafx.print.Collation;
import org.apache.log4j.Logger;




/**
 *
 * @author niksk
 */
public class Controller{
    
    private static final Logger LOGGER = Logger.getLogger(Controller.class);
    
    public static void main(String[] args) {
//        BoxWithDiscs box = Generate.creatBox("лоЛ");
//        System.out.println(box);
//        Sorter.sort(box, TypesOfSorts.TIME_DEC);
//        System.out.println(box);
////        AudioList al = new AudioList();
////        box.addAudioList(al);
////        System.out.println(box);
//        List<Song> a = 
//            Search.search(box, TypesOfSearch.AUDIOLIST, "VikVik");
//        for (Object obj:a){
//            Printer.printer(obj+"");
//        }
//        String s = "kek";
//        MySerialization.writeObject(s, "kek.bin");
//        System.out.println(MySerialization.readObject("kek.bin"));
//        RWTxtFile.writeInTxtFile(s, "kek.txt");
//        System.out.println(RWTxtFile.readFromTxtFile("kek.txt"));


//        BoxWithDiscs box = new BoxWithDiscs("Kek");
//        box.addAudioList(new AudioList("Vik"));
//        CustomSerialization.writeObjeck(box, "kek.bin");
//        System.out.println("\n**\n"+CustomSerialization.readObject("kek.bin"));

        PrintLog.printLogInfo("Hello world!", LOGGER);
        try{
           int i = 1/0; 
        } catch (Exception ex){
            PrintLog.printLogWarn(ex.toString(), LOGGER);
        }
        System.out.println("kek");

    }
}
