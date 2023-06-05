package com.threads.sample;

public class ForLoopThread implements Runnable {
	public void run() {
		for(int i=0;i<12;i=i+2) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForLoopThread samplethread = new ForLoopThread();
		Thread thread= new Thread(samplethread);
		thread.start();
	}

}
