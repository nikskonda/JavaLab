/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.entityWithCollection;

import by.bntu.fitr.nikShk.exception.DiscsIndexException;
import by.bntu.fitr.nikShk.model.entity.SongsConst;
import java.io.Externalizable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author niksk
 */
public class BoxWithDiscs implements Iterable<AudioList>, Serializable{
    private String name;
    private List<AudioList> audioLists;
    
    public BoxWithDiscs(){
        this.name = SongsConst.BOX;
        this.audioLists = new ArrayList<>();
    }
    
    public BoxWithDiscs(String name){
        this.name = name;
        this.audioLists = new ArrayList<>();
    }
            
            
    public int qntAudioList(){
        return getAudioLists().size();
    }
    
    public void addAudioList(AudioList audioList){
        this.getAudioLists().add(audioList);
    }
    
    public AudioList getAudioListOfIndex(int index){
        if (index >= 0 && index < this.getAudioLists().size()) {
            return this.getAudioLists().get(index);
        } else {
            throw new DiscsIndexException();
        }
    }
    
    public void setAudioListOfIndex(AudioList audioList, int index){
        if (index >= 0 && index < this.getAudioLists().size()) {
            this.getAudioLists().set(index, audioList);
        } else {
            throw new DiscsIndexException();
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\t").append(this.name).append(":\n");
        for (int i = 0; i < getAudioLists().size(); i++) {
            sb.append(this.getAudioListOfIndex(i)).append("\n");
        }
        return sb.toString();
    }
    
    
    
    /**
     * @return the audioLists
     */
    public List<AudioList> getAudioLists() {
        return audioLists;
    }

    /**
     * @param audioLists the audioLists to set
     */
    public void setAudioLists(List<AudioList> audioLists) {
        this.audioLists = audioLists;
    }

    @Override
    public Iterator<AudioList> iterator() {
        return this.audioLists.iterator();
    }
}
