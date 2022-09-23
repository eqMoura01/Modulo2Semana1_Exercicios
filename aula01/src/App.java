import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {

        Calendar cal = Calendar.getInstance();
        
        int n, anoAtual;

        anoAtual = cal.get(Calendar.YEAR);

        Scanner s = new Scanner(System.in);

        System.out.println("Digite ano que você nasceu.");

        n = s.nextInt();
        s.close();

        System.out.println("Sua idade é " + (anoAtual - n));

    }

}
