import java.util.Scanner;
class Demo9 {
   		public static void main(String[] args) {
      			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter Number :");
      			 int n = sc.nextInt();
			int  rev=0;
			int num=n;
			while(n>0){
				int rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			if(rev==num){
				System.out.println("Palindrome");
			}else{
				System.out.println(" Not Palindrome");
			}
		}
}