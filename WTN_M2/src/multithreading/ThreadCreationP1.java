package multithreading;

public class ThreadCreationP1
{
	
  public static void main(String[] args)
  {
	  Thread t1=new Thread(args[0])
			  {
		  public void run()
		  {
			  System.out.println(Thread.currentThread().getName());
		  }
			  };
	  Thread t2=new Thread(args[1])
			  {
		  public void run()
		  {
			  System.out.println(Thread.currentThread().getName());
		  }
			  };
			 t1.start();
			 t2.start();
			  
  }
}
