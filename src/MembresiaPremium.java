public class MembresiaPremium extends Membresia{
    private int pasesInvitado;

    public MembresiaPremium(String idMiembro, String nombre,int pasesInvitado){
        super(idMiembro, nombre);
        this.pasesInvitado = pasesInvitado;
    }

    @Override
    public boolean verificarAcceso() {
        System.out.println("Acceso autorizado\n" +
                "No tiene limites de visitas");
        return true;
    }

    public boolean ingresarConInvitado(){
        if(pasesInvitado > 0){
            pasesInvitado -= 1;
            System.out.println("Acceso autorizado\n" +
                    "Visitas de invitado restantes: " + pasesInvitado);
            return true;
        }
        System.out.println("Acceso Denegado, no quedan visitas restantes");
        return false;
    }
}
