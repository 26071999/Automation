import java.util.Scanner;

public class DistanceMeasurement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testCase=sc.nextInt();
       getDistance(testCase);
    }

    private static void getDistance(int testCase) {
        int distance=10;
        int x=0;
        int y=0;
        char ch='R';
        while (testCase>0){
            switch (ch){
                case 'R':
                    x=x+distance;
                    ch='U';
                    distance+=10;
                    break;
                case 'U':
                    y=y+distance;
                    ch='L';
                    distance+=10;
                    break;
                case 'L':
                    x=x-distance;
                    ch='D';
                    distance+=10;
                    break;
                case 'D':
                    y=y-distance;
                    ch='A';
                    distance+=10;
                    break;
                case 'A':
                    x=x+distance;
                    ch='R';
                    distance+=10;
                    break;
            }
            testCase--;
        }
        System.out.println(x+","+y);
    }
}
