
public class Auto extends Vehiculo{
    int numPuertas;

    public Auto(String agno, String marca, String modelo, double precioBase, int numPuertas) {
        super(agno, marca, modelo, precioBase);
        this.numPuertas = numPuertas;
    }

    public Auto() {

    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numPuertas=" + numPuertas +
                '}';
    }

    @Override
    public double calcularPrecioFinal() {
        double impuesto =  ((precioBase/100)*10);
        return  precioBase + impuesto;
    }
}
