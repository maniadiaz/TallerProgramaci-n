
/**
 * @(#) Conjunto.java
 * @description
 * @author 
 * @version 1.0  2/12/23
 */

import java.util.*;

public class Conjunto<E> extends HashSet {

    final static Conjunto<String> UNIVERSO = new Conjunto<String>();

    // constructor
    Conjunto() {

    } // fin-constructor

    public static <E> Conjunto<E> union(Conjunto<E> argConjunto1, Conjunto<E> argConjunto2) {

        Conjunto<E> conjuntoResult = new Conjunto<>();
        conjuntoResult.addAll(argConjunto1);
        conjuntoResult.addAll(argConjunto2);

        return conjuntoResult;
    }

    public static <E> Conjunto<E> interseccion(Conjunto<E> argConjunto1, Conjunto<E> argConjunto2) {

        Conjunto<E> conjuntoResult = new Conjunto<>();
        conjuntoResult.addAll(argConjunto1);
        conjuntoResult.retainAll(argConjunto2);

        return conjuntoResult;
    }

    public static <E> Conjunto<E> diferencia(Conjunto<E> argConjunto1, Conjunto<E> argConjunto2) {

        Conjunto<E> conjuntoResult = new Conjunto<>();
        conjuntoResult.addAll(argConjunto1);
        conjuntoResult.removeAll(interseccion(argConjunto1, argConjunto2));

        return conjuntoResult;
    }

    public static <E> Conjunto<E> diferenciaSimetrica(Conjunto<E> argConjunto1, Conjunto<E> argConjunto2) {

        Conjunto<E> conjuntoResult = new Conjunto<>();
        conjuntoResult.addAll(argConjunto1);
        conjuntoResult.addAll(argConjunto2);
        conjuntoResult.removeAll(interseccion(argConjunto1, argConjunto2));

        return conjuntoResult;
    }

    public static <E> Conjunto<E> complemento(Conjunto<E> argConjunto) {

        Conjunto<E> conjuntoResult = new Conjunto<>();
        conjuntoResult.addAll(UNIVERSO);
        conjuntoResult.removeAll(argConjunto);

        return conjuntoResult;

    }

    public static <E> boolean agregar(Conjunto<E> argConjunto, E argDato) {

        UNIVERSO.add(argDato);

        return argConjunto.add(argDato);

    }

    // fin-métodos

    public static void main(String[] args) {

        Conjunto<String> conjunto1 = new Conjunto<>();
        Conjunto<String> conjunto2 = new Conjunto<>();

        // Agregar datos al universo
        agregar(UNIVERSO, "león");
        agregar(UNIVERSO, "tigre");
        agregar(UNIVERSO, "hipopótamo");
        agregar(UNIVERSO, "rinoceronte");

        // Agregar datos al Conjunto A (por defecto, también se le agrega al universo)
        agregar(conjunto1, "gato");
        agregar(conjunto1, "perro");
        agregar(conjunto1, "loro");
        agregar(conjunto1, "lagartija");

        // Agregar datos al Conjunto B (por defecto, también se le agrega al universo)
        agregar(conjunto2, "perro");
        agregar(conjunto2, "pez");
        agregar(conjunto2, "burro");
        agregar(conjunto2, "lagartija");

        System.out.println("\nUNIVERSO: " + UNIVERSO.toString());
        System.out.println("ConjuntoA: " + conjunto1.toString());
        System.out.println("ConjuntoB: " + conjunto2.toString());
        System.out.println("\nConjuntoA UNIÓN ConjuntoB: " + union(conjunto1, conjunto2).toString());
        System.out.println("\nConjuntoA INTERSECCIÓN ConjuntoB: " + interseccion(conjunto1, conjunto2).toString());
        System.out.println("\nConjuntoA DIFERENCIA ConjuntoB: " + diferencia(conjunto1, conjunto2));
        System.out.println("\nConjuntoA DIFERENCIA SIMÉTRICA ConjuntoB: " + diferenciaSimetrica(conjunto1, conjunto2));
        System.out.println("\nConjuntoA COMPLEMENTO: " + complemento(conjunto1) + "\n  ");

    } // fin-main

} // fin-class Conjunto
