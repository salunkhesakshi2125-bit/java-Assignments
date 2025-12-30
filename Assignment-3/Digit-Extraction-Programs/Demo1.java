import java.util.Scanner;
class Demo1{
   			 public static void main(String[] args) {
       				 Scanner sc = new Scanner(System.in);

       				 System.out.print("Enter number: ");
       				 String num = sc.next();

       				 for (int i = 0; i < num.length(); i++) {
          			  System.out.print(num.charAt(i) + " ");
       				 }
   			 }
}
