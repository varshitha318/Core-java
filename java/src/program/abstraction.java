package program;

abstract class car{  
	  abstract void run();  
	}  

public class abstraction extends car{  
	void run()
	{System.out.println("running safely");
	}  
	public static void main(String args[]){  
	 car obj = new abstraction();  
	 obj.run();  
	}  }


