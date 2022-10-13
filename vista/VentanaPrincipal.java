package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
    public PanelDatosOperaciones miPanelDatosOperaciones;
    public PanelResultados miPanelResultado;
    public DialogoMoverCarro miDialogoMoverCarro;

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
        miPanelDatosOperaciones.setBounds(10,10,380,190);
        add(miPanelDatosOperaciones);
        
        //Creación y adición del PanelOperaciones
        miPanelResultado = new PanelResultados();
        miPanelResultado.setBounds(10,290,380,250);
        add(miPanelResultado);
        
        miDialogoMoverCarro = null;
        
        //Caracteristicas de la ventana
        setTitle("Sueldo Empleados");
        setSize(800,600);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    //Crear ventana dialogo Mover
    public void crearDialogoMover()
    {
        miDialogoMoverCarro = new DialogoMoverCarro();
    }
}