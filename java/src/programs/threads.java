package programs;
import java.util.*;
class thread_demo extends Thread{
	public void run() {
		for(int i=0;i<7;i++) {
			try {
				Thread.sleep(400);
			}
			catch(Exception e){
				System.out.println(e);

			}
			System.out.println(i);
		}
		System.out.println("thread name:"+Thread.currentThread().getName());
		System.out.println("priority is:"+Thread.currentThread().getPriority());

	}
}
public class threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          thread_demo  t1=new thread_demo();
          thread_demo  t2=new thread_demo();
          thread_demo  t3=new thread_demo();
          thread_demo  t4=new thread_demo();

          t1.setPriority(Thread.MAX_PRIORITY);
          t2.setPriority(Thread.NORM_PRIORITY);
          t3.setPriority(Thread.MIN_PRIORITY);
          t4.setPriority(7);

          t1.start();
//          try {
//        	  t1.join();
//          }catch(Exception e ){
//				System.out.println(e);
//
//          }
          t2.start();
          t3.start();
          t4.start();
          
	}

}
