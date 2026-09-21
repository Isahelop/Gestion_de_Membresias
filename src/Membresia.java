public abstract class Membresia {
    protected String idMiembro;
    protected String nombre;

    public Membresia(String idMiembro,String nombre){
        this.idMiembro = idMiembro;
        this.nombre = nombre;
    }
    
    public abstract boolean verificarAcceso();

    //Metodos concretos
    public void mostrarDatos(){
        System.out.println("======Datos======\n" +
                "Nombre: " + nombre + "\n" +
                "Id: " + idMiembro);
    }

}
