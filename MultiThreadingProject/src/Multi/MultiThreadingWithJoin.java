package Multi;

class PaymentTask extends Thread{
	public void run(){
	System.out.println("Payemnt Started");
	
	try {
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
	}
		System.out.println("Payment Completed");
	}
}

class InvoiceTask extends Thread{
	public void run() {
		System.out.println("Invoice Generated!..");
	}
}

public class MultiThreadingWithJoin {
	public static void main(String[] args) throws InterruptedException{
		PaymentTask payment = new PaymentTask();
		InvoiceTask invoice = new InvoiceTask();
		
		payment.start();
		
		// it makes wait until payment finishes
		payment.join();
		
		invoice.start();
		
	}

}
