import java.util.Random;

public class backend {

    private int cara1;
    private int cara2;
    private int cara3;
    private int cara4;
    private int cara5;
    private int cara6;
    private int contadorCara;
    private int numero;

    public backend() {

    }

    public boolean lanzarDado() {

        Random numeroRandom = new Random();
        boolean bandera = false;

        int lado = numeroRandom.nextInt(6) + 1;

        if (lado == 1) {

            cara1++;
            bandera = true;
            numero = 1;

        } else if (lado == 2) {

            cara2++;
            bandera = true;
            numero = 2;

        } else if (lado == 3) {

            cara3++;
            bandera = true;
            numero = 3;

        } else if (lado == 4) {

            cara4++;
            bandera = true;
            numero = 4;

        } else if (lado == 5) {

            cara5++;
            bandera = true;
            numero = 5;

        } else if (lado == 6) {

            cara6++;
            bandera = true;
            numero = 6;

        }

        return bandera;

    }

    public int getNumero() {

        return numero;

    }

    public int getCara1() {

        return cara1;

    }

    public int getCara2() {

        return cara2;

    }

    public int getCara3() {

        return cara3;

    }

    public int getCara4() {

        return cara4;

    }

    public int getCara5() {

        return cara5;

    }

    public int getCara6() {

        return cara6;

    }

    public int getContadorCara() {

        return contadorCara;

    }

    public void setContadorCara(int argContadorLanzad) {

        this.contadorCara = this.contadorCara + argContadorLanzad;

    }

}
