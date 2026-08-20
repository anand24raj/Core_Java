package com.adv_java.api;

//P.java
class D {
    private int x = 10;

    private D() {
	System.out.println("WOW!!! you accessed & executed private constructor");
    }

    private void m1() {
	System.out.println("OMG!!! you executed private method :-) ");
    }
}
