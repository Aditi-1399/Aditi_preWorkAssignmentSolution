import java.util.Scanner;

public class Main {

	Scanner scr = new Scanner(System.in);


//Function to check if a number is palindrome

	 public void checkPalindrome()  {
	 	System.out.println("Please enter the number to be checked :");
	 	int number = scr.nextInt();
		int originalNumber = number;
		int reversedNumber =0;
		int remainder =0;
		while(number != 0){
			remainder=number%10;
			reversedNumber=(reversedNumber*10)+remainder;
			number=number/10;
		}
		if (originalNumber==reversedNumber)
			System.out.println("It is palindrome");
		else
			System.out.println("It is not palindrome");
      }


//Function to generate a pattern having specified number of rows

      public void printPattern() {
      	System.out.println("Please enter the number :");
	 	int num = scr.nextInt();
		int c = 1;
		int r;
		for(r=num;r>0;r--){
			for(c=1;c<=r;c++){
			System.out.print("*");	
			}
		System.out.println();
		}
      }


//Function to check if a number is a prime number

      public void checkPrimeNumber() {
      	System.out.println("Please enter the number to be checked :");
	 	int n = scr.nextInt();
		int m = n/2;
		int i =1;
		int count =0;
		for(i=1;i<=m;i++){
			if(n%i==0)
				count++;
		}	
		if (count==1)
			System.out.println("It is a prime number");
		else
			System.out.println("It is not a prime number");
        }


//Function to print Fibonacci series having specified number of terms

       public void printFibonacciSeries() {
       	System.out.println("Please enter the number of terms of Fibonacci series :");
	 	int terms = scr.nextInt();
       	int t1 = 0;
		int t2 = 1;
		int c =1;
		int sum =0;	
		System.out.print(t1 + "\t");	
		System.out.print(t2 + "\t");
		for(c=3;c<=terms;c++){
		sum=t1+t2;
		t1=t2;
		t2=sum;
		System.out.print(sum + "\t");
		}
		System.out.println();
       }



	public static void main(String[] args){	

		Main obj = new Main();

        Scanner scr = new Scanner(System.in);

		while (true) {

			System.out.println("Please enter 1 to check if a number is palindrome , please enter 2 to generate a pattern,"
					+ "please enter 3 to check whether a number is prime or not , please enter 4 to print Fibonacci series  and please enter 0 to exit.");
			int option = scr.nextInt();

			switch (option) {
				case 0:
				System.exit(1);
				break;

				case 1:{
					obj.checkPalindrome();
				}
				break;

				case 2: {
					obj.printPattern();
				}
				break;

				case 3: {
					obj.checkPrimeNumber();
				}
				break;

 				case 4: {
					obj.printFibonacciSeries();
				}
				break;

 				
 				default:
					System.out.println("Invalid choice. Enter a valid no.\n");
			}
		}
	}
}