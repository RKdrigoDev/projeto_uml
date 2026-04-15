package br.fiap.util;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
public class Util {
    public void menu(){
        int opcao;
        String aux="Reserva de Cargas Boa Viagem \n";
        aux+="[1] Reservar\n";
        aux+="[2] Pesquisar\n";

        do{
            opcao=parseInt(showInputDialog(aux));
        }while (opcao!=6);
    }
}
