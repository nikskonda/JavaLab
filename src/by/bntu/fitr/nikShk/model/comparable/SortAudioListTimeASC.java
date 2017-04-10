/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.comparable;

import by.bntu.fitr.nikShk.model.entityWithCollection.AudioList;
import java.util.Comparator;

/**
 *
 * @author niksk
 */
public class SortAudioListTimeASC implements Comparator<AudioList>{

    @Override
    public int compare(AudioList o1, AudioList o2) {
        return o1.getTimeAll() - o2.getTimeAll();
    }
    
}
