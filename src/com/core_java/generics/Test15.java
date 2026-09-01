package com.core_java.generics;

class Fruit {}

class Apple extends Fruit 
{
    @Override
    public String toString() 
    {
        return "Apple";
    }
}

class Basket<E> 
{
    private E element;

    public void setElement(E element) 
    {
        this.element = element;
    }

    public E getElement() 
    {
        return element;
    }
}

public class Test15 
{
    public static void main(String[] args) 
    {

        Basket<Fruit> basket = new Basket<>();
        basket.setElement(new Apple());

        Apple apple = (Apple) basket.getElement();

        IO.println(apple);
    }
}