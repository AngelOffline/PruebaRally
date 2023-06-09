public interface Coleccionable<T> extends Iterable<T>
{
    void agrega(final T p0);
    
    void elimina(final T p0);
    
    boolean contiene(final T p0);
    
    boolean esVacio();
    
    int getTamanio();
}