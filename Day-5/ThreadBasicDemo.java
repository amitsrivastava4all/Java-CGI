// Step - 1 Create a Job 
class PrintJob implements Runnable{
	int counter;
	// Here Job Code Will be Inside it
	public synchronized void run(){
		for(int i = 1; i<=5; i++,counter++){
			System.out.println("Counter "+counter+" I is "+i+" "+Thread.currentThread().getName());
		}
	}
	
}
public class ThreadBasicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step -2 Create Job Object
		PrintJob job1 = new PrintJob();
		//PrintJob job2 = new PrintJob();
		Thread worker1 = new Thread(job1,"ram");
		Thread worker2 = new Thread(job1,"shyam");
		worker1.start();
		worker2.start();
		
		Thread t = new Thread(()->{
				for(int i = 1; i<=5; i++){
					System.out.println(" I is "+i+" "+Thread.currentThread().getName());
				}	
		},"mythread");
		t.start();
		

	}

}
