package DescomplicaJava;

public class NestedStructure {
    public static void main(String[] args) {
        int nota = 3;

        if(nota >= 6){
            System.out.println("Aprovado");
        }else if(nota <= 5 && nota >= 3.5){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
    }
}
