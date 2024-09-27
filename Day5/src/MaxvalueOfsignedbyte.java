import java.util.Scanner;

public class MaxvalueOfsignedbyte {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the byte value within the range -128 to 127:");
        byte value=sc.nextByte();

        System.out.println("The value of number entered is: "+value);

        if(value >=-128 && value <=127 ){
            byte number=(byte) value;
            System.out.println("the value of number:"+number);
            number=127;
            System.out.println("largest value stored in a signed bye: "+number);
        }else{
            System.out.println("wrong value! , Enter the byte value within the range -128 to 127:");
        }


    }
}
