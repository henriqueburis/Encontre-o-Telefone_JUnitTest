/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encontre.o.telefone;

/**
 *
 * @author luiz.buris
 */
public class EncontreOTelefone {

    String Saida = "";

    public String EncontreTelefone(String entrada) {

        for (int i = 0; i < entrada.length(); i++) {
//            System.out.println(entrada.substring(i, i + 1));

            if (entrada.substring(i, i + 1).equalsIgnoreCase("A") || entrada.substring(i, i + 1).equalsIgnoreCase("B") || entrada.substring(i, i + 1).equalsIgnoreCase("C")) {
//                System.out.println("2");
                Saida = Saida + 2;
            } else if (entrada.substring(i, i + 1).equalsIgnoreCase("D") || entrada.substring(i, i + 1).equalsIgnoreCase("E") || entrada.substring(i, i + 1).equalsIgnoreCase("F")) {
//                System.out.println("3");
                Saida = Saida + 3;
            } else if (entrada.substring(i, i + 1).equalsIgnoreCase("G") || entrada.substring(i, i + 1).equalsIgnoreCase("H") || entrada.substring(i, i + 1).equalsIgnoreCase("I")) {
//                System.out.println("4");
                Saida = Saida + 4;
            } else if (entrada.substring(i, i + 1).equalsIgnoreCase("J") || entrada.substring(i, i + 1).equalsIgnoreCase("K") || entrada.substring(i, i + 1).equalsIgnoreCase("L")) {
//                System.out.println("5");
                Saida = Saida + 5;
            } else if (entrada.substring(i, i + 1).equalsIgnoreCase("M") || entrada.substring(i, i + 1).equalsIgnoreCase("N") || entrada.substring(i, i + 1).equalsIgnoreCase("O")) {
//                System.out.println("6");
                Saida = Saida + 6;
            } else if (entrada.substring(i, i + 1).equalsIgnoreCase("P") || entrada.substring(i, i + 1).equalsIgnoreCase("Q") || entrada.substring(i, i + 1).equalsIgnoreCase("R") || entrada.substring(i, i + 1).equalsIgnoreCase("S")) {
//                System.out.println("7");
                Saida = Saida + 7;
            } else if (entrada.substring(i, i + 1).equalsIgnoreCase("T") || entrada.substring(i, i + 1).equalsIgnoreCase("U") || entrada.substring(i, i + 1).equalsIgnoreCase("V")) {
//                System.out.println("8");
                Saida = Saida + 8;
            } else if (entrada.substring(i, i + 1).equalsIgnoreCase("W") || entrada.substring(i, i + 1).equalsIgnoreCase("X") || entrada.substring(i, i + 1).equalsIgnoreCase("Y") || entrada.substring(i, i + 1).equalsIgnoreCase("Z")) {
//                System.out.println("9");
                Saida = Saida + 9;
            } else {
                Saida = Saida + entrada.substring(i, i + 1);
            }
        }

        return Saida;
    }

}
