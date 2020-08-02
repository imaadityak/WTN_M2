package multithreading;

public class ThreadControlP2 
{
	public static void main(String[] args) {
       
        Thread t1 = new Thread(new Runnable1());
   
        Thread t2 = new Thread(new Runnable2());
        t1.start();
        t2.start();
    }
}

class Runnable2 implements Runnable{
    public void run(){
        for(int i=0;i<=20;i+=2) {
            System.out.println(i);
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
        for(int i=1;i<20;i+=2) {
           System.out.println(i);
        }
    }
}
