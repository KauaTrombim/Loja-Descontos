


package descontosloja;

/**
 *
 * @author Kauã Benjamin
 */

import javax.swing.JOptionPane;
public class DescontosLoja {
    public static void main(String[] args) {
        
        // Declaração de variáveis
        String auxiliar;
        float valorCompra;
        float descontoCompra;
        
        // Entrada de dados
        JOptionPane.showMessageDialog(null,"Olá :D \n Bem vindo à Loja Descontos!"); // Interação com usuário
        auxiliar = JOptionPane.showInputDialog("Qual o valor de sua compra?"); // solicitacao de valor para ser calculado sendo armazenado na variavel auxiliar
        valorCompra = Float.parseFloat(auxiliar); // conversão da variavel auxiliar
        
        // Processamento de dados
        if (valorCompra < 200.00) {
            descontoCompra = 0.05f * valorCompra;
            valorCompra = (valorCompra - descontoCompra);
            JOptionPane.showMessageDialog(null, "Você recebeu 5% de desconto! Sua compra totalizou R$" + String.format("%.2f", valorCompra));
        }
        else {
            if (valorCompra >= 200.00 && valorCompra < 300.00) {
                descontoCompra = 0.1f * valorCompra;
                valorCompra = (valorCompra - descontoCompra);
                JOptionPane.showMessageDialog(null, "Você recebeu 10% de desconto! Sua compra totalizou R$" + String.format("%.2f", valorCompra));
            }else {
                    descontoCompra = 0.15f * valorCompra;
                    valorCompra = (valorCompra - descontoCompra);
                    JOptionPane.showMessageDialog(null, "Você recebeu 15% de desconto! Sua compra totalizou R$" + String.format("%.2f", valorCompra));
            }
        }
        
    }
    
}
