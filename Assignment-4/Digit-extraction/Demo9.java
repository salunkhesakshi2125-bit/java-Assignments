class Demo9{
				public static void main(String [] args){
					int n=12345;
					int count1=0;
					int count2=0;
					while(n>0){
						int rem=n%10;
						n=n/10;
						if(rem%2==0){
							count1++;
						}else{
							count2++;
						}
					}
					System.out.println("Even :"+count1);
					System.out.println("Odd :"+count2);
				}
}