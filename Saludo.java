public class Saludo {
    public String generarSaludo(String nombre, String apellido) {
        if (nombre == null || nombre.isEmpty() || apellido.isEmpty()) {
            return "Hola, Invitado!";
        }
        return "Hola!, " + nombre + " " + apellido;
    }
}