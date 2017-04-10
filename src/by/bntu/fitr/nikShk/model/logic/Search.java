/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.logic;

import by.bntu.fitr.nikShk.model.entity.Song;
import by.bntu.fitr.nikShk.model.entity.TypesOfSearch;
import by.bntu.fitr.nikShk.model.entityWithCollection.AudioList;
import by.bntu.fitr.nikShk.model.entityWithCollection.BoxWithDiscs;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author niksk
 */
public class Search {

    public static /*ArrayList<Object>*/ List<Song> search(BoxWithDiscs box, TypesOfSearch type, Object search) {
        List<Song> answer = new ArrayList<>();
        switch (type) {
//            case AUDIOLIST: 
//                AudioList a = (AudioList) search;
//                for (AudioList audioList:box){
//                   if (audioList.equals(a)){
//                       answer.add(audioList);
//                   } 
//                }
//                break;
//            case AUDIOLIST_NAME:
//                String name = (String)search;
//                for (AudioList audioList:box){
//                    if (audioList.getName().equals(name)){
//                        answer.add(audioList);
//                    }
//                }
//                break;
            case SONG:
                Song s = (Song) search;
                for (AudioList audioList : box) {
                    for (Song song : audioList) {
                        if (song.equals(s)) {
                            answer.add(song);
                        }
                    }
                }
                break;
            case SONG_NAME:
                String nam = (String) search;
                for (AudioList audioList : box) {
                    for (Song song : audioList) {
                        if (song.getName().equals(nam)) {
                            answer.add(song);
                        }
                    }
                }
                break;
            case SONG_TIME:
                Integer i = (Integer) search;
                for (AudioList audioList : box) {
                    for (Song song : audioList) {
                        if (song.getTime() == (i)) {
                            answer.add(song);
                        }
                    }
                }
                break;
            case SONG_TYPE:
                String typeq = (String) search;
                for (AudioList audioList : box) {
                    for (Song song : audioList) {
                        if (song.getType().equals(typeq)) {
                            answer.add(song);
                        }
                    }
                }
                break;
        }
        return answer;
    }
}
