package ss10_array_list_and_linked_list.practice.simple_list.controller;

import ss10_array_list_and_linked_list.practice.simple_list.model.MyList;

public class MyListController  {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(5);
        System.out.println(listInteger.get(4));
        System.out.println(listInteger.get(1));
        System.out.println(listInteger.get(2));
        System.out.println(listInteger.get(3));
        listInteger.get(6);
        System.out.println(listInteger.get(6));
    }
}
