import java.lang.*;
import java.util.Scanner;
    class Test
{
    public static void main( String []args){
      int i,j,n,min,length;
      System.out.println("Enter the number of Rows");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      length=2*n-1;
     for(i=0;i<length;i++)
{
     for(j=0;j<length;j++)
{
     min=(i<j)?i:j;
       min=(min<length-1)?min:length-i-1;
      min=(min <length-j-1)?min:length -j-1;
    System.out.print(n-min);
}
   }
     System.out.println(" ");
}
}