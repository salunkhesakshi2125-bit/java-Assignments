import java.util.Scanner;
class Demo8 {
   			 public static void main(String[] args) {
      			  Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number :");
      			  int n = sc.nextInt();
              		 n = n / 10;
        		int temp = n;
        		int a = 1;
        		while (temp >= 10) {
            		a = a * 10;
            		temp = temp / 10;
        		}
			int middle = n % a;
        		System.out.println(middle);
    		}
}
