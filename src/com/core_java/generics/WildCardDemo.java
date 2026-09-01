package com.core_java.generics;

import java.util.*;

class Animal3 {}
class Dog3 extends Animal3 {}
class Lion extends Animal3 {}

public class WildCardDemo {
    public static void main(String[] args) {

        ArrayList<? extends Animal3> al = new ArrayList<Lion>();
        // al.add(new Lion()); // Not allowed

        ArrayList<? super Dog3> alList = new ArrayList<Object>();
        alList.add(new Dog3());
    }
}