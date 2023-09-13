import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_Idade extends JPanel {

    public Calculadora_Idade() {
        super();
        // Instaciando e adicionando um painel ao Frame
        JPanel panelPrincipal = new JPanel();
        this.add(panelPrincipal);

        // Criando os componentes e adicionando rótulos
        JLabel birthDate = new JLabel("Digite a data de nascimento (dd/mm/aaaa)");

        JTextField inputBirthDate = new JTextField(6);

        JButton buttonCalculate = new JButton("Calcular");

        JLabel resutCalculation = new JLabel();

        // Adicionando os componenetes ao painel principal
        panelPrincipal.add(birthDate);
        panelPrincipal.add(inputBirthDate);
        panelPrincipal.add(buttonCalculate);
        panelPrincipal.add(resutCalculation);

        // Criando uma ação para o button
        buttonCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateAge();
            }
        });
    }
}
