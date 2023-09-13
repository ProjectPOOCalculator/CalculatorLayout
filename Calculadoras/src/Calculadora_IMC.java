import javax.swing.*;

import java.awt.*;

public class Calculadora_IMC extends JPanel{
    public Calculadora_IMC() {
        //criação dos componentes
        JLabel alturaUsuario = new JLabel("Digite sua altura(m): ");
        JLabel pesoUsuario = new JLabel("Digite seu peso(kg): ");
        JTextField campoAltura = new JTextField(10);
        JTextField campoPeso = new JTextField(10);
        JButton botaoCalcular = new JButton("Calcular");
        JLabel resultadoIMC = new JLabel("IMC: ");
        JTextField campoResultado = new JTextField(10);
        campoResultado.setEditable(false);



       // Criação dos painéis
       JPanel painelPrincipal = new JPanel(new BorderLayout()); // Border Layout
       this.add(painelPrincipal);
       JPanel painelBotoes = new JPanel();
       this.add(painelBotoes);
       JPanel painelInputs = new JPanel(new GridLayout(2, 2));
      this.add(painelInputs);
       JPanel painelResultado = new JPanel();
       this.add(painelResultado);
    //    JPanel painel5 = new JPanel(new FlowLayout());
    //    this.add(painel5);
    //    JPanel painel6 = new JPanel(new GridLayout(2,1));
       
       // adicionando os componentes aos painéis
       painelInputs.add(alturaUsuario);
       painelInputs.add(pesoUsuario);
       painelInputs.add(campoAltura);
       painelInputs.add(campoPeso);

       painelBotoes.add(botaoCalcular);

       painelResultado.add(resultadoIMC);
       painelResultado.add(campoResultado);

       // adicionando os painéis ao painel principal
       painelPrincipal.add(painelInputs, BorderLayout.NORTH);
       painelPrincipal.add(painelBotoes, BorderLayout.CENTER);
       painelPrincipal.add(painelResultado, BorderLayout.SOUTH);
        

       
    //    painel2.add(alturaUsuario);

       
    //    painel2.add(campoAltura);

        
    //    painel3.add(pesoUsuario);

       
    //    painel3.add(campoPeso);



       
    //    painel4.add(botaoCalcular);
    //    painel4.setSize(10, 10);

    //    JTextField calculado = new JTextField(15);
    //    painel5.add(calculado);

       

    // //    painel0.add(painel1);
    //    painel1.add(painel2, BorderLayout.CENTER);
    //    painel1.add(painel3, BorderLayout.NORTH);
       
    //    painel1.add(painel6, BorderLayout.SOUTH);
    //    painel6.add(painel4);
    //    painel6.add(painel5);







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
       
    //Addind the main panel to the frame
    

    //Setting the dimension and making the frame visible
    
    
    }
}
