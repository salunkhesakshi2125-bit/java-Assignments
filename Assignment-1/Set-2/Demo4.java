import java.util.Scanner;
class Demo4{
		public static void main(String [] args){
			Scanner  sc =new Scanner (System.in);
			System.out.println("Enter Number:");
			int num= sc.nextInt();
			int table=0;
			for (int i=1;i<=10;i++){
				table=num*i;
				System.out.println(table);
			}
		}
}