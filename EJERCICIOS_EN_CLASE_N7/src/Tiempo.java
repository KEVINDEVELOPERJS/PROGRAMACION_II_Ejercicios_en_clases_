public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;

    // Constructores sobrecargados

    public Tiempo(int hora, int minuto) {
        this(hora, minuto, 0); // Llama al constructor completo
    }

    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Método para ajustar la hora
    public void ajustarHora(int hora, int minuto, int segundo) {
        setHora(hora); // Usando setters
        setMinuto(minuto);
        setSegundo(segundo);
    }
    

    // Método para mostrar el tiempo
    public String mostrarTiempo() {
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo()); // Usando getters
    }
    

    // Getters y Setters
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
}
// Ejemplo de uso
class PruebaTiempo {
    public static void main(String[] args) {

        Tiempo tiempo = new Tiempo(14, 30);
        System.out.println("Tiempo inicial: " + tiempo.mostrarTiempo());

        // Usando ajustarHora para modificar los valores
        tiempo.ajustarHora(15, 45, 20);
        System.out.println("Tiempo ajustado: " + tiempo.mostrarTiempo());
    }
}