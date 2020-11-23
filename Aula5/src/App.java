import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Object[] options = { "Sim", "Não" };
        Object[] positions = { "abc", "def", "ghi", "jkl" };

        JOptionPane.showOptionDialog(null, "Usuario cadastrado com sucesso\n\nDeseja continuar cadastrando? (S/N)",
                "Agenda", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        JOptionPane.showOptionDialog(null, "Returns the position of your choice on the array", "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, positions, positions[0]);

        JOptionPane.showInputDialog(null,
                "Queue Operations Menu\n1.Insert\n2.Delete\n3.Display\n4.Exit\n\nEnter your option", "Input",
                JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showInputDialog(null, "Please input any value to continue", "Input", JOptionPane.QUESTION_MESSAGE);

    }
}
