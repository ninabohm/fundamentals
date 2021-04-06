/*************************************************************************************************
 *  Calculate the first X (<20) Armstrong numbers 
 * for more details on Armstrong numbers see https://en.wikipedia.org/wiki/Narcissistic_number)

 *************************************************************************************************/


public class ArmstrongNumbers {
	public static void main(String[] args) {
		int[] test = giveArmstrongNumbers(15);
		// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634
		printArray(test);
	}

	//get the number of digits of an integer
	public static int numberOfDigits(int input) {
		int number_of_digits = 0;
		
		if (input == 0) {
			number_of_digits = 1;
		}else{
			while (input > 0){
				input = input / 10;
				number_of_digits++;	
			}
		}	
		//System.out.println("number of digits: " + number_of_digits);
		return number_of_digits;
	}

	public static boolean isArmstrongNumber(int number) {
		
		int digit = 0;
		int sum = 0;
		int work_number = number;

		//Get digit and add to sum as digit to the power of total number of digits 
		while (work_number > 0) {
			digit = work_number % 10;
			sum += Math.pow(digit, numberOfDigits(number)) ;
			work_number = work_number / 10;
			//System.out.println("work number: " + work_number);
		}

		if (sum == number) {
			return true;
		}
		return false;
	}
	
	public static int[] giveArmstrongNumbers(int n) {

		//add armstrong numbers to array as long as array is not filled yet
		int[] armstrong_numbers = new int [n];
		int k = 0;
		int counter = 0;

			for (int i = 0; i < armstrong_numbers.length; i++) {
				while (counter < n) {
					if (isArmstrongNumber(k)){
						//System.out.println(k + " is armstrong");
						//System.out.println("i: "+i);
						armstrong_numbers[i] = k;
						counter++;
						i++;
				}				
				k++;
			}
		}
		return armstrong_numbers;
	}

	private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(i < a.length - 1 ? ", " : "\n");
		}
	}
}
