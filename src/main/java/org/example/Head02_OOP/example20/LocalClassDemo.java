package org.example.Head02_OOP.example20;

public class LocalClassDemo {
    public void executeTast() {
        final int taskId = 999;

        class LocalWorker {
            public void run() {
                System.out.println("LocalWorker started with taskId = " + taskId);
            }
        }

        LocalWorker worker = new LocalWorker();
        worker.run();
    }

    public static void main(String[] args) {
        LocalClassDemo demo = new LocalClassDemo();
        demo.executeTast();
    }
}
