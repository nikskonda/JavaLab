/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.entity;

/**
 *
 * @author niksk
 */
public class ArraySong {
    private Song[] songs;
    
    public ArraySong(){
        this.songs = new Song[0];
    }
    public ArraySong(int size){
        this.songs = new Song[size];
    }
    
    public int qntPlanes(){
        return songs.length;
    }
    
    public void addPlane(Song song){
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
            throw new IndexOutOfBoundsException();
        }
    }
    
}
