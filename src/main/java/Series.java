import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1) {
            fibonacci((n / 2) + 1);
        }
        else {
            prime(n / 2);
        }
    }

    private static void prime(int n) {
        int MAX=99999;
        int flag=0;
        int count=0;
        for(int i=2;i<=MAX;i++){
           flag=0;
           for(int j=2;j<=i;j++){
               if(j%i==0){
                   flag=1;
                   break;
               }
           }
            if(flag==0){
                if(++count==n){
                    System.out.printf("%d",i);
                }

            }
        }

    }

    private static void fibonacci(int n) {
        int a=0,b=1,next=0;
        for(int i=1;i<=n;i++){
            next=a+b;
            a=b;
            b=next;
        }
        System.out.printf("%d",a);
    }

}
