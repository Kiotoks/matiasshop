package onlineshop;

public class Consumible extends Producto{
    
 
   private int calorias;
   private String ingredientes;
   private String vencimiento;
   private Boolean isBebida;
   private Boolean isAlcohol; 
   
   public Consumible(String n, double c, double p, int ca, String i, String v, Boolean ib, Boolean ih){
       super(n,p,c);
       this.isBebida = ib;
       this.isAlcohol = ih;
       this.calorias = ca;
       this.ingredientes = i;
       this.vencimiento = v;
   }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
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
    public String toString() {
        return "Consumible{" + "calorias=" + calorias + ", ingredientes=" + ingredientes + ", vencimiento=" + vencimiento + ", precio=" + super.precio + ", cantidad=" + super.cantidad + ", nombre=" + super.nombre + ", es bebida=" + isBebida + ", tiene alcohol=" + isAlcohol + '}';
    }
    

    @Override
    public double getPrecio() {
        return precio;
    }
}