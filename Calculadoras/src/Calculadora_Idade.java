import javax.swing.*;
<<<<<<< HEAD
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
=======
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_Idade extends JPanel {
>>>>>>> f1f3b72193e2c6b7cf3790ba3e7b6baf9a19f191

    public Calculadora_Idade() {
        super();
        // Instaciando e adicionando um painel ao Frame
        JPanel panelPrincipal = new JPanel();
        this.add(panelPrincipal);
<<<<<<< HEAD
        JPanel secondPanel = new JPanel();
        this.add(secondPanel);

        // Criando os componentes e adicionando rótulos
        JLabel birthDate = new JLabel("Digite a data de nascimento (dd/mm/yyyy)");

        inputBirthDate = new JTextField(6);

        buttonCalculate = new JButton("Calcular");

        resultCalculation = new JLabel();

        result = new JTextField(6);
        Font font = new Font("Arial", Font.BOLD, 30);
        result.setFont(font);
=======

        // Criando os componentes e adicionando rótulos
        JLabel birthDate = new JLabel("Digite a data de nascimento (dd/mm/aaaa)");

        JTextField inputBirthDate = new JTextField(6);

        JButton buttonCalculate = new JButton("Calcular");

        JLabel resutCalculation = new JLabel();
>>>>>>> f1f3b72193e2c6b7cf3790ba3e7b6baf9a19f191

        // Adicionando os componenetes ao painel principal
        panelPrincipal.add(birthDate);
        panelPrincipal.add(inputBirthDate);
        panelPrincipal.add(buttonCalculate);
<<<<<<< HEAD
        panelPrincipal.add(resultCalculation);

        secondPanel.add(resultCalculation);
        secondPanel.add(result);
=======
        panelPrincipal.add(resutCalculation);
>>>>>>> f1f3b72193e2c6b7cf3790ba3e7b6baf9a19f191

        // Criando uma ação para o button
        buttonCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateAge();
            }
        });
<<<<<<< HEAD
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
            result.setText("Erro ao calcular. Verifique se a digitação está correta.");
        }
=======
>>>>>>> f1f3b72193e2c6b7cf3790ba3e7b6baf9a19f191
    }
}
