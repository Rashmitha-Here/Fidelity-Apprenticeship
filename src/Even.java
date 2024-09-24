import java.util.Scanner;

//import java.util.*;
public class Even {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter array elements:");
        int l=input.nextInt();
        int[] a=new int[l];
        int sum=0;
        for(int i=0;i<l;i++){
            System.out.printf("element of a[%d]:",i);
            a[i]=input.nextInt();
        }
        for(int e:a)
        {
            if(e%2==0)
                sum=sum+e;
        }
        System.out.println("sum of even numbers:"+sum);
    }
}
