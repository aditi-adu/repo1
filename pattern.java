import java.util.Scanner;
class Test{
public static void main(String args[]){
int n,i,j,k;
Scanner sc=New Scanner(System.in);
System.out.println("Enter number of rows:");
n=sc.nextInt();
k=1;
for(i=0;i<n;i++){
for(j=n-i;j>0;j--){
System.out.print(" ");
}
for(j=0;j<2*i+1;j++){
System.out.print(k);
k++;
}
System.out.println("");
}
}
}

