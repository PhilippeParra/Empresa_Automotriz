package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.EmpresaAutomotriz;
import modelo.Carro;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    private VentanaPrincipal venPrin;
    private Empleado model;
    private EmpresaAutomotriz modelAutomotriz;
    private Carro model2;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Empleado pEmpleado ,Carro pModel2 , EmpresaAutomotriz pModelAutomotriz)
    {
        this.venPrin = pVenPrin;
        this.model = pEmpleado;
        this.model2 = pModel2;
        this.modelAutomotriz = pModelAutomotriz;
        this.venPrin.miPanelDatosOperaciones.agregarOyentesBotones((ActionListener) this);
    }

    public void actionPerformed(ActionEvent ae) 
    {
        String comand = ae.getActionCommand();

        if(comand.equals("VentaCarro"))
        {   
            venPrin.crearDialogoVentaCarro();
            this.venPrin.miDialogoVentaCarro.agregarOyentesBotones((ActionListener) this);  
        }
        
        if (comand.equals("aceptarventa"))
        {
            int posicion = venPrin.miPanelDatosOperaciones.getNombres();
            modelAutomotriz.getNumEmpleado(posicion);
            int carroVendido = Integer.parseInt(venPrin.miDialogoVentaCarro.getPrecioCarro());
            //modelAutomotriz.getNumEmpleado(posicion).model.venderCarro(new Carro(carroVendido));
            venPrin.miPanelResultado.mostrarResultado(model.getNombreEmpleado());
            venPrin.miDialogoVentaCarro.cerrarDialogo();
        }

        if(comand.equals("calcularSalario"))
        {
            venPrin.miPanelResultado.mostrarResultado("No he podido agregar ventas, ni crea q le voy a dar el salario final");
        }

        if(comand.equals("calcularNomina"))
        {
            venPrin.miPanelResultado.mostrarResultado("no pude con los salarios que era de uno en uno, ahora me pide nomina que son todos los salarios");
        }
    }
}
 