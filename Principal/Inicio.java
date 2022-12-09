package Principal;
import salud.*;
public class Inicio {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();  
        empleado.pedirDatos();        
        empleado.calcularImc();
        empleado.mayoredad();
        empleado.calcularHonorarios();
    }
}
