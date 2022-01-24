/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cbeat
 */
public class Caneta {
public String modelo;
private String cor;
private float ponta;
private boolean tampada;


    public Caneta(String modelo, String cor, float ponta, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = tampada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
public void status() {
    System.out.println("Sobre a caneta;");
    System.out.println("Modelo: " + this.getModelo());
    System.out.println("Ponta: " + this.getPonta());
    System.out.println("Cor: " + this.cor);
    System.out.println("Tampada:" + this.tampada);
    
}    


}



    /**
publiv voi
     */
    
        // TODO code application logic here
    
    

