import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BonusMilesService service = new BonusMilesService();
        int price = 12334;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}