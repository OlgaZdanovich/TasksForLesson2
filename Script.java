import java.util.Scanner;
public class Script {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите время в формате: hh:mm:ss\n");

        String InputStr = in.nextLine();
        String[] words = InputStr.split(":");
        String Hh = words[0];
        String Mm = words[1];
        String Ss = words[2];

        int H = Integer.parseInt (Hh);
        int M = Integer.parseInt (Mm);
        int S = Integer.parseInt (Ss);

        if(H>24|H<0|M>60|M<0|S>60|S<0) {
            System.out.print("Конец программы. Выход за пределы допустимых значений.");
        } else {
            int Summa = (H*3600)+(M*60)+S;
            System.out.printf("Время в секундах: %d\n",Summa);
        }
        in.close();
    }
}
