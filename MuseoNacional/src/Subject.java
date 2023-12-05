public interface Subject {
    public void agregarOferente(Observer o);
    public void quitarOferente(Observer o);

    public void notificarOferente();
}
