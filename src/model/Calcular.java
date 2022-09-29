package model;

import java.util.Random;

public class Calcular
{
    private int dificuldade;
    private int valor1;
    private int valor2;
    private int operacao;
    private int resultado;

    public Calcular(int dificuldade) {
        Random rand = new Random();

        this.operacao = rand.nextInt(3); // 0 - somar, 1 - diminuir, 2 - multiplicar
        this.dificuldade = dificuldade;

        if(dificuldade == 1) {
            //fácil
            this.valor1 = rand.nextInt(10); // 0 a 9
            this.valor2 = rand.nextInt(10); // 0 a 9
        }else if (dificuldade == 2) {
            //médio
            this.valor1 = rand.nextInt(100); // 0 a 99
            this.valor2 = rand.nextInt(100); // 0 a 99
        }else if (dificuldade == 3) {
            //difícil
            this.valor1 = rand.nextInt(1000); // 0 a 999
            this.valor2 = rand.nextInt(1000); // 0 a 999
        }else if (dificuldade == 4) {
            //insano
            this.valor1 = rand.nextInt(10000); // 0 a 9999
            this.valor2 = rand.nextInt(10000); // 0 a 9999
        }else {
            //ultra
            this.valor1 = rand.nextInt(100000); // 0 a 99999
            this.valor1 = rand.nextInt(100000); // 0 a 99999
        }
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public int getOperacao() {
        return operacao;
    }

    public int getResultado() {
        return resultado;
    }

    public String toString() {
        String op;
        if (this.getOperacao() == 0){
            op = "Somar";
        } else if (this.getOperacao() == 1) {
            op = "Diminuir";
        } else if (this.getOperacao() == 2) {
            op = "Dividir";
        }else {
            op = "Operação Inválida.";
        }
        return "Valor 1: " + this.getValor1() +
                "\nValor2: "+ this.getValor2() +
                "\nDificuldade: " + this.getDificuldade() +
                "\nOperação: " + op;
    }

}
