package com.threads.sample;

public class UserThread extends Thread{
	public void run() {
		System.out.println("Thread is running...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserThread sample = new UserThread();
		sample.start();
	}

}
