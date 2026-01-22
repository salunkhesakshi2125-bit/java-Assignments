class Demo7{
				public static void main(String [] args){
					int n=4;
					for(int i=1;i<=n;i++){
						for(int j=1;j<=i;j++){
							if(j==1){
								System.out.print("A ");
							}else if(j==2){
								System.out.print("B ");
							}else if(j==3){
								System.out.print("C ");
							}else{
								System.out.print("D ");
							}
						}
						System.out.println();
					}
				}
}