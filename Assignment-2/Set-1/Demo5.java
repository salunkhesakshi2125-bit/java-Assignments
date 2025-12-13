import java.util.Scanner;
class Demo5{
			public static void main(String [] args){
				Scanner sc =new Scanner(System.in);
				System.out.println("enter number :");
				int num=sc.nextInt();
				for(int i =2;i<=num/2;i++){
					if(num%i==0){
						System.out.println(i);			
					}
				}
			}
}