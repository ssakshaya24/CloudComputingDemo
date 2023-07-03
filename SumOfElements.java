import java.util.*;
class SumOfElements {
    public static void main(String[] args) {

        // Changed int type to long type for computing long integers
        int length=0;
        long sum=0;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of the array : ");
        length = sc.nextInt();

        long ar[]=new long[length];

        //Removed New Lines in print Statements
        for(int i=0;i<length;i++)
        {
            System.out.print("Enter the elements of the array : ");
            ar[i]=sc.nextInt();
            sum+=ar[i];
        }
        System.out.println("The sum of the elements of the array is: "+sum);

    }
}
