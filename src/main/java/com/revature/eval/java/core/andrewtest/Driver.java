package com.revature.eval.java.core.andrewtest;

public class Driver {

	public static void main(String[] args) {

		calculateNthPrime(10001);
	}

	public static int calculateNthPrime(int i) {

		int[] primeArray = new int[i];
		int count = 2;
		for (int k = 0; k <= primeArray.length; k++) {

			if (count == 2) {
				primeArray[k] = count;
				count++;
				System.out.println(primeArray[0]);
			}
		}
		return primeArray[primeArray.length - 1];
	}
}
