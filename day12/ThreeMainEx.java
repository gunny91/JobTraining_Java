package pkg12;

public class ThreeMainEx {

	
	/**
	 * Thread : process of work (main thread = single thread)
	 * 
	 * Multi-Thread : use more than 2 thread
	 */
	
	
	public static void main(String[] args) {
//	
//		int x =3, 
//			y =0;
//		
//		System.out.println(x/y);
	long id = Thread.currentThread().getId();
	int priority = Thread.currentThread().getPriority();
	int count = Thread.currentThread().activeCount();
	String name = Thread.currentThread().getName();
	
	System.out.println("ID : "+id);
	System.out.println("Name : "+name);
	Thread.State s = Thread.currentThread().getState();
	System.out.println("Priority : "+priority);
	System.out.println("Count : "+count);
	System.out.println("State of Thread : "+s);
	
	
	}

}
