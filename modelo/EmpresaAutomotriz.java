package modelo;

public class EmpresaAutomotriz 
{
    public final static int NUM_EMPLEADOS = 10;
    
    private Empleado[] numEmpleados;

    public EmpresaAutomotriz()
    {
        numEmpleados = new Empleado [NUM_EMPLEADOS];
    } 

    public int calcularNomina()
    {
        for(int i=0, i < numEmpleados.length , i++)
        {
            totalNomina = totalNomina + numEmpleados[i].getsueldo();
        }
        return totalNomina;
    }

}
