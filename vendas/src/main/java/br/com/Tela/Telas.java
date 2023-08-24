/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.Tela;

import br.com.controle.Vendas;
import javax.swing.JOptionPane;

/**
 *
 * @author joao.fernando
 */
public class Telas {
    
    public static void main(String[] args) {
        
        Vendas v = new Vendas();
        
        v.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: ")));
        v.setParcelas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de parcelas: ")));
        
        JOptionPane.showMessageDialog(null, v.valorFinal());
    }
    
}
