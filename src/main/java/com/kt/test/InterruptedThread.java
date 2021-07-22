package com.kt.test;

public class InterruptedThread implements Runnable {
	
    public void run() {
        try {
            while(!Thread.currentThread().isInterrupted()) {
                System.out.println("������ ����");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("\n����");
        }
    }
	
    void process(){
        Runnable interruptedThread = new InterruptedThread();
        Thread thread = new Thread(interruptedThread);
        thread.start();
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt(); // InterruptedException �߻�
    }
}

