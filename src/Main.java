
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello Verou!");

        Persona persona1 = new Persona("Juan", "Perez", 30);
        Persona persona2 = new Persona("Maria", "Gomez", 25);
        persona2.saludar();
        persona1.saludar();
        persona1.setNombre("Juan Carlos");
    }
}