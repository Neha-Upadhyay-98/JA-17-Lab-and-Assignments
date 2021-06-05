package com.capgemini.lab8exercise2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTimer implements Runnable {

	public synchronized void display(){
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(date));
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Present time : ");
		while(true){
			try{
				display();
				Thread.sleep(10000);
				System.out.println("Time after 10 seconds : ");
			}catch( InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadTimer threadtimer=new ThreadTimer();
		Thread t=new Thread(threadtimer);
		t.start();
	}

}
