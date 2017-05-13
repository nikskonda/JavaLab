/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.entityWithCollection;

import by.bntu.fitr.nikShk.exception.AudioListIndexException;
import by.bntu.fitr.nikShk.model.entity.Song;
import by.bntu.fitr.nikShk.model.entity.SongsConst;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author niksk
 */
public class AudioList implements Iterable<Song>, Serializable{
   private String name;
    private Set<Song> songs;
    
    public AudioList(){
        this.name = SongsConst.AUDIOLIST;
        this.songs = new HashSet();
    }
    
    public AudioList(String name){
        this.name = name;
        this.songs = new HashSet();
    }
    
    
            
    public int qntSongs(){
        return getSongs().size();
    }
    
    public void addSong(Song song){
        this.getSongs().add(song);
    }
    
    public Song getSongOfIndex(int index){
        
        if (index >= 0 && index < this.getSongs().size()) {
            return (Song) this.getSongs().toArray()[index]; 
        } else {
            throw new AudioListIndexException();
        }
    }
    
    public int getTimeAll(){
        int time = 0;
        for (int i = 0; i<this.songs.size(); i++)
            time += this.getSongOfIndex(i).getTime();
        return time;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(this.getName());
        sb.append(" ").append(this.getTimeAll()).append(SongsConst.SEC).append(":\n");
        for (int i = 0; i < this.getSongs().size(); i++) {
            sb.append(this.getSongOfIndex(i)).append("\n");
        }
        return sb.toString();
    } 

    /**
     * @return the songs
     */
    public Set<Song> getSongs() {
        return songs;
    }

    /**
     * @param songs the songs to set
     */
    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    @Override
    public Iterator<Song> iterator() {
        return this.songs.iterator();
    }
}
