/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.nikShk.util.array;

import by.bntu.fitr.nikShk.Interface.Container;

/**
 *
 * @author niksk
 * @param <T>
 */
public class Queue<T> implements Container<T>{

    private ObjectQueue firstObject;
    private ObjectQueue lastObject;

    public Queue() {
        this.firstObject = null;
        this.lastObject = null;
    }

    public Queue(T object) {
        this.firstObject.object = object;
        this.lastObject = this.firstObject;
    }
    
    public Queue(T[] objects) {
        this.firstObject = null;
        this.lastObject = null;
        for (T object : objects){
            this.add(object);
        }
    }

    @Override
    public int qntObject() {
        int size = 0;
        ObjectQueue temp = this.firstObject;
        while (temp != null) {
            size++;
            temp = temp.nextObject;
        }
        return size;
    }

    @Override
    public void add(T object) {
        ObjectQueue<T> newObject = new ObjectQueue<>();
        newObject.object = object;

        if (this.firstObject == null) {
            this.firstObject = newObject;
        } else {
            this.lastObject.nextObject = newObject;
        }
        this.lastObject = newObject;
    }

    @Override
    public T get() {
        if (this.firstObject != null) {
            return (T) this.firstObject.object;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        this.firstObject = this.firstObject.nextObject;
    }

    @Override
    public T cut() {

        if (this.firstObject != null) {
            T o = (T) this.firstObject.object;
            this.firstObject = this.firstObject.nextObject;
            return o;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = 0;
        ObjectQueue temp = this.firstObject;
        while (temp != null) {
            size++;
            sb.append(size).append(") ").append(temp.object).append("\n");
            temp = temp.nextObject;
        }
        return sb.toString();
    }

    @Override
    public T[] getAsArray() {
        T[] array = (T[]) new Object[this.qntObject()];
        int index = 0;
        ObjectQueue temp = this.firstObject;
        while ((temp != null) && (index < this.qntObject())) {
            array[index] = (T) temp.object;
            temp = temp.nextObject;
            index++;
        }
        return array;
    }
    
    public T[] getAsArrayAndClear() {
        T[] array = (T[]) new Object[this.qntObject()];
        int i = 0;
        while (this.firstObject != null) {
            array[i++] = this.cut();
        }
        return array;
    }
}
