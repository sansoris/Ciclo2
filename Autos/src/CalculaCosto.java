public interface CalculaCosto {
    // Es una interface: agrupacion de clases abstractas y de constantes
    public static final Integer IVA = 19;  // se debe inicializar para que no genere error

    public abstract Integer calcularCosto(Integer factor);


}
