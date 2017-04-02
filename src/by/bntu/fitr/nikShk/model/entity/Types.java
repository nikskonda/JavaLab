/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.model.entity;

/**
 *
 * @author nikita
 */
public enum Types {
    ROCK, CLASSIC, RAP, REMIX, SONG;
    
    @Override
    public String toString(){
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
