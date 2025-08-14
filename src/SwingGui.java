import javax.swing.*;

public class SwingGui {
    public static void spawnarSwing() {
        SwingUtilities.invokeLater(() -> {
            JOptionPane.showMessageDialog(null, Strings.strings());
            System.exit(0);
        });
    }
}
