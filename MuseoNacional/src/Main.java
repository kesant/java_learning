// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Subasta subasta = new Subasta(1500); // Monto inicial
        Oferente oferente1 = new Oferente("Juan", "Pérez", "12345678", 1500);
        Oferente oferente2 = new Oferente("Ana", "García", "87654321", 1200);

        subasta.agregarOferente(oferente1);
        subasta.agregarOferente(oferente2);
        subasta.notificarOferente();
    }
}