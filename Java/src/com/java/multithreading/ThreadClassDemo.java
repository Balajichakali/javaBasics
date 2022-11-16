package com.java.multithreading;

import java.util.Iterator;

class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("HAPPY BIRTHDAY");
			try {Thread.sleep(1000);} catch (Exception e) {}
		}
	}
}

class MyThread2 extends Thread
{
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("KING KOHLI");
			try {Thread.sleep(1000);} catch (Exception e) {}
		}
		
	}
}


public class ThreadClassDemo {

	public static void main(String[] args) 
	{
		MyThread obj1=new MyThread();
		MyThread2 obj2=new MyThread2();
		
		obj1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		obj2.start();
	}

}
