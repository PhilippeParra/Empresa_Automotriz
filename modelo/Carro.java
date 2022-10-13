package modelo;

public class Carro 
{
    public int precio;
    
    public Carro(int pPrecio)
    {
        this.precio = pPrecio;
    }

    public int getPrecio()
    {
        return this.precio;
    }

    public void setPrecio(int pPrecio)
    {
        this.precio = pPrecio;
    }
}
