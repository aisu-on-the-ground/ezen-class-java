package ezen0812_Thread.sec02.exam02_threadname;

public class ThreadA extends Thread {	
	public ThreadA() {
		setName("ThreadA");
	}
	
	public void run() {		
		for(int i=0; i<2; i++) {	
			//try { Thread.sleep(2000); } catch(Exception e) {}
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}

