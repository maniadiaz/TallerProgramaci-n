
/**
 * @(#) Moneda.java
 * @description  Backend de simulación de lanzar una moneda.
 * @author Miguel Alexis Díaz Díaz
 * @version 1.0 27/11/23
 */

import java.util.Random;

public class Moneda {

    private int frecuenciaCara;
    private int frecuenciaCruz;
    private String caraCruz;
    private String cara;

    public Moneda() {

    }

    public void lanzarMoneda() {

        Random random = new Random();
        int lado = random.nextInt(2) + 1;

        if (lado == 1) {

            frecuenciaCara();
            setCaraCruz("cara");

        } else {

            frecuenciaCruz();
            setCaraCruz("cruz");

        }

    }

    private void setCaraCruz(String argCaraCruz) {

        this.caraCruz = argCaraCruz;

    }

    public String getCaraCruz() {

        return caraCruz;

    }

    public int getFrecuenciaCara() {

        return frecuenciaCara;

    }

    public int getFrecuenciaCruz() {

        return frecuenciaCruz;

    }

    public int frecuenciaCara() {

        return frecuenciaCara = frecuenciaCara + 1;

    }

    public int frecuenciaCruz() {

        return frecuenciaCruz = frecuenciaCruz + 1;

    }

    public String getCara() {

        return cara;

    }

    public void limpiar() {

        frecuenciaCara = 0;
        frecuenciaCruz = 0;
        cara = "----";

    }
}