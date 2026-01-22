class Demo1{
				public static void main(String [] args){
					int n=1234;
					int rem=0;
					while(n>0){
						rem=n%10;
						System.out.println(rem);
						n=n/10;
					}		
				}
}