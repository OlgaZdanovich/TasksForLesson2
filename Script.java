/**Простая (2 балла)
 * Пользователь задает целое число, больше или равно 100 (например, 3801).
 * Определить третью цифру справа в этом числе (в данном случае 8).
 */
import java.util.Scanner;
public class Script {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число >= 100\n");
        int InputNumber = in.nextInt();
        int NewNumber = (InputNumber / 100) % 10;

        System.out.printf("Третья цифра справа: %d\n",NewNumber);

        in.close();
    }
}
