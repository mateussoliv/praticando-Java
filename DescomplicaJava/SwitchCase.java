package DescomplicaJava;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha uma Opção: ");
        System.out.println("1 - Cadastrar um aluno");
        System.out.println("2 - Cadastrar Notas");
        System.out.println("3 - Listar Alunos e Notas");

        int numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Vamos cadastrar um Aluno");
                break;

            case 2:
                System.out.println("Vamos cadastrar notas");
                break;
            
            case 3:
                System.out.println("Listar Alunos");
                break;
            default:
                System.out.println("Numero invalido");
        }

    }

    
    
}
