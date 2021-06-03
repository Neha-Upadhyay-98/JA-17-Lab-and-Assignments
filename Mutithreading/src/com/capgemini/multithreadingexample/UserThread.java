package com.capgemini.multithreadingexample;

public class UserThread extends Thread{
	
	// to assign an action/task for a thread
	public void run(){
		System.out.println("Thread is in running state");
		for(int i=1;i<10;i++){
			System.out.println(Thread.currentThread().getName());
			try{
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException {

		UserThread ut=new UserThread();
		ut.setName("Neha");
		ut.start();
		try{
			ut.join();
			System.out.println("Thread id = "+ut.getId());
			System.out.println("Name = "+ut.getName());
		}catch(Exception e){
			System.out.println(e);
		}
		UserThread ut1=new UserThread();
		ut1.start();
		System.out.println("Thread id = "+ut1.getId());
		System.out.println("Name = "+ut1.getName());
		UserThread ut2=new UserThread();
		ut2.start();
		System.out.println("Thread id = "+ut2.getId());
		System.out.println("Name = "+ut2.getName());
	}
}
