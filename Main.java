package com.company;

import java.util.Locale;

public class Main {

    private static Object String;

    public static void main(String[] args) {
  DynamicArray <String> stringDynamicArray= new DynamicArray<String>("ABCD");

  stringDynamicArray.add("bjhbxakx");
        System.out.println(stringDynamicArray.getSize());
        System.out.println(stringDynamicArray.getElement(0).toLowerCase());
        System.out.println(stringDynamicArray.getSize());
        stringDynamicArray.insert("EFGH",1);
        System.out.println(stringDynamicArray.getSize());
        System.out.println(stringDynamicArray.getElement(0).toLowerCase());
        DynamicArray<Integer> integerDynamicArray = new DynamicArray<>(45);
        integerDynamicArray.add(345);
        integerDynamicArray.insert(45,1);
        integerDynamicArray.removebyargument((Integer) 45);
        integerDynamicArray.printArray();
        stringDynamicArray.replace("ASD","BAD");
        stringDynamicArray.printArray();
        integerDynamicArray.replace(45,54);
        integerDynamicArray.add(45);
        stringDynamicArray.swap(0,1);
        integerDynamicArray.swap(1,2);
        



    }
}
