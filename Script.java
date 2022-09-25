/**
 * Тривиальная (1 балл)
 * Найти длину отрезка, соединяющего точки на плоскости с координатами (x1, y1) и (x2, y2).
 * Например, расстояние между (3, 0) и (0, 4) равно 5
 */
import java.util.Scanner;
public class Script {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите координаты первой точки x,y через \",\"\n");
        String InputStr1 = in.nextLine();


        System.out.print("Введите координаты второй точки x,y через \",\"\n");
        String InputStr2 = in.nextLine();

        String[] StrLine1 = InputStr1.split(",");
        String x1Str = StrLine1[0];
        String y1Str = StrLine1[1];

        String[] StrLine2 = InputStr2.split(",");
        String x2Str = StrLine2[0];
        String y2Str = StrLine2[1];

        double y1 = Double.parseDouble (y1Str);
        double x1 = Double.parseDouble (x1Str);

        double y2 = Double.parseDouble (y2Str);
        double x2 = Double.parseDouble (x2Str);

        double LengthAB = Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)));
        System.out.printf("Расстояние между точками: %f\n",LengthAB);

        in.close();
    }
}
