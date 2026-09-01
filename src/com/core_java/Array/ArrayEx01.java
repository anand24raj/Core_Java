package com.core_java.Array;

public class ArrayEx01 
{
    public static void main(String[] args) 
    {
        byte[] arr1 = new byte[5];
        System.out.println(arr1.getClass().getName());       // [B
        System.out.println(arr1.getClass().getSuperclass()); // class java.lang.Object

        short[] arr2 = new short[5];
        System.out.println(arr2.getClass().getName());       // [S

        int[] arr3 = new int[5];
        System.out.println(arr3.getClass().getName());       // [I

        long[] arr4 = new long[5];
        System.out.println(arr4.getClass().getName());       // [J

        float[] arr5 = new float[5];
        System.out.println(arr5.getClass().getName());       // [F

        double[] arr6 = new double[5];
        System.out.println(arr6.getClass().getName());       // [D

        char[] arr7 = new char[5];
        System.out.println(arr7.getClass().getName());       // [C

        boolean[] arr8 = new boolean[5];
        System.out.println(arr8.getClass().getName());       // [Z

        Integer[] arr9 = new Integer[5];
        System.out.println(arr9.getClass().getName());       // [Ljava.lang.Integer;
    }
}