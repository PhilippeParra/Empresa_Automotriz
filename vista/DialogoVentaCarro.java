package vista;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogoVentaCarro extends JDialog
{
    //----------------------
    //Atributos
    //----------------------
    private JLabel lbTitulo;
    private JLabel lbPrecioCarro;
    private JTextField txPrecioCarro;
    private JButton btAceptar;

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public DialogoVentaCarro()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        //Creación y adición del elementos
        lbTitulo = new JLabel("Venta Carro",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        lbTitulo.setBounds(10,10,280,20);
        add(lbTitulo);
        
        lbPrecioCarro= new JLabel("Precio = ",JLabel.RIGHT);
        lbPrecioCarro.setFont(new Font("Arial", Font.BOLD, 25));
        lbPrecioCarro.setBounds(10,50,140,20);
        add(lbPrecioCarro);
        
        txPrecioCarro= new JTextField();
        txPrecioCarro.setFont(new Font("Arial", Font.BOLD, 25));
        txPrecioCarro.setBounds(150,50,100,25);
        add(txPrecioCarro);
        
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 25));
        btAceptar.setBounds(20,140,260,25);
        btAceptar.setActionCommand("aceptarventa");
        add(btAceptar);
               
        //Caracteristicas de la ventana
        setTitle("Carro");
        setSize(300,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public String getPrecioCarro()
    {
        return txPrecioCarro.getText();
    }
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAceptar.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    }   
}