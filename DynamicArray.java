package com.company;

public class DynamicArray<T> {
    private Object[] dinArray;
    private int size = 0;


    public DynamicArray(T arg) {

        dinArray = new Object[6];
        dinArray[0]=arg;

    }

    public DynamicArray() {
        dinArray = new Object[6];

    }

    public void add(T arg) {
        if (size < dinArray.length) {
            dinArray[size] =  arg;
            size++;
        } else {
            enleargeArray();
            add(arg);
        }

    }
    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(dinArray[i] + "  ");
        }
        System.out.println();
    }
    public int capacity()
    {
        return dinArray.length;
    }

    public int getSize()
    {
        return this.size;
    }

    public T getElement(int index) {
        return (T) dinArray[index];
    }

    public void insert(T arg,int index) {
        if (index >= size) {
            add(arg);
        } else if (size < dinArray.length) {
            for (int i = 0; i > index; i--) {
                dinArray[i] = dinArray[i-1];
            }
            dinArray[index] = arg;
            size++;
        } else {
            enleargeArray();
            insert(arg, index);
        }
    }


    private void enleargeArray() {
        Object[] temp = new Object[dinArray.length + 5];
        for (int i = 0; i < dinArray.length; i++) {
            temp[i] = dinArray[i];
        }
        dinArray = temp;
    }

    public void removebyIndex(int index) {
        if (index < size) {
            for (int i = index; i < size - 1; i++) {
                dinArray[i] = dinArray[i + 1];
            }
            dinArray[size - 1] = null;
            size--;
        }
    }

    public void removebyargument(T arg) {
        for (int i = 0; i < size - 1; i++) {
            if (dinArray[i].equals(arg)) {
                removebyIndex(i);
            }
        }
    }

    public void replace(T arg, T arg1) {
        for (int i = 0; i < size - 1; i++) {
            if (dinArray[i].equals(arg)) {
                arg = arg1;
            }
        }
    }
    public int indexoff(T arg) {
        for (int i = 0; i < size-1; i++) {
            if (dinArray[i].equals(arg)) {
                return i;
            }
        }
        return -1;
    }
    public int coutofString(T arg) {
        int cout = 0;
        for (int i = 0; i < size; i++) {
            if (dinArray[i].equals(arg)) {
                cout++;
            }
        }
        return cout;
    }
    public int lastindexoff(T arg) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (dinArray[i].equals(arg)) {
                index = i;
            }
        }
        return index;
    }
    public void swap(int index,int index1){
        Object tempobject = new Object();
        tempobject= dinArray[index];
        dinArray[index]=dinArray[index1];
        dinArray[index1]=tempobject;
    }
}

