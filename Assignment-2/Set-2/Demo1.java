import java.util.Scanner;
class Demo1{
			public static void main(String[] args){
				Scanner sc = new Scanner(System.in);	
				System.out.println("enter first number");
				int max=sc.nextInt();
				System.out.println("enter second number");
				int min=sc.nextInt();
				
				for(int i=max;i<=min;i++){
					if(i%2 !=0){
						System.out.println(i);
					}
				}
			}
}