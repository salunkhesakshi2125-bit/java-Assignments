import java.util.Scanner;
class Demo4{
			public static void main(String [] args){
				Scanner sc= new Scanner(System.in);
				System.out.println("enter first number:");
				int a=sc.nextInt();
				System.out.println("enter second number:");
				int b=sc.nextInt();
				System.out.println("enter operation to perform:");
				char op=sc.next().charAt(0);
				int result=0; 
				if(op=='+'){
					 result=a+b;
				}else if(op=='-'){
					 result=a-b;
				}else  if(op=='*'){
					 result=a*b;
				}else if(op=='/'){
					 result=a/b;
				}
				System.out.println(result);
			}
}