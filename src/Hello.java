import javax.swing.*;

public class Hello extends JFrame {
    public Hello() {
        this.setTitle("Hello");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Hello frame = new Hello();
    }
}
