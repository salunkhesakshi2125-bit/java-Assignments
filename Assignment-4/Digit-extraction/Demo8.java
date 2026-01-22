class Demo8{
				public static void main(String [] args){
					int n=9421;
					int min=9;
					while(n>0){
						int rem=n%10;
						if(rem<min){
							min=rem;
						}
						n=n/10;

					}
					System.out.println(min);
				}
}