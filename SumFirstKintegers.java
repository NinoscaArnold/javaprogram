import java.util.Scanner;
class SumFirstKIntegers{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("enter value for N");
int N=scan.nextInt();
int[] arr=new int[N];
for(int i=0;i<N;i++){
int temp=scan.nextInt();
arr[i]=temp;
}
System.out.println("output");
for(int K=0;K<N;K++){
System.out.println(arr[K]);
}
}
}
