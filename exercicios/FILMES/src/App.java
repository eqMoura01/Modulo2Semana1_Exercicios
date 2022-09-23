import java.util.Scanner;

import midias.MidiaFuncs;

public class App {
    public static void main(String[] args) throws Exception {

        /* Apenas imprime um texto no console para dar as boas-vindas */
        System.out.println("===========================");
        System.out.println("XILFTEN");
        System.out.println("===========================");

        /*
         * Cria uma variavel booleana para controlar o loop 'while' (ñ necessario, pois
         * dentro do 'switch' ja tem um 'case' para encerrar o programa)
         */
        boolean sair = false;
        /* Cria uma variavel de numero inteiro para ser o controlador do 'switch' */
        int comandoFuncs;

        /*
         * Como usar o 'while':
         * https://www.devmedia.com.br/forum/como-usar-o-while-em-java/568938
         */
        while (sair == false) {
            System.out.println("");
            System.out.println("O que você deseja fazer?");
            System.out.println(
                    "[1]Listar\n[2]Adicionar\n[3]Remover\n[4]Marcar como assistido\n[5]Listar apenas assistidos\n[0]Sair");

            /* Cria um input para o usuario escolher o que quer fazer */
            Scanner s = new Scanner(System.in);
            comandoFuncs = s.nextInt();

            /* Como usar o switch: https://bityli.com/fpyjGx */
            switch (comandoFuncs) {
                case 1:
                    MidiaFuncs.listarMidias();
                    break;
                case 2:
                    MidiaFuncs.adicionarMidia();
                    break;
                case 3:
                    MidiaFuncs.removerMidia();
                    break;
                case 4:
                    MidiaFuncs.adicionarMidiaAssistidas();
                    break;
                case 5:
                    MidiaFuncs.listarMidiasAssistidas();
                    break;
                case 0:
                    System.out.println("===========================");
                    System.out.println("O Xilften irá fechar agora!");
                    System.out.println("===========================");
                    return;
                case default:
                    System.out.println("Funcionalidade não reconhecida, por favor tente novamente.");
            }
        }

    }
}
