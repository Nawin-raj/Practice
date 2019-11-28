package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(2);
		ex.execute(() -> System.out.println("newFixedThreadPool"));
		ex.shutdown();

		ExecutorService ex1 = Executors.newCachedThreadPool();
		ex1.execute(() -> System.out.println("newCachedThreadPool"));
		ex1.shutdown();

		ExecutorService ex2 = Executors.newSingleThreadExecutor();
		ex2.execute(() -> System.out.println("newSingleThreadExecutor"));
		ex2.shutdown();

		ExecutorService ex3 = Executors.newScheduledThreadPool(5);
		ex3.execute(() -> System.out.println("newScheduledThreadPool"));
		ex3.shutdown();

		ExecutorService ex4 = Executors.newSingleThreadScheduledExecutor();
		ex4.execute(() -> System.out.println("newSingleThreadScheduledExecutor"));
		ex4.shutdown();

	}

}
