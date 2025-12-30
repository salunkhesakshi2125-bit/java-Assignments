import java.util.Scanner;
class Demo6{
   			 public static void main(String[] args) {
       				 Scanner sc = new Scanner(System.in);

       				 System.out.print("Enter number: ");
       				 int num = sc.nextInt();
				
				Boolean isZero=false;
				while(num>0){
					if(num%10==0){
						isZero=true;
						break;
					}
					num=num/10;
				}
				if(isZero){
					System.out.println("Duck Number");
				}else{
					System.out.println(" Not Duck Number");
				}
			}
}