package ejercicioherencia;

class Cliente extends Persona {
    private String direccion;

    public Cliente(String nombre, int edad, String direccion) {
        super(nombre, edad);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
}
