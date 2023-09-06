import javax.swing.*;

public class JtabbedPane extends JTabbedPane{
    public JtabbedPane() {
        super();
        this.add("Calculadora Idade", new Calculadora_Idade());
        this.add("Calculadora IMC", new Calculadora_IMC());
        this.add("Calculadora Moedas", new Calculadora_Moedas());
    }
}
