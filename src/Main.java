import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Нажмите 1, чтобы ввести ряд самостоятельно или 2, чтобы использовать тесты: ");
        int num = in.nextInt();
        if (num == 2) test();
        else if (num == 1) {
            System.out.print("Введите размерность ряда: ");
            num = in.nextInt();
            int[] mas = new int[num];
            System.out.println("Введите ряд через Enter");
            for (int i = 0; i < num; i++)
                mas[i] = in.nextInt();
            System.out.println(solution(mas));
        }
        else System.out.println("Ошибка!");
    }

    static void test(){
        Random rand = new Random();
        System.out.print("Ряд: ");
        int [] mas = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i]);
        System.out.println();
        System.out.println(solution(mas));
        System.out.print("Ряд: ");
        mas = new int[]{9, 8, 9, 8, 9, 8, 9, 8, 9, 8, 9, 8, 9, 8, 9, 8, 9};
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i]);
        System.out.println();
        System.out.println(solution(mas));
        System.out.print("Ряд: ");
        mas = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9};
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i]);
        System.out.println();
        System.out.println(solution(mas));
        System.out.print("Ряд: ");
        mas = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i]);
        System.out.println();
        System.out.println(solution(mas));
        for (int i = 0; i < 6; i++){
            System.out.print("Ряд: ");
            for (int j = 0; j < mas.length; j++){
                mas[j] = rand.nextInt(8) + 1;
                System.out.print(mas[j]);
            }
            System.out.println();
            System.out.println(solution(mas));
        }
    }

    static String solution(int [] mas){
        int k = 0;
        int min = 0;
        for (int i = 0; i < mas.length; i++) {
            if (i == mas.length - 1){
                if (k != 0) min++;
                break;
            }else if (mas[i] > mas[i + 1]){
                k++;
            } else if ((mas[i] < mas[i + 1]) && (k != 0)){
                k = 0;
                min++;
            }
        }
        return "Количество итервалов убывания: " + min;
    }
}
