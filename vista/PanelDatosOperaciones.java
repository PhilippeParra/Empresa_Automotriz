package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelDatosOperaciones extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    public JButton bVenta;
    public JButton bCalcularSalario;
    public JButton bNomina;
    public JComboBox boxNombres;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelDatosOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/ventas.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,220,176);
        add(lbImagen);

        String[] nombres = {"Juan" , "Pedro" , "Pablo" , "Carlos" , "Mario" , "Jose" , "Andres" , "Luis" , "Dario" , "Alfredo"};

        boxNombres = new JComboBox<>(nombres);
        boxNombres.setBounds(240 , 40 , 100 , 20);
        add(boxNombres);
        
        bVenta = new JButton("Venta de carro");
        bVenta.setFont(new Font("Arial", BOLD, 12));
        bVenta.setBounds(10,185,120,20);
        add(bVenta);
        bVenta.setActionCommand("VentaCarro");
        
        bCalcularSalario = new JButton("Calcular Salario");
        bCalcularSalario.setFont(new Font("Arial", BOLD, 12));
        bCalcularSalario.setBounds(140,185,120,20);
        add(bCalcularSalario);
        bCalcularSalario.setActionCommand("calcularSalario");
        
        bNomina = new JButton("Calcular Nomina");
        bNomina.setFont(new Font("Arial", BOLD, 12));
        bNomina.setBounds(270,185,120,20);
        add(bNomina);
        bNomina.setActionCommand("calcularNomina");

        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        bVenta.addActionListener(pAL);
        bCalcularSalario.addActionListener(pAL);
        bNomina.addActionListener(pAL);
    }

    public int getNombres()
    {
        return boxNombres.getSelectedIndex();
    }
    

}