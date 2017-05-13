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
public class RapSong extends Song implements Serializable {

    private int bitboxers;

    public RapSong() {
        super(Types.RAP.toString());
        this.bitboxers = 1;
    }

    public RapSong(String name, int time, int bitboxers) {
        super(name, Types.RAP.toString(), time);
        this.bitboxers = bitboxers;
    }

    /**
     * @return the bitboxers
     */
    public int getBitboxers() {
        return bitboxers;
    }

    /**
     * @param bitboxers the bitboxers to set
     */
    public void setBitboxers(int bitboxers) {
        if (bitboxers >= 0) {
            this.bitboxers = bitboxers;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" ").append(SongsConst.BITBOXER).append(":")
                .append(this.bitboxers).append(SongsConst.QNT).append(".");
        return sb.toString();
    }
}
