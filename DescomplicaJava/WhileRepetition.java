package DescomplicaJava;
import java.util.Scanner; /* Lembre-se de sempre importar esta ferramenta para inputs */


public class WhileRepetition {
    public static void main(String[] args) {
        int opcao = 0; /* Sempre iniciar a variavel como zero para atribuir um valor futuro */
        
        while (opcao != 99) /* O Atributo dentro deve ser a condição */ {
            System.out.println("Digite um numero ou 99 para sair: "); /*Comunicando para o usuario */
            Scanner entrada = new Scanner(System.in); /* Chamando o input */
            opcao = entrada.nextInt(); /* Vinculando a entrada do dado com a variavel */
    }

    }
    
}
