package onlineshop;

    public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected double cantidad;
    
    public Producto(String n, double p, double c){
        this.nombre = n;
        this.precio = p;
        this.cantidad = c;
    }

    public String getDesc() {
        return nombre;
    }

    public void setDesc(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double addCant(double c){
        this.cantidad += c;
        return this.cantidad;
    }
    public double desCant(double c){
        this.cantidad -= c;
        return this.cantidad;
    }
    
    @Override
    public String toString(){
        return this.nombre + ".........$ " + this.getPrecio();
    }
    
    public abstract double getPrecio();
    
}
