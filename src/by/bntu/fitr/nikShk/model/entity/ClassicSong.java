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
public class ClassicSong extends Song{ 
    
    private int violine;
    private int piano;

    public ClassicSong() {
        super(Types.CLASSIC.toString());
        this.piano = 1;
        this.violine = 1;
    }
    
    public ClassicSong(String name, int time, int violine, int piano) {
        super(name, Types.CLASSIC.toString(), time);
        this.piano = 1;
        this.violine = 1;
    }

    /**
     * @return the violine
     */
    public int getVioline() {
        return violine;
    }

    /**
     * @param violine the violine to set
     */
    public void setVioline(int violine) {
        if (violine >= 0) {
            this.violine = violine;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * @return the piano
     */
    public int getPiano() {
        return piano;
    }

    /**
     * @param piano the piano to set
     */
    public void setPiano(int piano) {
        if (piano >= 0) {
            this.piano = piano;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" Violine:").append(this.violine).append("qnts. Piano:").append(this.piano).append("qnts.");
        return sb.toString();
    }
}
