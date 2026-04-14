package com.mickey;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Thread t1=new Thread(new DownloadTask("File 1 "));
        Thread t2=new Thread(new DownloadTask("File 2 "));
        Thread t3=new Thread(new DownloadTask("File 3 "));
        Thread t4=new Thread(new DownloadTask("File 4 "));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
