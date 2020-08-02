package multithreading;

import java.util.Random;

public class ThreadCreationP2 implements Runnable 
{
	public static void main(String[] args) 
	{
		ThreadCreationP2 threadcreationP2=new ThreadCreationP2();
		Thread t1 = new Thread(threadcreationP2);
		t1.start();
	}
     @Override
	public void run() {
		Random random = new Random();
		String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
		int i;
		
		while ((i=random.nextInt(6)) != 5) {
			System.out.println(colours[i]);
		}		
	}
}
