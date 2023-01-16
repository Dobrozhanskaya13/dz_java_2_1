import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int o=1;// для диалогового окна
        int m = 0;// мили
        int cnt = 20;//рублей для одной бонусной мили

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //для считывания данных с клавиатуры

        while (o==1)
        {       System.out.println("Введите стоимость билета:");
                String c = reader.readLine();
                double costs = Double.parseDouble(c);
                m = (int) costs / cnt;
                System.out.println("Количество бонусных миль " + m);
                System.out.println("Хотите рассчитать повторно? Если да, то введите цифру 1");
                String c1 = reader.readLine();
                 o=Integer.parseInt(c1);
                if (o!=1)
                {
                    System.out.println("Хотите завершить рассчет? Нажмите q");
                    String q = reader.readLine();
                    if (q=="q")
                    {
                        System.exit(0);
                    }
                }

        }
    }
}