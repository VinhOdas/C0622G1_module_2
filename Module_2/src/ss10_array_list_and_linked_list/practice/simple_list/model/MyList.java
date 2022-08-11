package ss10_array_list_and_linked_list.practice.simple_list.model;

import java.util.Arrays;

public class MyList<Vinh> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];
    // mảng elements

    private int size() {
        return this.size = 0;
    }

    public MyList() {
//        elements = (Object[]) elements[DEFAULT_CAPACITY];
        elements = new Object[DEFAULT_CAPACITY];
    }


    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    private void ensureCapa(){
        int newSize = elements.length *2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(Vinh element) {
        if (size == elements.length){
            ensureCapa();
        }
        elements[size] = element;
        size++;
    }
    public Vinh get(int i){
        if (i>=size || i < 0){
            throw new IndexOutOfBoundsException("Index:" + i + "Size" +i);
        }
        return (Vinh) elements[i];
    }
}
