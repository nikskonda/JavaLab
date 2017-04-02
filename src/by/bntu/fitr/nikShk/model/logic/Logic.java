/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.logic;

import by.bntu.fitr.nikShk.model.entity.AudioList;
import by.bntu.fitr.nikShk.model.entity.BoxWithDiscs;

/**
 *
 * @author niksk
 */
public class Logic {
    public static int calcTime(BoxWithDiscs box){
        int time = 0;
        int len = box.qntAudioList();
        for (int i = 0; i<len; i++){
            AudioList a = box.getAudioListOfIndex(i);
            int qntAudio = a.qntSongs();          
            for (int j = 0; j<qntAudio; j++){
                time+=a.getSongOfIndex(j).getTime();
            }              
        }       
        return time;
    }
}
