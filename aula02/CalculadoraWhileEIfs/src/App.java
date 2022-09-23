import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        bemVindo();
        calculadora();
    }

    private static void bemVindo() {
        System.out.println("Bem-vindo a Calculadora com uso de While e Switch!");

    }

    private static void calculadora() {

        boolean continuar = true;

        while (continuar == true) {

            Scanner s = new Scanner(System.in);
            String operacao = "";
            double n1, n2;

            System.out.println("==================================================");
            System.out.println("Qual operação você quer realizar?");
            System.out.println("Informe uma operação matematica [+, -, *, /] ou digite [sair]");

            operacao = s.nextLine();

            if (operacao.toLowerCase().equals("sair")) {
                System.out.println("Ok, o programa irá encerrar agora.");
                continuar = false;
            } else {
                if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")) {

                    System.out.println("Digite o 1º valor: ");
                    n1 = s.nextDouble();
                    System.out.println("Digite o 2º valor: ");
                    n2 = s.nextDouble();

                    realizarOperacao(operacao, n1, n2);
                } else {
                    System.out.println("Operação não reconhecida.");
                }
            }

        }

    }

    private static void realizarOperacao(String operacao, Double n1, Double n2) {
        double resultado;
        switch (operacao) {
            case "+":
                resultado = n1 + n2;
                System.out.printf("%s + %s = %s \n", n1, n2, resultado);
                break;

            case "-":
                resultado = n1 - n2;
                System.out.printf("%s - %s = %s \n", n1, n2, resultado);
                break;

            case "*":
                resultado = n1 * n2;
                System.out.printf("%s * %s = %s \n", n1, n2, resultado);
                break;

            case "/":
                resultado = n1 / n2;
                System.out.printf("%s / %s = %s \n", n1, n2, resultado);
                break;

            case default:
                System.out.println("Operação não reconhecida");
                break;
        }
    }
}
