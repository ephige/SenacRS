package Projeto;

import java.util.Scanner;

public class CalcIMC {
    public static void main(String[] args) {
        float altura, peso, IMC;
        String resultado;
        Scanner ler = new Scanner(System.in);

        System.out.println("Calculadora de IMC: ");
        System.out.print("Digite a altura: ");
        altura = ler.nextFloat();
        System.out.print("digite o peso ");
        peso = ler.nextFloat();

        IMC = calcIMC(altura, peso);
        ler.close();
        System.out.println("seu imc é igual a " + IMC);

        if (IMC < 16) {
            resultado = "magreza grave";
        } else if (IMC < 16.9) {
            resultado = "magreza moderada";
        } else if (IMC < 18.5) {
            resultado = "magreza leve";
        } else if (IMC < 24.9) {
            resultado = "peso ideal";
        } else if (IMC < 29.9) {
            resultado = "sobrepeso";
        } else if (IMC < 34.9) {
            resultado = "obesidade grau 1";
        } else if (IMC < 39.9) {
            resultado = "obesidade grau 2";
        } else {
            resultado = "obesidade grau 3";
        }
        System.out.print("seu IMC é " + IMC + "voce está em " + resultado);
    }

    /**
     * Função calcIMC calcula o IMC de um individuo
     * Recebe os seguintes parametreos
     * 
     * @param altura
     * @param peso
     * @return
     */
    public static float calcIMC(float altura, float peso) {

        return (float) (peso / Math.pow(altura, 2));
    }

}
