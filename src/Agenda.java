import javax.swing.*;

public class Agenda {
    private JTextField textID;
    private JTextField textNOMBRE;
    private JTextField textCELULAR;
    private JTextField textEMAIL;
    private JButton buscarButton;
    private JButton actualizarButton;
    private JPanel Panel;

    public static void main(String[] args) {
        JFrame frame=new JFrame("BUSCAR Y ACTUALIZAR DATOS");
        frame.setContentPane(new Agenda().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(0,0,400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
