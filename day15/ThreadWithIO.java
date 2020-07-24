package pkg15;

public class ThreadWithIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadFile mfile = new ReadFile();
		
		Thread myfile = new Thread(mfile);
		myfile.start();
		
		MakeFile mkdir = new MakeFile();
		mkdir.start();
	}

}
