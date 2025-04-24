import java.util.Random;

public class random {
    public static void main(String[] args) {

        int num1;
        double num2;
        int num3;

        Random random = new Random();

        num1 = random.nextInt(20,40);
        num2 = random.nextDouble();
        num3 = random.nextInt(1,600);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}
