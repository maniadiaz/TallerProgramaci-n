
/**
 * @(#) Conjunto.java
 * @description
 * @author 
 * @version 1.0  2/12/23
 */

import java.util.*;

public class ConjuntoD<E> extends HashSet<E> {

    final ConjuntoD<E> UNIVERSO = new ConjuntoD<>();

    // constructor
    ConjuntoD() {

    } // fin-constructor

    public ConjuntoD<E> union(ConjuntoD<E> argConjunto1, ConjuntoD<E> argConjunto2) {

        ConjuntoD<E> conjuntoResult = new ConjuntoD<>();
        conjuntoResult.addAll(argConjunto1);
        conjuntoResult.addAll(argConjunto2);

        return conjuntoResult;
    }

    public ConjuntoD<E> interseccion(ConjuntoD<E> argConjunto1, ConjuntoD<E> argConjunto2) {

        ConjuntoD<E> conjuntoResult = new ConjuntoD<>();
        conjuntoResult.addAll(argConjunto1);
        conjuntoResult.retainAll(argConjunto2);

        return conjuntoResult;
    }

    public ConjuntoD<E> diferencia(ConjuntoD<E> argConjunto1, ConjuntoD<E> argConjunto2) {

        ConjuntoD<E> conjuntoResult = new ConjuntoD<>();
        conjuntoResult.addAll(argConjunto1);
        conjuntoResult.removeAll(interseccion(argConjunto1, argConjunto2));

        return conjuntoResult;
    }

    public ConjuntoD<E> diferenciaSimetrica(ConjuntoD<E> argConjunto1, ConjuntoD<E> argConjunto2) {

        ConjuntoD<E> conjuntoResult = new ConjuntoD<>();
        conjuntoResult.addAll(argConjunto1);
        conjuntoResult.addAll(argConjunto2);
        conjuntoResult.removeAll(interseccion(argConjunto1, argConjunto2));

        return conjuntoResult;
    }

    public ConjuntoD<E> complemento(ConjuntoD<E> argConjunto) {

        ConjuntoD<E> conjuntoResult = new ConjuntoD<>();
        conjuntoResult.addAll(UNIVERSO);
        conjuntoResult.removeAll(argConjunto);

        return conjuntoResult;

    }

    public boolean agregar(ConjuntoD<E> argConjunto, E argDato) {

        UNIVERSO.add(argDato);

        return argConjunto.add(argDato);

    }

    // fin-métodos

} // fin-class Conjunto
