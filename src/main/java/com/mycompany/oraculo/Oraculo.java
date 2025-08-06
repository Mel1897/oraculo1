/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oraculo;
import javax.swing.JOptionPane;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Oraculo {

    public static void main(String[] args) {
        // O Oráculo pergunta quem são os dois viajantes do tempo
        String nome1 = JOptionPane.showInputDialog("Primeiro viajante, diga seu nome:");
        String idade1str = JOptionPane.showInputDialog("Agora diga sua idade, " + nome1 + ":");
        int idade1 = Integer.parseInt(idade1str);

        String nome2 = JOptionPane.showInputDialog("Segundo viajante, diga seu nome:");
        String idade2str = JOptionPane.showInputDialog("Agora diga sua idade, " + nome2 + ":");
        int idade2 = Integer.parseInt(idade2str);

        String relatorio = "";  // Onde será registrada a análise do Oráculo

        // O Oráculo verifica se estão no mesmo ponto da linha do tempo
        if (idade1 == idade2) {
            relatorio += nome1 + " e " + nome2 + " compartilham a mesma era.\n";
        } else {
            relatorio += nome1 + " e " + nome2 + " pertencem a épocas distintas.\n";
        }

        // Verificando quem começou a jornada primeiro (quem é mais velho)
        if (idade1 > idade2) {
            relatorio += nome1 + " iniciou sua jornada antes de " + nome2 + ".\n";
        } else {
            relatorio += nome1 + " não é mais antigo(a) que " + nome2 + ".\n";
        }

        // Verificando quem é mais jovem (recente na linha do tempo)
        if (idade1 < idade2) {
            relatorio += nome1 + " é mais recente no tempo que " + nome2 + ".\n";
        } else {
            relatorio += nome1 + " não é mais jovem que " + nome2 + ".\n";
        }

        // Conferindo se são viajantes com destinos diferentes
        if (idade1 != idade2) {
            relatorio += "Eles trilham caminhos temporais distintos.\n";
        } else {
            relatorio += "Ambos percorrem o mesmo ciclo do tempo.\n";
        }

        // Verificando se "nome1" é tão antigo quanto ou mais
        if (idade1 >= idade2) {
            relatorio += nome1 + " é de uma era igual ou anterior à de " + nome2 + ".\n";
        } else {
            relatorio += nome1 + " não pertence a uma era igual ou anterior à de " + nome2 + ".\n";
        }

        // Verificando se "nome1" é tão recente quanto ou mais
        if (idade1 <= idade2) {
            relatorio += nome1 + " é tão jovem quanto ou mais recente que " + nome2 + ".\n";
        } else {
            relatorio += nome1 + " não é mais recente nem da mesma era de " + nome2 + ".\n";
        }

        // Agora o Oráculo dá um parecer final com base na diferença de idades
        relatorio += "\nAnálise do Oráculo:\n";
        if (idade1 == idade2) {
            relatorio += "Dois viajantes surgidos sob o mesmo eclipse.\n";
        } else if (idade1 > idade2 && idade1 - idade2 >= 40) {
            relatorio += nome1 + " pertence a uma era ancestral comparada à de " + nome2 + ".\n";
        } else if (idade2 > idade1 && idade2 - idade1 >= 40) {
            relatorio += nome2 + " é um ancião de eras longínquas, diante de " + nome1 + ".\n";
        } else {
            relatorio += "A diferença temporal é pequena, mas suficiente para mudar histórias.\n";
        }

        // Exibe o relatório final na tela
        JOptionPane.showMessageDialog(null, relatorio, "Relatório do Oráculo", JOptionPane.INFORMATION_MESSAGE);
    }
}

