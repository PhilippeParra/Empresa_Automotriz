package modelo;

import java.util.ArrayList;
import modelo.Carro;

public class Empleado
{
    //--------------------------
    //Atributos
    //--------------------------
    private final static int SALARIO_MINIMO = 1000000;
    private double sueldo;
    private String nombreEmpleado;
    private ArrayList ventas;   
    
    //--------------------------
    //Métodos
    //--------------------------
    
    public Empleado( String pNombreEmpleado)
    {
        this.nombreEmpleado = pNombreEmpleado;
        this.ventas = new ArrayList();
    }

    public void venderCarro(int carroVendido)
    {
        ventas.add(carroVendido);
    }

    public void calcularSueldo()
    {
        if(ventas.isEmpty())
        {
            sueldo = SALARIO_MINIMO;
        }
        else
        {
            int numCarrosVendidos = ventas.size();
            sueldo = SALARIO_MINIMO + 100000*numCarrosVendidos;

            double totalVentas = 0;
            for(int i=0; i<numCarrosVendidos; i ++)
            {
                Carro carro = (Carro)ventas.get(i);
                totalVentas = totalVentas + carro.getPrecio();
            }

            sueldo = sueldo + (0.02 * totalVentas);
        }
    }

    public String getNombreEmpleado()
    {
        return nombreEmpleado;
    }

    public double getSueldo()
    {
        return sueldo;
    }


}