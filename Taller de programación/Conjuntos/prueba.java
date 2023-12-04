import java.util.ArrayList;
import java.util.List;

public class prueba {

    public static void main(String[] args) {

        Conjuntos<String> a = new Conjuntos<String>("A");

        a.agregar("1");
        a.agregar("2");
        a.agregar("3");
        a.agregar("4");
        a.agregar("5");
        a.agregar("6");

        System.out.println(a);

        Conjuntos<String> b = new Conjuntos<String>("B");

        b.agregar("5");
        b.agregar("6");
        b.agregar("8");
        b.agregar("7");
        b.agregar("9");
        b.agregar("10");

        System.out.println(b);

        List<String> lista2 = new ArrayList<>();

        lista2.addAll(a.diferencia(b, "C"));

        List<String> lista1 = new ArrayList<>();

        lista1.addAll(b.diferencia(a, "c"));

        System.out.println("Nuevo conjunto 1 " + lista2);

        System.out.println("Nuevo conjunto 2 " + lista1);

    }
}