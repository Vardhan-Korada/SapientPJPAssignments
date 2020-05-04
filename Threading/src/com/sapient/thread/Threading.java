package com.sapient.thread;

public class Threading {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ChildThread(),"Tic");
		Thread t2 = new Thread(new ChildThread(),"Tok");
		t1.start();
		t2.start();
	}
}
class ChildThread implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i< 10; i++) {
			if(Thread.currentThread().getName() == "Tic") {
				System.out.print(Thread.currentThread().getName()+"-");
			} else {
				System.out.println(Thread.currentThread().getName());
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Error occured!!!");
			}
		}
	}
}