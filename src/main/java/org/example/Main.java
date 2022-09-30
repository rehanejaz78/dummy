package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("update in code");
        System.out.println("update i code 2nd time");

        List<String> list=new ArrayList<String>();

        list.add("rehan");
        list.add("ejaz");
        System.out.println(list.stream().count());


    }
}