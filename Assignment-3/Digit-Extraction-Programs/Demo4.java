import java.util.Scanner;
class Demo4{
   			 public static void main(String[] args) {
       				 Scanner sc = new Scanner(System.in);

       				 System.out.print("Enter number: ");
       				 int num = sc.nextInt();
				int product=1;
				while(num>0){
					int rem=num%10;
					product=product*rem;
					num=num/10;
				}
				System.out.println(product);
			}
}