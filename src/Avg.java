import java.sql.SQLOutput;
/***1. Passing array as an argument to a function - Imagine you have a function that calculates the average
of a collection of numbers. How would you design the function to accept the collection of numbers
        as input, and returns average as output?**/

public class Avg {
    public static int calculateavg(int[] numbers){
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        return sum/numbers.length;
    }
    public static void main(String[] args){
        int[] Array={10,20,30,40,50,60};
        int average=calculateavg(Array);
        System.out.println("Average:"+average);
    }

}
