/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.logic;

import by.bntu.fitr.nikShk.model.comparable.SortAudioListNameASC;
import by.bntu.fitr.nikShk.model.comparable.SortAudioListNameDEC;
import by.bntu.fitr.nikShk.model.comparable.SortAudioListTimeASC;
import by.bntu.fitr.nikShk.model.comparable.SortAudioListTimeDEC;
import by.bntu.fitr.nikShk.model.entity.Song;
//import by.bntu.fitr.nikShk.model.entityWithCollection.AudioList;
import by.bntu.fitr.nikShk.model.entity.TypesOfSorts;
import by.bntu.fitr.nikShk.model.entityWithCollection.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author niksk
 */
public class Sorter {
//    public static void sort(AudioList audioList, TypesOfSorts sort){
//        switch (sort){
//            case NAME_ASC:
//                Collections.sort((List<Song>) audioList.getSongs(), new Comparator<Song>() {
//                    @Override
//                    public int compare(Song o1, Song o2) {
//                        return o1.getName().compareTo(o2.getName());
//                    }
//                });
//                break;
//            case NAME_DEC:
//                Collections.sort((List<Song>) audioList.getSongs(), new Comparator<Song>() {
//                    @Override
//                    public int compare(Song o1, Song o2) {
//                        return o2.getName().compareTo(o1.getName());
//                    }
//                });
//                break;
//            case TIME_ASC:
//                Collections.sort((List<Song>) audioList.getSongs(), new Comparator<Song>() {
//                    @Override
//                    public int compare(Song o1, Song o2) {
//                        return o1.getTime() - o2.getTime();
//                    }
//                });
//                break;
//            case TIME_DEC:
//                Collections.sort((List<Song>) audioList.getSongs(), new Comparator<Song>() {
//                    @Override
//                    public int compare(Song o1, Song o2) {
//                        return o2.getTime() - o1.getTime();
//                    }
//                });
//                break;
//            case TYPE_ASC:
//                Collections.sort((List<Song>) audioList.getSongs(), new Comparator<Song>() {
//                    @Override
//                    public int compare(Song o1, Song o2) {
//                        return o1.getType().compareTo(o2.getType());
//                    }
//                });
//                break;
//            case TYPE_DEC:
//                Collections.sort((List<Song>) audioList.getSongs(), new Comparator<Song>() {
//                    @Override
//                    public int compare(Song o1, Song o2) {
//                        return o2.getType().compareTo(o1.getType());
//                    }
//                }); 
//               break;    
//        }
//    }
    
    public static void sort(BoxWithDiscs box, TypesOfSorts sort){
        switch (sort){
            case NAME_ASC:
                Collections.sort((List<AudioList>) box.getAudioLists(), new SortAudioListNameASC());
                break;
            case NAME_DEC:
                Collections.sort((List<AudioList>) box.getAudioLists(), new SortAudioListNameDEC());
                break; 
            case TIME_ASC:
                Collections.sort((List<AudioList>) box.getAudioLists(), new SortAudioListTimeASC());
                break;
            case TIME_DEC:
                Collections.sort((List<AudioList>) box.getAudioLists(), new SortAudioListTimeDEC());
                break;
        }
    }
}
