package Atomics;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyRunnable {
	private int iterations;
	
	public MyRunnable(int iterations) {
		this.iterations = iterations;
	}

	public void run() throws Exception {
		Random rand = new Random();
		double circleArea = 0;
		double squareArea = 0;
		double x;
		double y;
		for(int i = 0; i < iterations; i++) {
			x = rand.nextDouble();
			y = rand.nextDouble();
			if (x * x + y * y <= 1) {
				circleArea++;
			}
			squareArea++;
		}
		
		MainApp.sum += 4 * (circleArea/squareArea);
	}
}
