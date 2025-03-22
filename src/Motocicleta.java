
public class Motocicleta extends Vehiculo {
    int cilindraje;

    public Motocicleta(String agno, String marca, String modelo, double precioBase, int cilindraje) {
        super(agno, marca, modelo, precioBase);
        this.cilindraje = cilindraje;
    }

    public Motocicleta() {

    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return super.toString()+
                "cilindraje=" + cilindraje +
                '}';
    }

    @Override
    public double calcularPrecioFinal() {
        double impuesto =  ((precioBase/100)*10);
        return  precioBase + impuesto;
    }
}
