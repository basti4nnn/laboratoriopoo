public class Cafe {

    private String nombre;
    private String tamano;
    private double precio;

    public Cafe(String nombre, String tamano, double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
        MostrarTicket();
    }

    public void MostrarTicket() {
        System.out.println("--- TICKET DE COMPRA ----");
        System.out.println("Café: " + nombre);
        System.out.println("Tamaño: " + tamano);
        System.out.println("Precio: $" + precio);
        System.out.println("-------------------------");
    }
}