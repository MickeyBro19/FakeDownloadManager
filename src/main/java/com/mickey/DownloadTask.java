package com.mickey;

public class DownloadTask implements Runnable {
    private final String threadName;

    public DownloadTask(String name){
        this.threadName=name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(threadName+ ": Downloading "+ i*10+"%");
                Thread.sleep((int)(Math.random()*1000));
            }
            System.out.println(threadName + ": Download Complete!");
        } catch (InterruptedException e){
            System.out.println("Download Interrupted");
        }
    }
}
