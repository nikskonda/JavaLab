/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.testEntity;

import by.bntu.fitr.nikShk.exception.AudioListIndexException;
import by.bntu.fitr.nikShk.model.entity.Song;
import by.bntu.fitr.nikShk.util.array.Stack;

/**
 *
 * @author niksk
 */
public class AudioList {
    private String name;
    private Stack<Song> songs;
    
    public AudioList(){
        this.name = "AudioList";
        this.songs = new Stack<>();
    }
    
    public AudioList(String name){
        this.name = name;
        this.songs = new Stack<>();
    }
            
            
    public int qntSongs(){
        return songs.qntObject();
    }
    
    public void addSong(Song song){
        this.songs.add(song);
        
    }
    
    public Song getSongOfIndex(int index){
        Object[] tempO = this.songs.getAsArray();
        int len = this.songs.qntObject();
        Song[] temp = new Song[len];
        
        for (int i = 0; i<len;i++){
            temp[i] = (Song)tempO[i];                      
        }
        
        if (index >= 0 && index < temp.length) {
            return temp[index];
        } else {
            throw new AudioListIndexException();
        }
    }
    
    public void setSongOfIndex(Song song, int index){
        Object[] tempO = this.songs.getAsArray();
        int len = this.songs.qntObject();
        Song[] temp = new Song[len];
        
        for (int i = 0; i<len;i++){
            temp[i] = (Song)tempO[i];                      
        }
        
        if (index >= 0 && index < temp.length) {
            temp[index] = song;
            this.songs = new Stack<>(temp);
        } else {
            throw new AudioListIndexException();
        }
    }
    
    @Override
    public String toString(){       
        return this.songs.toString();
    }
}
