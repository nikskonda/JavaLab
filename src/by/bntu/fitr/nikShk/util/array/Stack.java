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
public class Stack<T> implements Container<T> {

    private T[] object;
    private int last;

    private final int DEFAILT_CAPASITY = 10;
    private final int DEFAULT_ADD = 2;

    public Stack() {
        this.object = (T[]) new Object[this.DEFAILT_CAPASITY];
        this.last = -1;
    }

    public Stack(int size) {
        this.object = (T[]) new Object[size];
        this.last = -1;
    }

    public Stack(T[] objects) {
        this.object = objects;
        this.last = object.length - 1;

    }

    @Override
    public int qntObject() {
        return this.last + 1;
    }

    @Override
    public void add(T object) {
        this.last++;
        if (this.last < this.object.length) {
            T[] tempStack = (T[]) new Object[this.object.length * this.DEFAULT_ADD];
            System.arraycopy(this.object, 0, tempStack, 0, this.last);
            this.object = tempStack;
        }
        this.object[this.last] = object;

    }

    @Override
    public T get() {
        if (this.object[last] != null) {
            return this.object[last];
        } else {
            return null;
        }
    }

    @Override
    public T cut() {
        if (this.last == -1){
            return null;
        } else if ((this.object[this.last] != null)) {
            T o = this.object[last];
            this.object[last--] = null;
            return o;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        this.object[last--] = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = this.last; i >= 0; i--) {
            sb.append(this.object[i]).append("\n");
        }
        return sb.toString();
    }

    @Override
    public T[] getAsArray() {
        T[] array = (T[]) new Object[this.last + 1];
//        System.arraycopy(this.object, 0, array, 0, this.last + 1);
        for (int i = 0; i < last + 1; i++) {
            array[i] = (T) this.object[i];
        }
        return array;
    }

    public T[] getAsArrayAndClear() {
        T[] array = (T[]) new Object[this.last + 1];
        int i = 0;
        while (this.last + 1 > 0) {
            array[i++] = this.cut();
        }
        return array;
    }
}
