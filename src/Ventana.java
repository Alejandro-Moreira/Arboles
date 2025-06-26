import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel principal;
    private JComboBox cboMarca;
    private JComboBox cboProcesador;
    private JComboBox cboRam;
    private JTextField txtCodigo;
    private JButton btnAgregar;
    private JTextArea txtListar;
    private Arbol arbol=new Arbol();

    public Ventana() {
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id=Integer.parseInt(txtCodigo.getText());
                String marca=cboMarca.getSelectedItem().toString();
                String proc=cboProcesador.getSelectedItem().toString();
                int ram=Integer.parseInt(cboRam.getSelectedItem().toString());
                Computador nuevo=new Computador(id,marca,proc,ram);
                arbol.insertar(nuevo);
                txtListar.setText(arbol.inOrden());              //inOrden ya muestra los datos de menor a mayor
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}