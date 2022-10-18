package ejecutable;

import modelo.EmpresaAutomotriz;
import modelo.Empleado;
import modelo.Carro;
import controlador.Controlador;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        EmpresaAutomotriz miEmpresa = new EmpresaAutomotriz();
        String[] nombres = {"Juan" , "Pedro" , "Pablo" , "Carlos" , "Mario" , "Jose" , "Andres" , "Luis" , "Dario" , "Alfredo"};

        Empleado miEmpleado = null;
        
        for(int i = 0; i<nombres.length ; i++)
        {
            miEmpresa.agregarEmpleado(new Empleado(nombres[i]), i);
        }
        Carro miCarro = null;

        Controlador miControlador = new Controlador(miVentana, miEmpleado, miCarro , miEmpresa); 
    }    
}
