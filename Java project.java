import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random random = new Random();
        double[] salaries = new double[10];

        // تولید حقوق تصادفی
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = 2000 + (3000 - 2000) * random.nextDouble(); // حقوق بین 2000 تا 3000
        }

        System.out.println("حقوق اولیه:");
        for (double salary : salaries) {
            System.out.printf("%.2f\n", salary);
        }

        // اضافه کردن ۸ درصد به حقوق
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] += salaries[i] * 0.08;
        }

        // کم کردن ۶ درصد مالیات از حقوق
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] -= salaries[i] * 0.06;
        }

        System.out.println("\nحقوق بعد از اضافه کردن ۸ درصد و کم کردن ۶ درصد مالیات:");
        for (double salary : salaries) {
            System.out.printf("%.2f\n", salary);
        }
    }
}
