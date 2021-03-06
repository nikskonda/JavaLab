/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.entutyWithMyCollection;

import by.bntu.fitr.nikShk.exception.DiscsIndexException;
import by.bntu.fitr.nikShk.util.array.Queue;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 *
 * @author niksk
 */
public class BoxWithDiscs implements Externalizable{
    private String name;
    private Queue<AudioList> audioLists;
    
    public BoxWithDiscs(){
        this.name = "Box";
        this.audioLists = new Queue<>();
    }
    
    public BoxWithDiscs(String name){
        this.name = name;
        this.audioLists = new Queue<>();
    }
            
            
    public int qntAudioList(){
        return audioLists.qntObject();
    }
    
    public void addAudioList(AudioList audioList){
        this.audioLists.add(audioList);
    }
    
    public AudioList getAudioListOfIndex(int index){
        Object[] tempO = this.audioLists.getAsArray();
        int len = this.qntAudioList();
        AudioList[] temp = new AudioList[len];
        for (int i = 0; i<len;i++){
            temp[i] = (AudioList)tempO[i];
        }
        
        if (index >= 0 && index < temp.length) {
            return temp[index];
        } else {
            throw new DiscsIndexException();
        }
    }
    
    public void setAudioListOfIndex(AudioList audioList, int index){     
        Object[] tempO = this.audioLists.getAsArray();
        int len = this.qntAudioList();
        AudioList[] temp = new AudioList[len];
        for (int i = 0; i<len;i++){
            temp[i] = (AudioList)tempO[i];
        }
        
        if (index >= 0 && index < temp.length) {
            temp[index] = audioList;
            this.audioLists = new Queue<>(temp);
        } else {
            throw new DiscsIndexException();
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\t").append(this.name).append(":\n");
        int len = this.audioLists.qntObject();
        Queue<AudioList> temp = this.audioLists;
        for (int i = 0; i < len; i++) {
            sb.append(temp.cut()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.name);
        out.writeObject(this.audioLists);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = (String)in.readObject();
        this.audioLists = (Queue<AudioList>)in.readObject();
    }
}
