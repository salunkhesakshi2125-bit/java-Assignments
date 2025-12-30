import java.util.Scanner;
class Demo5{
   			 public static void main(String[] args) {
       				 Scanner sc = new Scanner(System.in);

       				 System.out.print("Enter number: ");
       				 int num = sc.nextInt();
				int rev=0;
				if(num==0){
					rev=0;
				}else{
					while(num>0){
						int rem=num%10;
						rev=rev*10+rem;
						num=num/10;
					}
				}
				System.out.println(rev);
			}
}