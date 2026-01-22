class Demo5{
				public static void main(String [] args){
					int n=121;
					int rev=0;
					int temp=n;
					while(n>0){
						int rem=n%10;
						rev=rev*10+rem;
						n=n/10;
					}
					if(rev==temp){
						System.out.println("palindrome");
					}else{
						System.out.println("not palindrome");
					}
				}
}