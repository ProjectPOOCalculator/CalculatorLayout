import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_Moedas extends JPanel {
    public Calculadora_Moedas() {
        super();

        // Criando os painéis
        JPanel painelPrincipal = new JPanel(new BorderLayout()); // border Layout
        this.add(painelPrincipal);
        JPanel painelInput = new JPanel(new GridLayout(2, 2)); // grid layout
        this.add(painelInput);
        JPanel painelOutput = new JPanel();
        this.add(painelOutput);
        JPanel painelBotao = new JPanel();
        this.add(painelBotao);

        // Criando os componentes
        JLabel qntDolar = new JLabel("Dólar Americano: ");
        qntDolar.setFont(new Font("Arial", Font.PLAIN, 16));
        qntDolar.setForeground(Color.black);
        qntDolar.setBackground(Color.gray);
        qntDolar.setOpaque(true);
        qntDolar.setHorizontalAlignment(JLabel.CENTER);
        qntDolar.setVerticalAlignment(JLabel.CENTER);


        JLabel realAtual = new JLabel("Real atual: ");
        realAtual.setFont(new Font("Arial", Font.PLAIN, 16));
        realAtual.setForeground(Color.white);
        realAtual.setBackground(Color.black);
        realAtual.setOpaque(true);
        realAtual.setHorizontalAlignment(JLabel.CENTER);
        realAtual.setVerticalAlignment(JLabel.CENTER);

        JLabel realResultado = new JLabel("Real Brasileiro: ");
        realResultado.setFont(new Font("Arial", Font.PLAIN, 16));
        realResultado.setForeground(Color.white);
        realResultado.setBackground(Color.gray);
        realResultado.setOpaque(true);
        realResultado.setHorizontalAlignment(JLabel.CENTER);
        realResultado.setVerticalAlignment(JLabel.CENTER);

        JTextField campoReal = new JTextField(10);
        campoReal.setFont(new Font("Arial", Font.PLAIN, 14));
        //campoReal.setForeground(Color.BLUE);
        //campoReal.setBackground(Color.YELLOW);
        campoReal.setColumns(10);
        campoReal.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        campoReal.setMargin(new Insets(5, 5, 5, 5));
        campoReal.setText("Valor do Dólar Atual");




        JTextField campoDolar = new JTextField(10);
        JTextField campoResultado = new JTextField(10);
        campoResultado.setEditable(false);
        campoResultado.setBorder(new LineBorder(Color.GRAY));

        JButton calcular = new JButton("Calcular 🔄");
        JButton resetar = new JButton("Resetar 🔁");
    

        // Adicionando os elementos aos painéis
        painelInput.add(qntDolar);
        painelInput.add(campoDolar);
        painelInput.add(realAtual);
        painelInput.add(campoReal);

        painelOutput.add(realResultado);
        painelOutput.add(campoResultado);
        painelOutput.add(resetar);

        painelBotao.add(calcular);

        painelPrincipal.add(painelInput, BorderLayout.NORTH);
        painelPrincipal.add(painelBotao, BorderLayout.CENTER);
        painelPrincipal.add(painelOutput, BorderLayout.SOUTH);

        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obter os valores inseridos pelo usuário
                    double real = Double.parseDouble(campoReal.getText());
                    double dolar = Double.parseDouble(campoDolar.getText());

                    // Calcular o resultado
                    double resultado = real * dolar;

                    // Exibir o resultado no campo de resultado
                    campoResultado.setText(String.format("%.2f", resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira números válidos.");
                }
            }
        });

        resetar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoReal.setText("");
                campoDolar.setText("");
                campoResultado.setText("");
            }
        });

    }
}

// JLabel title = new JLabel("CALCULATOR DÓLAR TO REAL");
// painel1.add(title, BorderLayout.NORTH);
// title.setFont(new Font("Arial", Font.PLAIN, 20));

// JTextArea texto0 = new JTextArea(2,10);
// painel1.add(texto0, BorderLayout.SOUTH);

// //criando e adicionando os componentes ao painel2
// JLabel label2 = new JLabel("Valor em Dólar");

// painel2.add(label2);
// label2.setFont(new Font("Arial", Font.PLAIN, 18));

// //customização do texto
// JTextField texto = new JTextField(10);
// painel2.add(texto);
// texto.setFont(new Font("Arial", Font.PLAIN, 18));

// painel2.add(label2);

// //customização do botao1
// JButton botao1 = new JButton("Calcular");
// painel2.add(botao1);
// botao1.setBackground(Color.GRAY);
// botao1.setFont(new Font("Arial", Font.BOLD, 16));

// //adicionando o painel 2 ao painel 1.0
// painel1.add(painel2, BorderLayout.CENTER);
