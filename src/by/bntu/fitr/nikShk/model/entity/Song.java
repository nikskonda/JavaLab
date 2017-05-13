/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.entity;

import java.io.Serializable;

/**
 *
 * @author niksk
 */
public class Song implements Comparable<Song>, Serializable{

    private String name;
    private String type;
    private int time;

    public Song() {
        this.name = SongsConst.SONG;
        this.type = Types.SONG.toString();
        this.time = 1;
    }

    protected Song(String type){
        this.name = SongsConst.SONG;
        this.type = type;
        this.time = 1;
    }
    
    public Song(String name, String type, int time) {
        this.name = name;
        this.time = time;
        this.type = type;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        if (time > 0) {
            this.time = time;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int compareTo(Song o) {
        return this.name.compareTo(o.name);
    }
    
    
    
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null)
//            return false;
//	if (getClass() != obj.getClass())
//            return false;
//        Song s = (Song)obj;
//	if (!this.name.equals(s.name))
//            return false;
//        if (this.time != s.time)
//            return false;
//        if (!this.type.equals(s.type))
//            return false;
//	return true;
//    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode(); 
//    }
    
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SongsConst.AUDIO).append(": ").append(this.name).append(". ").append(SongsConst.TYPE).append(": ")
                .append(this.type).append(". ").append(SongsConst.TIME).append(": ")
                .append(this.time).append(SongsConst.SEC).append(".");
        return sb.toString();

    }
}
