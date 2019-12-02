package com.revature.eval.java.core.andrewtest;

public class Driver {

	public static void main(String[] args) {

		solveWordProblem("Can you find the plus of -20 and 5?");
	}

	public static int solveWordProblem(String string) {

		String[] splitString = string.split(" |\\?");
		int a = 0;
		int b = 0;
		char operator = 0;
		int sum = 0;
		for (int i = 0; i < splitString.length; i++) {
			for (int j = 0; j < splitString[i].length(); j++) {
				if (splitString[i].charAt(j) == '-') {
					if (a == 0) {
						a = (Integer.parseInt(splitString[i]));
						System.out.println(a);
					} else {
						b = (Integer.parseInt(splitString[i]));

					}
				} else if (Character.isDigit(splitString[i].charAt(j))) {
					if (a == 0) {
						a = (Integer.parseInt(splitString[i]));
						System.out.println(a);
					} else {
						b = (Integer.parseInt(splitString[i]));
						System.out.println("This is reading b: " + b);
						System.out.println(a);

					}
				}

			}
		}
		for(String n:splitString) {
			if(n.equals("plus")){
				sum = a + b;
				System.out.println(sum);
			}
			else if(n.equals("multiplied")) {
				sum = a * b;
				System.out.println(sum);
			}
			else if(n.equals("divided")) {
				sum = a / b;
				System.out.println(sum);
			}
			else if(n.equals("minus")) {
				sum = a - b;
				System.out.println(sum);
			}
		}

		return 0;
	}

}
