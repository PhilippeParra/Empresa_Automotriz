package ejecutable;

import modelo.Empleado;
import controlador.Controlador;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Empleado miSueldo = null;
        Controlador miControlador = new Controlador(miVentana, miSueldo);
    }    
}
