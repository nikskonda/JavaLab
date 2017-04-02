/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.util.array;

/**
 *
 * @author niksk
 * @param <T>
 */
public class ObjectQueue<T> {
    public T object;
    public ObjectQueue<T> nextObject;
    
    public ObjectQueue(){
        this.object = null;
        this.nextObject = null;
    }
    
    @Override
    public String toString(){
        return object.toString();
    }
}
