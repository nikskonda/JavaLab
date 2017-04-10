/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.controller;

import by.bntu.fitr.nikShk.Printer.Printer;
import by.bntu.fitr.nikShk.model.entity.Song;
import by.bntu.fitr.nikShk.model.entity.TypesOfSearch;
import by.bntu.fitr.nikShk.model.entity.TypesOfSorts;
import by.bntu.fitr.nikShk.model.logic.Sorter;
import by.bntu.fitr.nikShk.model.entityWithCollection.*;
import by.bntu.fitr.nikShk.model.logic.Search;
import by.bntu.fitr.nikShk.util.Generate;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javafx.print.Collation;




/**
 *
 * @author niksk
 */
public class Controller{
    public static void main(String[] args) {
        BoxWithDiscs box = Generate.creatBox("Test");
        Sorter.sort(box, TypesOfSorts.TIME_DEC);
        System.out.println(box);
//        AudioList al = new AudioList();
//        box.addAudioList(al);
//        System.out.println(box);
        List<Song> a = 
            Search.search(box, TypesOfSearch.AUDIOLIST, "VikVik");
        for (Object obj:a){
            Printer.printer(obj+"");
        }
    }
}
