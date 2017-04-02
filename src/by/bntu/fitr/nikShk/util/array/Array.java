/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.util.array;

import java.util.ArrayList;

/**
 *
 * @author niksk
 */
public class Array<T> {
    private T[] object;
    
//    private final T[] = {};
    
    public Array(){
//        this.object = this.default_capacity;
        this.object = null;
    }
    
    public Array(int size){
        this.object = (T[]) new Object[size];
    }
    
    public Array(T[] elements){
        this.object = elements;
    }
    
    public int qntObjects(){
        return this.object.length;
    }
    
    public void addObject(T newObject){
        int len = this.object.length;
        Object[] temp = new Object[len + 1];
        System.arraycopy(this.object, 0, temp, 0, len);
        temp[len] = newObject;
        this.object =(T[]) temp;
    }
    
    /**
     * @return the object
     */
    public T getObjectOfIndex(int index) {
        if (index >=0 && index <this.object.length){
            return this.object[index];
        } 
        return null;
    }

    /**
     * @param object the object to set
     */
    public void setObjectOfIndex(int index, T object) {
        if (index >=0 && index <this.object.length){
            this.object[index] = object;
        }
    }
    
    
    
}
