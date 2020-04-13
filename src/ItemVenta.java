public class ItemVenta {
    /*El mismo contiene un id, un nombre, descripción y
         precio unitario*/
    private  String id;
    private String nombre;
    private  String description;
    private double precioUnit;
    private int cantidad;
    public  ItemVenta (){
        this.description="";
        this.id="";
        this.nombre="";
        this.precioUnit=0;
        this.cantidad=0;
    }
    public ItemVenta(String id, String nombre,String description,double precioUnit, int cantidad)
    {
        this.precioUnit=precioUnit;
        this.id=id;
        this.description=description;
        this.nombre=nombre;
        this.cantidad=cantidad;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
