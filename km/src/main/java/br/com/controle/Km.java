/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author joao.fernando
 */
public class Km {
    private double KmI;
    private double KmF;
    private double LA;

    public double getKmI() {
        return KmI;
    }

    public void setKmI(double KmI) {
        this.KmI = KmI;
    }

    public double getKmF() {
        return KmF;
    }

    public void setKmF(double KmF) {
        this.KmF = KmF;
    }

    public double getLA() {
        return LA;
    }

    public void setLA(double LA) {
        this.LA = LA;
    }
    
    public double calculoC(){
    
    double calculo;
    
    calculo = ((KmF - KmI)/LA);
    
    return calculo;
    }
    
}
