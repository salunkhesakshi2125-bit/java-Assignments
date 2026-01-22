class Demo13{
					public static void main(String [] args){
						int n=5789;
						int last=n%10;
						int rem=0;
						while(n>0){
							 rem=n%10;
							n=n/10;
						}
						System.out.println(rem);
						System.out.println(last);
					}
}