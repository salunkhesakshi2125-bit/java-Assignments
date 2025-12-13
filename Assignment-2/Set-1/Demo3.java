import java.util.Scanner;
class Demo3{
			public static void main(String [] args){
					int num=10;
					for (int i =1;i<=num;i++){
					if(i%2 !=0){
						int sqr=i*i;
						int cube=i*i*i;
						System.out.println("cube of "+ i +":"+cube+" and square of "+i+":"+sqr);
					}
				}
			}
}