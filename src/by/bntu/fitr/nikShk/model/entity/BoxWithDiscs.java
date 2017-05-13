/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.entity;

import by.bntu.fitr.nikShk.exception.DiscsIndexException;

/**
 *
 * @author niksk
 */
public class BoxWithDiscs {
    private String name;
    private AudioList[] audioLists;
    
    public BoxWithDiscs(){
        this.name = SongsConst.BOX;
        this.audioLists = new AudioList[0];
    }
    
    public BoxWithDiscs(String name){
        this.name = name;
        this.audioLists = new AudioList[0];
    }
            
            
    public int qntAudioList(){
        return audioLists.length;
    }
    
    public void addAudioList(AudioList audioList){
        int len = audioLists.length;
        AudioList[] temp = new AudioList[len + 1];
        System.arraycopy(this.audioLists, 0, temp, 0, len);
        temp[len] = audioList;
        this.audioLists = temp;
    }
    
    public AudioList getAudioListOfIndex(int index){
        if (index >= 0 && index < this.audioLists.length) {
            return this.audioLists[index];
        } else {
            throw new DiscsIndexException();
        }
    }
    
    public void setAudioListOfIndex(AudioList audioList, int index){
        if (index >= 0 && index < this.audioLists.length) {
            this.audioLists[index] = audioList;
        } else {
            throw new DiscsIndexException();
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\t").append(this.name).append(":\n");
        for (int i = 0; i < audioLists.length; i++) {
            sb.append(this.getAudioListOfIndex(i)).append("\n");
        }
        return sb.toString();
    }
}