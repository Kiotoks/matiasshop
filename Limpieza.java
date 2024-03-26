package onlineshop;

public class Limpieza extends Producto{
    
 
   private String advertencia;
   private Boolean perfume;
   private String tipo;
   
   public Limpieza(String n, double c, double p, Boolean pf, String ad, String t){
       super(n,p,c);
       this.perfume = pf;
       this.advertencia = ad;
       this.tipo = t;
   }

    public String getAdvertencia() {
        return advertencia;
    }

    public void setAdvertencia(String advertencia) {
        this.advertencia = advertencia;
    }

    public Boolean getPerfume() {
        return perfume;
    }

    public void setPerfume(Boolean perfume) {
        this.perfume = perfume;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Limpieza{" + "advertencia=" + advertencia + ", perfume=" + perfume + ", tipo=" + tipo + ", precio=" + super.precio + ", cantidad=" + super.cantidad + ", nombre=" + super.nombre + '}';
    }
}