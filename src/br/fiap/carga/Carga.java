package br.fiap.carga;

import br.fiap.cliente.Cliente;

import java.text.DecimalFormat;
import java.util.Random;

public class Carga {
    private Cliente cliente;
    private int id;
    private String destino;
    private double peso;

    public String getDados(){
        String aux="";
        aux+="ID: "+id+"/n";
        aux+="Destino: "+destino+"/n";
        aux+="Peso: "+String.format("%.2f",peso)+"/n";
        aux+= cliente.getDados();
        return aux;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Carga(String destino, Cliente cliente) {
        Random r=new Random();
        this.destino = destino;
        this.cliente = cliente;
        this.id= r.nextInt(1000,10000);
        this.peso=r.nextDouble(100,1000);
    }
}
