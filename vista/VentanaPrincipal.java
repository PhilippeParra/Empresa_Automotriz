package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
    public PanelDatosOperaciones miPanelDatosOperaciones;
    public PanelResultados miPanelResultado;
    public DialogoVentaCarro miDialogoVentaCarro;

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        
        //Creación y adición del PanelEntradaDatos
        miPanelDatosOperaciones = new PanelDatosOperaciones();
        miPanelDatosOperaciones.setBounds(10,10,400,220);
        add(miPanelDatosOperaciones);
        
        //Creación y adición del PanelOperaciones
        miPanelResultado = new PanelResultados();
        miPanelResultado.setBounds(10,230,400,150);
        add(miPanelResultado);
        
        miDialogoVentaCarro = null;
        
        //Caracteristicas de la ventana
        setTitle("Empresa Automotriz");
        setSize(440,420);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    //Crear ventana dialogo Mover
    public void crearDialogoVentaCarro()
    {
        miDialogoVentaCarro = new DialogoVentaCarro();
    }
}