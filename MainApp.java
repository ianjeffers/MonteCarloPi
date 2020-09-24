package Atomics;

// Question 3
public class MainApp {
	public volatile static double sum;
	public static void main(String[] args) {

		long startTime = System.nanoTime();

		int n = Runtime.getRuntime().availableProcessors();
		double[] results = new double[n];
		for (int i = 0; i < n; i++) {
			try {
				new MyRunnable((1_000_000_000 / n)).run();
			} catch (Exception e) {
				System.out.println(e);
			}
		}


		double total = sum;
		total /= n;
		System.out.println(total);


		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;

		System.out.println("Runtime: " + totalTime / 1000000000.0 + " seconds");
	}
}
