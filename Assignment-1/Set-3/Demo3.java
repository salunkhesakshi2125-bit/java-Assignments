import java.util.Scanner;
class Demo3{
			public static void main(String [] args){
				Scanner sc= new Scanner(System.in);
				System.out.println("enter first number:");
				int num1=sc.nextInt();
				System.out.println("enter second number:");
				int num2=sc.nextInt();
				int cube1=num1*num1*num1;
				int cube2=num2*num2*num2;
				int cubeAddition=cube1+cube2;
				
				int sqr1=num1*num1;
				int sqr2=num2*num2;
				int sqrAddition=sqr1+sqr2;
			
				System.out.println("cubes:"+cubeAddition);
				System.out.println("Squares:"+sqrAddition);	
			}
}

				