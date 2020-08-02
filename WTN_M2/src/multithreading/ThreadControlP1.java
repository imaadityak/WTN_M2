package multithreading;

public class ThreadControlP1 implements Runnable
{
static Thread t1;
	
	public static void main(String[] args) {
		t1 = new Thread(new ThreadControlP1());
		t1.start();

	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i == 6)
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(i);
		}		
	}
}
