class Demo5{
			public static void main(String[] args){
				int num1=56;
				int num2=7;
				int num3=99;
				if(num1<num2 && num1<num3){
					System.out.println("minimum : "+num1);		
				}else if(num2<num3){
					System.out.println("minimum : "+num2);		
				}else{
					System.out.println("minimum : "+num3);		
				}
			}
}