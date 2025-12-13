import java.util.Scanner;
class Demo3{
			public static void main(String[] args){
				Scanner sc = new Scanner(System.in);	
				System.out.println("enter  number");
				int num=sc.nextInt();
								
				for(int i=2;i<=num;i++){
					if(i%2 ==0){
						int cube=i*i*i;
						int square=i *i ;
						System.out.println("Cube of "+ i+" :"+ cube+" and Square of "+ i+ " :"+ square);
					}
				}
			}
}