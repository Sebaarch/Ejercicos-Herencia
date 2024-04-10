public class Transportes{
    public static void main (String []args){
        VehiculoTerrestre VehiculoTerrestre=new VehiculoTerrestre ("Terreneitor","Mattel",4);
        VehiculoAcuatico VehiculoAcuatico=new VehiculoAcuatico( "Lancha","Yamaha","Motor prr prr");
        VehiculoEspacial VehiculoEspacial=new VehiculoEspacial("NASA","AJ1","Eolicas");
        VehiculoAereo VehiculoAereo=new VehiculoAereo("BOING","177","REDBULL");
    System.out.println("Informacion Vehiculo terrestre");
        VehiculoTerrestre.mostrarInfo();

    System.out.println("Informacion Vehiculo acuatico");
        VehiculoAcuatico.mostrarInfo();
    System.out.println("Informacion Vehiculo Espacial");
        VehiculoEspacial.mostrarInfo();
        System.out.println("Informacion Vehiculo Espacial");
        VehiculoAereo.mostrarInfo();
}
}