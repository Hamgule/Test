import javax.swing.*;

class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");

        JLabel label = new JLabel("Hello, World!");
        frame.add(label);

        frame.setSize(new Dimension(480, 320));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

