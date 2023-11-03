package program;
import java.util.*;
class thread_demo2 implements Runnable{
	public void run() {
		System.out.println("current thread id:"+Thread.currentThread().getId());
	}
}
class thread_demo3 implements Runnable{
	public void run() {
		System.out.println("current thread id:"+Thread.currentThread().getId());
	}
}
public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        thread_demo2 t1=new thread_demo2();
        Thread t5=new Thread(t1);
        t5.start();
        thread_demo3 t2=new thread_demo3();
        Thread t6=new Thread(t2);
        t6.start();
	}

}
