
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String agno;
    protected double precioBase;

    public Vehiculo() {
    }

    public Vehiculo(String agno, String marca, String modelo, double precioBase) {
        this.agno = agno;
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public String getAgno() {
        return agno;
    }

    public void setAgno(String agno) {
        this.agno = agno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "agno='" + agno + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioBase=" + precioBase +
                '}';
    }
    public double calcularPrecioFinal(){
        return precioBase;

    }
}
