package com.nit.Multithreading;

class Demo extends Thread {
    @Override
    public void run() {
	String name = Thread.currentThread().getName();

	IO.println("Running Thread name is: " + name);
	IO.println("Id of child thread: " + Thread.currentThread().threadId());
    }
}

public class ThreadName2 {
    public static void main(String[] args) {

	Thread t = Thread.currentThread();
	t.setName("Parent");

	Demo d1 = new Demo();
	Demo d2 = new Demo();

	d1.setName("Child1");
	d2.setName("Child2");

	d1.start();
	d2.start();

	IO.println("Current thread name is: " + t.getName());
	IO.println("Id of main thread: " + t.threadId());
	IO.println("Id of main thread: " + t.threadId());
    }
}