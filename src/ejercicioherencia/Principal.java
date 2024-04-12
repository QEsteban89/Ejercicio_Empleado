package ejercicioherencia;
import javax.swing.JOptionPane;

public class Principal {
        //Bucle 
        private static boolean band = true;
        
        //Recibir informacion
        private static int edad;
        private static double salario;
        private static String nombre, direccion;
        
        //Control de logica
        private static int opcion;
        
    public static void main(String[] args) {

        while (band) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú:\n1. Agregar Empleado\n2. Agregar Cliente\n3. Salir del programa"));
            
            switch (opcion) {
                case 1 -> {
                        empleado();
                    }
                case 2 -> {
                        cliente();
                    }
                case 3 -> {
                    band = false;
                }
                default -> JOptionPane.showMessageDialog(null, "Opción inválida. Inténtalo de nuevo.");
            }
        }
    }
    public static void empleado(){
        nombre = JOptionPane.showInputDialog("Nombre del empleado:");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del empleado:"));
                        salario = Double.parseDouble(JOptionPane.showInputDialog("Salario del empleado:"));
                        Empleado empleado = new Empleado(nombre, edad, salario);
                        JOptionPane.showMessageDialog(null, """
                                                            Empleado agregado:
                                                            Nombre: """ + empleado.getNombre() + 
                                                            "\nEdad: " + empleado.getEdad() +
                                                            "\nSalario: $" + empleado.getSalario());
    }
    public static void cliente(){
        nombre = JOptionPane.showInputDialog("Nombre del cliente:");
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del cliente:"));
                        direccion = JOptionPane.showInputDialog("Dirección del cliente:");
                        Cliente cliente = new Cliente(nombre, edad, direccion);
                        JOptionPane.showMessageDialog(null, """
                                                            Cliente agregado:
                                                            Nombre: """ + cliente.getNombre() + 
                                                            "\nEdad: " + cliente.getEdad() +
                                                            "\nDirección: " + cliente.getDireccion());

        
    }
}
   