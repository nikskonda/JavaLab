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
public class RockSong extends Song implements Serializable {

    private int gitars;
    private int drumbabum;

    public RockSong() {
        super(Types.ROCK.toString());
        this.gitars = 1;
        this.drumbabum = 1;
    }

    public RockSong(String name, int time, int gitars, int drumbabum) {
        super(name, Types.ROCK.toString(), time);
        this.gitars = gitars;
        this.drumbabum = drumbabum;
    }

    /**
     * @return the gitars
     */
    public int getGitars() {
        return gitars;
    }

    /**
     * @param gitars the gitars to set
     */
    public void setGitars(int gitars) {
        if (gitars >= 0) {
            this.gitars = gitars;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * @return the drumbabum
     */
    public int getDrumbabum() {
        return drumbabum;
    }

    /**
     * @param drumbabum the drumbabum to set
     */
    public void setDrumbabum(int drumbabum) {
        if (drumbabum >= 0) {
            this.drumbabum = drumbabum;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" ").append(SongsConst.GITARS).append(":")
            .append(this.gitars).append(SongsConst.QNT).append(". ")
                .append(SongsConst.DRUMBUM).append(": ").append(this.drumbabum)
                .append(SongsConst.QNT).append(".");
        return sb.toString();
    }

}
