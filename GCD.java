import java.util.Scanner;
class GCD{
	public static void main(String args[]){
	
	 Scanner sc= new Scanner(System.in);

	 int x=sc.nextInt();
	 int a[]=new int[x];
	System.out.println("Enter element:");
	 for(int j=0;j<x;j++)
		a[j]=sc.nextInt();	       
	
	// int a[]={16,40,32,4,8,22};
	 int r=0,q=0;//,x=a.length;
	for(int i=0;i<(a.length-1);i++){
	  while(a[i+1]>0){
	     q=a[i]/a[i+1];
	     r=a[i]-q*a[i+1];
	     a[i]=a[i+1];
	     a[i+1]=r;
	 }
	 a[i+1]=a[i];
	}
	System.out.println("GCD is"+ a[x-1]);
}
}