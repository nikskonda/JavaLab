/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.controller;

import by.bntu.fitr.nikShk.model.entity.*;
import by.bntu.fitr.nikShk.model.testEntity.AudioList;



/**
 *
 * @author niksk
 */
public class Controller {
    public static void main(String[] args) {
        AudioList a = new AudioList("Test");
        a.addSong(new RockSong());
        a.addSong(new RapSong());
        a.addSong(new ClassicSong());
        System.out.println(a+"\n");
        System.out.println(a.getSongOfIndex(0));
    }
}
