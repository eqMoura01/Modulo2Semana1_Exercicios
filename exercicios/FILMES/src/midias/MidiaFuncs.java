package midias;

import java.util.ArrayList;
import java.util.Scanner;

public class MidiaFuncs {

    /* Cria um 'ArrayList' para cada um dos nossos objetos */
    static ArrayList<Midia> midias = new ArrayList<Midia>();
    static ArrayList<Midia> midiasAssistidas = new ArrayList<Midia>();

    /* Adiciona uma midia a nossa lista de midias. */
    public static void adicionarMidia() {

        Scanner s = new Scanner(System.in);

        System.out.println("\nQual é o titulo da midia a ser inserida?");
        String titulo = s.nextLine();

        System.out.println("\nE isso é um filme ou uma serie?");
        String tipo = s.nextLine();

        midias.add(new Midia(titulo, tipo));

        System.out.println("\n'" + titulo + "' foi adicionado a sua lista como um(a):" + tipo);

    }

    /* Lista todas as midias previamente cadastradas. */
    public static void listarMidias() {

        // midias.size() retorna o tamanho da nossa lista.
        System.out.println("O total de midias adicionadas é " + midias.size());

        /*
         * Como usar o laço 'for':
         * https://www.devmedia.com.br/forum/como-usar-o-for-em-java/565177
         */
        for (int i = 0; i < midias.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + midias.get(i));
        }
    }

    /* Possibilita remover alguma midia da nossa lista atraves do indice. */
    public static void removerMidia() {
        System.out.println("Qual o indice da midia que você gostaria de remover?");
        listarMidias(); // ctrl + clique para ver o metodo.

        Scanner s = new Scanner(System.in);
        int index = s.nextInt() - 1;

        Midia x = midias.get(index);

        System.out.println("A midia '" + midias.get(index) + "' foi removida com sucesso!");

        /* O metodo '.remove()' remove um item do ArrayList */
        midias.remove(x);
        midiasAssistidas.remove(x);

    }

    /* Permite marcar uma midia como assistida */
    public static void adicionarMidiaAssistidas() {
        System.out.println("\nQual é o Indice da midia que deve ser marcada?");
        listarMidias(); // ctrl + clique
        System.out.println("");

        Scanner s = new Scanner(System.in);

        int n = s.nextInt() - 1;

        /* O metodo '.add()' adiciona um elemento ao ArrayList */
        midiasAssistidas.add(midias.get(n));
    }

    /* Lista apenas as midias que foram marcadas como assistidas. */
    public static void listarMidiasAssistidas() {
        System.out.println("O total de midias que ja foram assistidas é " + midiasAssistidas.size());
        for (int i = 0; i < midiasAssistidas.size(); i++) {
            System.out.println("[" + i + "]" + midiasAssistidas.get(i));
        }
    }

}
