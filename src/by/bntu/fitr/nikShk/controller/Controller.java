/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.controller;

import by.bntu.fitr.nikShk.model.entity.Song;
import by.bntu.fitr.nikShk.model.entity.TypesOfSorts;
import by.bntu.fitr.nikShk.model.logic.Sorter;
import by.bntu.fitr.nikShk.model.entityWithCollection.*;
import by.bntu.fitr.nikShk.util.Generate;
import java.util.Collection;
import javafx.print.Collation;




/**
 *
 * @author niksk
 */
public class Controller {
    public static void main(String[] args) {
        AudioList a = new AudioList("Test");
        a.addSong(new Song("A", "4", 4));
        a.addSong(new Song("B", "2", 1));
        a.addSong(new Song("D", "3", 3));
        a.addSong(new Song("C", "Q", 2));
        System.out.println(a+"\n");
        for (Song s:a){
            System.out.println(s);
        }
        BoxWithDiscs box = Generate.creatBox("Test");       
//        System.out.println(box);
//        Sorter.sort(box, TypesOfSorts.NAME_ASC);
//        System.out.println(box);
//        Sorter.sort(box, TypesOfSorts.TIME_DEC);
//        System.out.println(box);
        
        for (AudioList a1 : box){
            System.out.println(a1);
        }
        }
}
