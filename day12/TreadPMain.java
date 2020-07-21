package pkg12;

public class TreadPMain {

	public static void main(String[] args) {
//		ThreadEx soo = new ThreadEx("¾Æ");
//		soo.start();
//		new ThreadEx("³ö").start();
//	
		RunnableEx rn = new RunnableEx();
		Thread th = new Thread(rn);
		th.start();
		
	}

}
