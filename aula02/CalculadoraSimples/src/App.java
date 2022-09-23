public class App {
    public static void main(String[] args) throws Exception {

        double x = 15;
        double y = 2;

        // Método para fazer a adicao de x, y
        adicao(x, y);

        // Método para fazer a subtração de x, y
        subtracao(x, y);

        // Método para fazer a multiplicação de x, y
        multiplicacao(x, y);

        // Método para fazer a divisão de x, y
        divisao(x, y);

    }

    private static void adicao(double n1, double n2) {

        double resultado = n1 + n2;

        System.out.println("Adição de " + n1 + " + " + n2 + " = " + resultado);
    }

    private static void subtracao(double n1, double n2) {
        double resultado = n1 - n2;

        System.out.println("Subtração de " + n1 + " - " + n2 + " = " + resultado);
    }

    private static void multiplicacao(double n1, double n2) {

        double resultado = n1 * n2;

        System.out.println("Multiplicação de " + n1 + " * " + n2 + " = " + resultado);
    }

    private static void divisao(double n1, double n2) {

        double resultado = n1 / n2;

        System.out.println("Divisão de " + n1 + " / " + n2 + " = " + resultado);
    }
}
