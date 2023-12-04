import java.util.HashSet;
import java.util.Set;

public class Conjuntos<E> extends HashSet<E> {

    // Atributos para Conjuntos
    private Set<E> conjunto;
    private String nombre;

    // Metodo constructor vacio
    public Conjuntos() {

        conjunto = new HashSet<>();

    }

    // Metodo constructor inicializando atributos
    public Conjuntos(Set<E> objConjunto, String argNombre) {

        this.conjunto.addAll(objConjunto);
        this.nombre = argNombre;

    }

    // Metodo para inicializar el atributo nombre

    public Conjuntos(String argNombre) {

        this.nombre = argNombre;

        if (conjunto == null) {

            conjunto = new HashSet<>();

        }

    }

    // Metodo para agregar nuevos datos al Conjunto ya existente
    public boolean agregar(E argElementos) {

        if (conjunto == null) {

            conjunto = new HashSet<>();

        }

        return conjunto.add(argElementos);

    }

    // Metodo union

    public Conjuntos<E> union(Conjuntos<E> objConjunto, String argNombre) {

        Conjuntos<E> nuevoConjuntos = new Conjuntos<>(argNombre);

        nuevoConjuntos.addAll(getConjunto());
        nuevoConjuntos.addAll(objConjunto.getConjunto());

        return nuevoConjuntos;

    }

    // Metodo interseccion

    public Conjuntos<E> interseccion(Conjuntos<E> objConjunto, String argNombre) {

        Conjuntos<E> nuevoConjuntos = new Conjuntos<>(argNombre);

        nuevoConjuntos.addAll(getConjunto());
        nuevoConjuntos.retainAll(objConjunto.getConjunto());

        return nuevoConjuntos;

    }

    // Metodo diferencia

    public Conjuntos<E> diferencia(Conjuntos<E> obConjuntos, String argNombre) {

        Conjuntos<E> nuevoConjuntos = new Conjuntos<>(argNombre);

        nuevoConjuntos.addAll(getConjunto());
        nuevoConjuntos.removeAll(interseccion(obConjuntos, argNombre));

        return nuevoConjuntos;
    }

    // Metodo diferencia Simetrica

    public Conjuntos<E> diferenciaSimetrica(Conjuntos<E> obConjuntos, String argNombre) {

        Conjuntos<E> nuevoConjuntos = new Conjuntos<>(argNombre);

        nuevoConjuntos.addAll(getConjunto());
        nuevoConjuntos.addAll(obConjuntos.getConjunto());
        nuevoConjuntos.removeAll(interseccion(obConjuntos, argNombre));

        return nuevoConjuntos;

    }

    public Conjuntos<E> complemento(Conjuntos<E> obConjuntos, String argNombre) {

        Conjuntos<E> nuevoConjuntos = new Conjuntos<>(argNombre);

        nuevoConjuntos.addAll(getConjunto());
        nuevoConjuntos.addAll(obConjuntos.getConjunto());
        nuevoConjuntos.removeAll(obConjuntos.getConjunto());

        return nuevoConjuntos;

    }

    // Metodo getConjunto retorna un Set<E> del atributo conjunto

    public Set<E> getConjunto() {

        return conjunto;

    }

    // Metodo getNombre retorna un String del atributo nombre

    public String getNombre() {

        return nombre;

    }

    @Override
    public String toString() {

        return "Conjunto: " + nombre + " " + conjunto + " ";

    }

}
