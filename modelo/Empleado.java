package modelo;

import java.util.ArrayList;

public class Empleado
{
    //--------------------------
    //Atributos
    //--------------------------
    private static int salarioMin = 1000000;
    private int sueldo;
    private String nombreEmpleado;
    ArrayList <String> ventas;   
    
    //--------------------------
    //Métodos
    //--------------------------
    
    public Empleado( String pNombreEmpleado)
    {
        this.nombreEmpleado = pNombreEmpleado;
        this.ventas = new ArrayList();
    }

    public void venderCarro()
    {
        ventas.add();
    }

    public void CalcularSueldo();
    {
        if(ventas.isEmpty())
        {
            
        }
    }


}