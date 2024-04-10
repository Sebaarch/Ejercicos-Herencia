public class VehiculoEspacial extends Vehiculo {
    private String tipoTurbinas;

    public VehiculoEspacial(String marca, String modelo, String tipoTurbinas){
        super(marca, modelo);
        this.tipoTurbinas=tipoTurbinas;
    }
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo de turbinas: "+tipoTurbinas);
    }

    

    
}