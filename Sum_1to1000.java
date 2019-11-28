package MultiThreading;

public class Sum_1to1000 {
	int count;

	public synchronized void increment(int i) {
		count += i;
	}

	public static void main(String[] args) throws InterruptedException {
		Sum_1to1000 sum = new Sum_1to1000();
		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 500; i++) {
				sum.increment(i);
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 501; i <= 1000; i++) {
				sum.increment(i);
			}
		});
		
		Thread t3 = new Thread(() -> System.out.println(sum.count));
		
		t1.start();
		//t1.join();
		t2.start();
		//t2.join();
		t3.start();
		//t3.join();

	}

}
