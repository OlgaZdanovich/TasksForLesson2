/**
 * Простая (2 балла)
 * Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и
 * прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).
 * Определите время поезда в пути в минутах (в данном случае 216).
 */
import java.util.Scanner;
public class Script {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите время отправления в формате: hh:mm\n");
        String InputStr0 = in.nextLine();

        System.out.print("Введите время прибытия в формате: hh:mm\n");
        String InputStr1 = in.nextLine();

        String[] arr0 = InputStr0.split(":");
        String Hh0 = arr0[0];
        String Mm0 = arr0[1];

        int H0 = Integer.parseInt (Hh0);
        int M0 = Integer.parseInt (Mm0);


        String[] arr1 = InputStr1.split(":");
        String Hh1 = arr1[0];
        String Mm1 = arr1[1];

        int H1 = Integer.parseInt (Hh1);
        int M1 = Integer.parseInt (Mm1);


        if(H0>24|H0<0|M0>60|M0<0|H1>24|H1<0|M1>60|M1<0) {
            System.out.print("Конец программы. Выход за пределы допустимых значений.");
        } else {
            int TimeSec0 = (H0*60)+M0;
            int TimeSec1 = (H1*60)+M1;
            int Result = TimeSec1 - TimeSec0;
            System.out.printf("Время в пути в минутах: %d\n",Result);
        }

        in.close();
    }
}
