public class VehiculoAereo extends Vehiculo {
    private String tipoAlas;
    public VehiculoAereo(String marca,String modelo,String tipoAlas){
        super(marca,modelo);
        this.tipoAlas=tipoAlas;
    }
    public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Tipo de alas: "+tipoAlas);
    }
}
