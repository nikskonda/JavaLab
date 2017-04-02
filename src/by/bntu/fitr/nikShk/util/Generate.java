/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.util;

import by.bntu.fitr.nikShk.model.entity.*;
import java.util.Random;

/**
 *
 * @author niksk
 */
public class Generate {
    public static by.bntu.fitr.nikShk.model.entityWithCollection.BoxWithDiscs creatBox(String nameBox) {     
        by.bntu.fitr.nikShk.model.entityWithCollection.BoxWithDiscs box = new by.bntu.fitr.nikShk.model.entityWithCollection.BoxWithDiscs(nameBox);
        int qnt = genInt(5, 10);
        for (int j = 0; j< qnt; j++){
            String[] name = new String[]{"Best audio", "VikVIk audio", "Sinitsa audios", "Lenovo", "NikAudio", "CarAudio"};
            by.bntu.fitr.nikShk.model.entityWithCollection.AudioList a = new by.bntu.fitr.nikShk.model.entityWithCollection.AudioList(name[genInt(0, name.length)]);
            int len = genInt(5, 10);
            String[] nameSinger = new String[]{"Live", "Big tree ", "BNTU", "LitleBig", 
                "MOGILEV forewre", "Gomel forewer", "PineApple", "AAAAA"};
            for (int i = 0; i < len; i++) {
                switch (genInt(0, 4)) {
                    case 0:
                        a.addSong(new Song(nameSinger[genInt(0, nameSinger.length)], "Remix", genInt(60, 300)));
                        break;
                    case 1:
                        a.addSong(new RockSong(nameSinger[genInt(0, 8)], genInt(60, 300), genInt(1, 10), genInt(1, 10)));
                        break;
                    case 2:
                        a.addSong(new ClassicSong(nameSinger[genInt(0, 8)], genInt(60, 300), genInt(1, 10), genInt(1, 10)));                  
                        break;
                    default:
                        a.addSong(new RapSong(nameSinger[genInt(0, 8)],genInt(60, 300), genInt(1, 10)));                 
                        break;
                }
            }
            box.addAudioList(a);
        }
        return box;
    }

    private static int genInt(int min, int max) {
        Random random = new Random();
        return min + random.nextInt(max - min);
    }
}
