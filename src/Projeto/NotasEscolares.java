package Projeto;

import java.util.Scanner;

public class NotasEscolares {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float notas[] = new float[5];
        String aluno, resultado;

        System.out.println("notas escolares");
        System.out.print("informe o nome do aluno ");
        aluno = ler.next();
        aluno = aluno.toUpperCase();

        for (int i = 0; i < 4; i++){
            System.out.print("informe a "+(i + 1)+"ª nota ");
            notas[i] = ler.nextFloat();
            notas[4] +=notas[i];
        }
        notas [4] = notas[4]/4;

        if (notas[4]>=7){
            resultado = "aprovado";
        }else{
            resultado = "reprovado!";
        }

        System.out.println("o aluno(a) "+ aluno + "teve a média "+ notas[4] + "foi "+resultado);
    }
}
    

