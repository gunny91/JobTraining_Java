package pkg12;

public class TreadPMain {

	public static void main(String[] args) {
//		ThreadEx soo = new ThreadEx("��");
//		soo.start();
//		new ThreadEx("��").start();
//	
		RunnableEx rn = new RunnableEx();
		Thread th = new Thread(rn);
		th.start();
		
	}

}
