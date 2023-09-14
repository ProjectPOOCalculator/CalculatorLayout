import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calculadora_Idade extends JPanel {
    public JTextField inputBirthDate;
    public JButton buttonCalculate;
    public JLabel resultCalculation;
    public JTextField result;

    public Calculadora_Idade() {
        super();
        // Instaciando e adicionando um painel ao Frame
        JPanel mainPanel = new JPanel(new BorderLayout());
        this.add(mainPanel);
        JPanel firstPanel = new JPanel();
        this.add(firstPanel);
        JPanel secondPanel = new JPanel();
        this.add(secondPanel);

        // Criando os componentes e adicionando rótulos
        JLabel birthDate = new JLabel("Digite a data de nascimento (dd/mm/yyyy)");

        inputBirthDate = new JTextField(6);

        buttonCalculate = new JButton("Calcular");
        buttonCalculate.setBackground(Color.green);
        
        result = new JTextField(6);
        result.setEditable(false);
        result.setHorizontalAlignment(JLabel.CENTER);
        Font font = new Font("Arial", Font.BOLD, 30);
        result.setFont(font);

        resultCalculation = new JLabel();

        // Adicionando os componenetes ao painel principal
        mainPanel.add(firstPanel, BorderLayout.NORTH);
        mainPanel.add(secondPanel, BorderLayout.SOUTH);

        // Adicionando os componenetes ao firstPanel
        firstPanel.add(birthDate);
        firstPanel.add(inputBirthDate);
        firstPanel.add(buttonCalculate);
        firstPanel.add(resultCalculation);

        // Adicionando os componenetes ao secondPanel
        secondPanel.add(resultCalculation);
        secondPanel.add(result);

        

        // Criando uma ação para o button
        buttonCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateAge();
            }
        });
    }

    public void calculateAge() {
        // Criando atributo para armazenar a informação obtida pelo usuário
        String birthDateText = inputBirthDate.getText();

        try {
            // Definindo a formatação correta do texto digitado pelo usuário
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");

            /*
             * Convertendo o, até então, texto digitado em um objeto Date. Armazenamos este
             * valor na variável 'birthDate'
             */
            Date dateBirth = dateFormat.parse(birthDateText);
            Date currentDate = new Date();

            // Calculando a diferença em milissegundos
            long diferencaEmMillis = currentDate.getTime() - dateBirth.getTime();

            // Convertendo milissegundos em anos (considerando anos bissextos)
            long segundosEmUmAno = 1000L * 60 * 60 * 24 * 365;
            long years = diferencaEmMillis / segundosEmUmAno;

            // Setando o resultado da
            result.setText(years + " anos.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao calcular idade: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
