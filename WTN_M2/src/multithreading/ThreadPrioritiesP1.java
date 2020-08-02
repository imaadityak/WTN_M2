package multithreading;

public class ThreadPrioritiesP1 implements Runnable
{

	public static void main(String[] args) {
	     ThreadPrioritiesP1 threadprioritiesP1=new ThreadPrioritiesP1();
		
		Thread t1 = new Thread(threadprioritiesP1, "Thread1");
		Thread t2 = new Thread(threadprioritiesP1, "Thread2");
		Thread t3 = new Thread(threadprioritiesP1, "Thread3");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		for (int i = 0;i<5; i++)
			System.out.println(Thread.currentThread().getName() + ": " + i);		
	}
}
