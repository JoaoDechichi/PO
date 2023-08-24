
import br.com.controle.Km;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author joao.fernando
 */
public class Tela {
    
    public static void main(String[] args) {
        Km k = new Km();
        
        k.setKmI(Double.parseDouble(JOptionPane.showInputDialog("Digite o km inicial: ")));
        k.setKmF(Double.parseDouble(JOptionPane.showInputDialog("Digite o km final: ")));
        k.setLA(Double.parseDouble(JOptionPane.showInputDialog("Digite os litros abastecidos: ")));
        
        JOptionPane.showMessageDialog(null, k.calculoC() );
    }
}
