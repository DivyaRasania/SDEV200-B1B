import javax.swing.JOptionPane;

public class ConfirmDialog {
    public static void main(String[] args) {
        JOptionPane.showConfirmDialog(null,
                "A data input error has occurred. Continue?",
                "Data input error",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.ERROR_MESSAGE);
    }
}
