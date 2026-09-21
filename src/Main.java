import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
       List<Membresia> usuarios =  new ArrayList<>();
       usuarios.add(new MembresiaBasica("S261909","Rafael",15));
        usuarios.add(new MembresiaBasica("S262009","Diego",10));
        usuarios.add(new MembresiaBasica("S262109","Jorge",20));

        for(Membresia m : usuarios){
            m.mostrarDatos();
            m.verificarAcceso();
            System.out.println("---------------------------");

        }
        MembresiaPremium usuarioConInvitado = new MembresiaPremium("S262209","Juan",1);

        usuarioConInvitado.mostrarDatos();
        System.out.println("---------------------------");
        usuarioConInvitado.ingresarConInvitado();
        System.out.println("---------------------------");
        usuarioConInvitado.ingresarConInvitado();

    }

}