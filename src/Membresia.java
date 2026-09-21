public abstract class Membresia {
    protected String idMiembro;
    protected String nombre;

    //Constructor
    public Membresia(String idMiembro,String nombre){
        this.idMiembro = idMiembro;
        this.nombre = nombre;
    }

    //Metodo abstracto
    public abstract boolean verificarAcceso();

    //Metodos concretos
    public void mostrarDatos(){
        System.out.println("======Datos======\n" +
                "Nombre: " + nombre + "\n" +
                "Id: " + idMiembro);
    }

}
