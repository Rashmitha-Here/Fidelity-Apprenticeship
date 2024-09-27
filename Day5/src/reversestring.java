import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();

        String[] words=str.split(" ");

//        StringBuilder reversestring=new StringBuilder();

        for(int i= words.length-1; i>=0; i--){
//            reversestring.append(words[i]);
            System.out.print(words[i]);

            if(i > 0){
                System.out.print(" ");
            }
        }
        sc.close();

        //System.out.println(reversestring.toString());
    }
}
