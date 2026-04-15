package br.fiap.viagem;

import br.fiap.carga.Carga;

import java.util.Scanner;

public class Viagem {
    private double capacidade;
    private int index;
    private Carga[] carga;

    public String getDados(){
        String aux="";
        for (int i=0; i<index;i++){
            aux+=carga[i].getDados();
        }
        return aux;
    }

    public boolean reservar(Carga carga){
        Scanner sc=new Scanner(System.in);
        if (permitidoReservar(carga.getPeso())){
            this.carga[index]=carga;
            index++;
            return true;
        }
        return false;
    }

    public boolean permitidoReservar(double pesoTotal){
        double aux=capacidadeReservado();
        if (index<carga.length&&aux+pesoTotal<=capacidade){
         return true;
        }
        return false;
    }

    public double capacidadeReservado(){
        double pesoTotal=0;
        for (int i=0;i<index;i++){
            pesoTotal+=carga[i].getPeso();
        }
        return pesoTotal;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Carga[] getCarga() {
        return carga;
    }

    public void setCarga(Carga[] carga) {
        this.carga = carga;
    }

    public Viagem(){
        capacidade=10000;
        index=0;
        carga=new Carga[20];


    }

}
