import javax.swing.*;
import java.awt.*;
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

        JLabel label = new JLabel("CALCULATOR DÓLAR TO REAL");
        painel1.add(label, BorderLayout.NORTH);
        
        JTextArea title = new JTextArea(2,10);
        painel1.add(title, BorderLayout.SOUTH);


        //criando e adicionando os componentes ao painel2
        JLabel label2 = new JLabel("Valor em Dólar");
        painel2.add(label2);

        JTextField texto = new JTextField(10);
        painel2.add(texto);

        //customização do botao1
        JButton botao1 = new JButton("Calcular");
        painel2.add(botao1);
        botao1.setBackground(Color.GRAY);
        botao1.setFont(new Font("Arial", Font.BOLD, 16));

        //adicionando o painel 2 ao painel 1
        painel1.add(painel2, BorderLayout.CENTER);

    }
}
