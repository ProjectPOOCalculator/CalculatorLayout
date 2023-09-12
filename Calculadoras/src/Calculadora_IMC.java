import javax.swing.*;

import java.awt.*;

public class Calculadora_IMC extends JPanel{
    public Calculadora_IMC() {
       // Criação dos painéis
       JPanel painel0 =  new JPanel(new BorderLayout()); // Border Layout
       this.add(painel0);
       JPanel painel1 = new JPanel(new BorderLayout()); // Border Layout
       this.add(painel1);
       JPanel painel2 = new JPanel(new FlowLayout()); // Flow Layout
       this.add(painel2);
       JPanel painel3 = new JPanel(new FlowLayout());
       this.add(painel3);

        JLabel titulo = new JLabel("CALCULADORA DE IMC: ");
       painel0.add(titulo, BorderLayout.NORTH);

       JLabel label = new JLabel("digite sua altura: ");
       painel2.add(label);

       JTextField campo = new JTextField(5);
       painel2.add(campo);

        JLabel label2 = new JLabel("digite seu peso: ");
       painel3.add(label2);

       JTextField campo2 = new JTextField(5);
       painel3.add(campo2);

       painel1.add(painel2, BorderLayout.SOUTH);
       painel1.add(painel3, BorderLayout.NORTH);
       painel0.add(painel1);









    //    // Adição dos componentes ao painel1
    //    JTextArea textArea = new JTextArea(2, 10);
    //    painel1.add(textArea, BorderLayout.NORTH);
    //    JLabel label = new JLabel("Insira o valor: em R$");
    //    painel1.add(label, BorderLayout.EAST);

    //    painel1.add(textArea, BorderLayout.NORTH);
    //    painel1.add(label, BorderLayout.WEST);

    //    // Adição dos componentes ao painel2
    //    JLabel valorDolarLabel = new JLabel("Valor em Dólar:");
    //    JTextField textField = new JTextField(10);
    //    JButton calcularButton = new JButton("Calcular");

    //    painel2.add(valorDolarLabel);
    //    painel2.add(textField);
    //    painel2.add(calcularButton);

    //    // Adição dos painéis ao JFrame
    //    setLayout(new GridLayout(2, 1));
    //    add(painel1);
    //    add(painel2);

    //    // Configurações do JFrame
       
    //    setSize(300, 200);
    }
}
