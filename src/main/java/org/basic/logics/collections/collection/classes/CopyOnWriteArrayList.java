package org.basic.logics.collections.collection.classes;

public class CopyOnWriteArrayList {
    public static void main(String[] args) {
        java.util.concurrent.CopyOnWriteArrayList<String> list = new java.util.concurrent.CopyOnWriteArrayList<>();

        // Adding elements
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");

        System.out.println("Initial List: " + list);

        // Creating a thread to modify the list
        Thread writerThread = new Thread(() -> {
            list.add("David");
            list.remove("Alice");
            System.out.println("Writer Thread Modified List: " + list);
        });

        // Creating a thread to read the list
        Thread readerThread = new Thread(() -> {
            for (String name : list) {
                System.out.println("Reader Thread: " + name);
                try {
                    Thread.sleep(10);  // Simulating delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        writerThread.start();
        readerThread.start();

        // Wait for threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final List: " + list);
    }
}
