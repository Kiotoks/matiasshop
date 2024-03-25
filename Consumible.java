package onlineshop;

public class Consumible extends Producto{
    
 
   private String modelo;
   private int calorias;
   private String ingredientes;
   private String vencimiento;
   private double precio;
   private double cantidad;
   private String nombre;
   
   public Consumible(String n, double c, double p, String m, int ca, String i, String v){
       super(n,p,c);
       this.modelo = m;
       this.nombre = n;
       this.precio = p;
       this.cantidad = c;
       this.calorias = ca;
       this.ingredientes = i;
       this.vencimiento = v;
   }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
        return "Consumible{" + "modelo=" + modelo + ", calorias=" + calorias + ", ingredientes=" + ingredientes + ", vencimiento=" + vencimiento + ", precio=" + precio + ", cantidad=" + cantidad + ", nombre=" + nombre + '}';
    }

    

    @Override
    public double getPrecio() {
        if(modelo.equalsIgnoreCase("Oxford")){
            precio += precio*15/100;
        }
        else if(modelo.equalsIgnoreCase("Skinny")){
            precio += precio*25/100;
        }
        else if(modelo.equalsIgnoreCase("Recto")){
            precio -= precio*15/100;
        }
        
        return precio;
    }
}