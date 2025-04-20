import java.util.Scanner;

public class myjava {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int mynum = sc.nextInt();
            System.out.println(
                    " my first number is: "+mynum
            );
            sc.nextLine();

            String mystring = sc.nextLine();
            System.out.println(
                    "my string is: "+mystring
            );
            sc.close();
    }
}
