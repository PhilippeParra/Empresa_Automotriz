package modelo;

public class EmpresaAutomotriz 
{
    public final static int NUM_EMPLEADOS = 10;
    
    private Empleado[] numEmpleados;

    public EmpresaAutomotriz()
    {
        numEmpleados = new Empleado[NUM_EMPLEADOS];
    } 

    public void agregarEmpleado(Empleado emp , int pos)
    {
        numEmpleados[pos] = emp;
    }

    public double calcularNomina()
    {
        double totalNomina = 0;
        for(int i=0; i < numEmpleados.length ; i++)
        {
            totalNomina = totalNomina + numEmpleados[i].getSueldo();
        }
        return totalNomina;
    }

    public Empleado getNumEmpleado(int i)
    {
        return numEmpleados[i];
    }

}
