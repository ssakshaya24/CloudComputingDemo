import java.util.*;
class SumOfEle {
    public static void main(String[] args) {
        int length,sum=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length of the array : ");
        length = sc.nextInt();
        int ar[]=new int[length];

        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<length;i++)
        {
            ar[i]=sc.nextInt();
            sum+=ar[i];
        }
        System.out.println("The sum of the elements of the array is: "+sum);

    }
}
