/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.Interface;


/**
 *
 * @author niksk
 * @param <T>
 */
public interface Container<T> {
    
    int qntObject();
    
    void add(T o);
    
    T get();
    
    void remove();
    
    T cut();
    
    T[] getAsArray();
}
