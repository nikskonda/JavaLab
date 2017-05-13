/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.entity;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 *
 * @author nikita
 */
public enum Types {
    ROCK, CLASSIC, RAP, REMIX, SONG;
    
    @Override
    public String toString(){
        String s = "";
        switch (valueOf(name())){
            case ROCK:
                s =  SongsConst.ROCK;
                break;
            case CLASSIC:
                s =  SongsConst.CLASSIC;
                break;
            case RAP:
                s=  SongsConst.RAP;
                break;
            case REMIX:
                s = SongsConst.REMIX;
                break;
            case SONG:
                s = SongsConst.SONG;
                break;
        }
        return s;
    }
}
