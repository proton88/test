package by.epam.proton.animals;

public class MyThread extends Thread{
	public void run() {
		try {
			Thread.sleep(500000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
