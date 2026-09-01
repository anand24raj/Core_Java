package com.core_java.objectclass.FinalKeyword;

final class A {
    private int x = 100;

    public void setData(int x) {
        this.x = x;
        IO.println(this.x);
    }
}
//class B extends A
//{
//	 Error
//}

public class FinalClassEx {
    public static void main(String[] args) {
        A a1 = new A();
        a1.setData(120);
    }
}
