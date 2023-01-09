import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a Size");
        int size=21;
        int[] arr;
        Scanner s=new Scanner(System.in);
        while(size>20){
            size=s.nextInt();
            if(size>20){
                System.out.println("Size have to smaller than 20. Try again");
            }
        }
        arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter number index "+i);
             arr[i]=s.nextInt();
            System.out.println("inputted "+arr[i]);
        }
        System.out.println("Your input array is "+ Arrays.toString(arr));
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println("inverse of your array is "+Arrays.toString(arr));
    }
}