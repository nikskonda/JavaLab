/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.entity;

import by.bntu.fitr.nikShk.exception.AudioListIndexException;

/**
 *
 * @author niksk
 */
public class AudioList {
    private String name;
    private Song[] songs;
    
    public AudioList(){
        this.name = "AudioList";
        this.songs = new Song[0];
    }
    
    public AudioList(String name){
        this.name = name;
        this.songs = new Song[0];
    }
            
            
    public int qntSongs(){
        return songs.length;
    }
    
    public void addSong(Song song){
        int len = songs.length;
        Song[] temp = new Song[len + 1];
        System.arraycopy(this.songs, 0, temp, 0, len);
        temp[len] = song;
        this.songs = temp;
    }
    
    public Song getSongOfIndex(int index){
        if (index >= 0 && index < this.songs.length) {
            return this.songs[index];
        } else {
            throw new AudioListIndexException();
        }
    }
    
    public void setSongOfIndex(Song song, int index){
        if (index >= 0 && index < this.songs.length) {
            this.songs[index] = song;
        } else {
            throw new AudioListIndexException();
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(this.name);
        sb.append(":\n");
        for (int i = 0; i < songs.length; i++) {
            sb.append(this.getSongOfIndex(i)).append("\n");
        }
        return sb.toString();
    }
}
