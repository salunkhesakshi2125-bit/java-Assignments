class Demo10{
				public static void main(String [] args){
					int n=18;
					int sum=0;
					while(n>0){
						int rem= n%10;
						 sum= sum+rem;
						n=n/10;
					}
					if(n%sum==0){
						System.out.println("Harshad Number");
					}else{
						System.out.println(" Not Harshad Number");
					}
				}
}