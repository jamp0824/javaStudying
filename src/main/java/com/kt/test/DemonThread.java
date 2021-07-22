package com.kt.test;

import java.awt.Toolkit;

public class DemonThread {

    public static void main(String[] args) {
		Thread thread = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (;;) {
                    toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true); // ���� ������� ����
        thread.start();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("������!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
