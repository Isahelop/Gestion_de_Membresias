public class MembresiaBasica extends Membresia {
    private int visitasRestantes;

    public MembresiaBasica(String idMiembro, String nombre, int visitasRestantes){
        super(idMiembro, nombre);
        this.visitasRestantes = visitasRestantes;
    }

    @Override
    public boolean verificarAcceso() {
        if(this.visitasRestantes > 0){
            visitasRestantes -= 1;
            System.out.println("Acceso Autorizado\n" +
                    "Visitas restantes: " + visitasRestantes);
            return true;
        }
        System.out.println("Acceso denegado, no quedan visitas restantes");
        return false;
    }

    @Override
    public String toString() {
        return "MembresiaBasica:" + "\n" +
                "nombre= " + nombre + '\n' +
                "id= " + idMiembro;
    }
}
