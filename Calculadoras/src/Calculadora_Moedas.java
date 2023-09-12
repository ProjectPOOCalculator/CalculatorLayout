import javax.swing.*;
import java.awt.*;

public class Calculadora_Moedas extends JPanel{
    public Calculadora_Moedas() {
        super();
        //criação dos painéis
        JPanel painel1 = new JPanel(new BorderLayout()); //border Layout
        this.add(painel1);
        JPanel painel2 = new JPanel(new FlowLayout()); //flow layout
        this.add(painel2);

        //criando e adicionando os componentes ao painel1
        painel1.add(new JTextArea(2, 10), BorderLayout.NORTH);
        painel1.add(new JLabel("Insira o valor: em R$"), BorderLayout.WEST);

        //criando e adicionando os componentes ao painel2
        painel2.add(new JLabel("Valor em Dólar:"));
        painel2.add(new JTextField(10));
        painel2.add(new JButton("Calcular"));
        
    }
}
