import java.util.Scanner;
class Demo1{
			public static void main(String [] args){
				Scanner sc= new Scanner(System.in);
				System.out.println("enter first number:");
				int num1=sc.nextInt();
				System.out.println("enter second number:");
				int num2=sc.nextInt();
				int sum=num1+num2;
				int sub=0;
				if(num1>num2){
					sub=num1-num2;
				}else{
					sub=num2-num1;
				}
				System.out.println("Addition is :"+sum);
				System.out.println("Subtraction is :"+sub);
			}
}