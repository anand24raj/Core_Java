package com.core_java.practice;

class EggShop {
    private int eggs = 0;

    // Producer method
    synchronized void produceEggs(int quantity) {
        while (eggs != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        eggs = quantity;
        System.out.println("Producer produced " + quantity + " eggs");

        notify();
    }

    // Consumer method
    synchronized void consumeEggs() {
        while (eggs == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumer received " + eggs + " eggs");
        eggs = 0;

        notify();
    }
}

// Producer Thread
class Producer extends Thread {
    EggShop shop;

    Producer(EggShop shop) {
        this.shop = shop;
    }

    public void run() {
        int[] orders = {6, 12, 8, 10};

        for (int order : orders) {
            shop.produceEggs(order);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    EggShop shop;

    Consumer(EggShop shop) {
        this.shop = shop;
    }

    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Consumer gives order for eggs");

            shop.consumeEggs();

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main Class
public class ProducerConsumerEgg {
    public static void main(String[] args) {
        EggShop shop = new EggShop();

        Producer p = new Producer(shop);
        Consumer c = new Consumer(shop);

        c.start();
        p.start();
    }
}