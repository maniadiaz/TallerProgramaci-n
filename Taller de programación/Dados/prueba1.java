public class prueba1 {

    public static void main(String[] args) {

        backend obj = new backend();

        for (int i = 0; i < 10; i++) {
            obj.lanzarDado();
            obj.setContadorCara(1);
            System.out.println("Numero :" + obj.getNumero());
        }

        System.out.println("Contador 1: " + obj.getCara1());
        System.out.println("Contador 2: " + obj.getCara2());
        System.out.println("Contador 3: " + obj.getCara3());
        System.out.println("Contador 4: " + obj.getCara4());
        System.out.println("Contador 5: " + obj.getCara5());
        System.out.println("Contador 6: " + obj.getCara6());
        System.out.println("contador lanzado " + obj.getContadorCara());

    }
}
