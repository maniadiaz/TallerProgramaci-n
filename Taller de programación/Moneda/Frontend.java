/**
 * @(#) Frontend.java
 * @description  Frontend de simulación de lanzar una moneda.
 * @author  Guardado Garza Katherine Galilea
 * @version 1.0 27/11/23
 */


import javax.swing.*;
import java.awt.event.*;

public class Frontend extends JFrame {
 
    JLabel lblsimulador = new JLabel("SIMULADOR LANZAR MONEDA");
    JButton btnMoneda = new JButton(" ¡LANZAR! ");
    JLabel lblfrecuenciaCara = new JLabel("CARA: 0 ");
    JLabel lblfrecuenciaCruz = new JLabel("CRUZ: 0 ");
    JLabel lblResultado = new JLabel("----");
    JButton btnLimpiar = new JButton(" LIMPIAR ");

    // constructor
    Frontend(){

        super("Simular lanzar Moneda");
        CreacionVentana();

    } // fin-constructor

    private void CreacionVentana(){
        
        Moneda moneda = new Moneda();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(400,380);
        lblsimulador.setBounds(100, 30, 200, 30);
        lblfrecuenciaCara.setBounds(110 , 220, 60, 30);
        lblfrecuenciaCruz.setBounds(210 , 220, 60, 30);
        btnMoneda.setBounds(140, 130, 100, 50);;
        lblResultado.setBounds(180, 80, 60, 30);
        btnLimpiar.setBounds(140, 270, 90, 25);

        add(lblsimulador);
        add(lblfrecuenciaCara);
        add(lblfrecuenciaCruz);
        add(btnMoneda);
        add(lblResultado);
        add(btnLimpiar);


        btnMoneda.addActionListener( new ActionListener() {

            public void actionPerformed( ActionEvent evt ){

                moneda.lanzarMoneda();
                lblfrecuenciaCara.setText( "CARA: " + moneda.getFrecuenciaCara() );
                lblfrecuenciaCruz.setText( "CRUZ: " + moneda.getFrecuenciaCruz() );
                lblResultado.setText( moneda.getCara() );

            } // fin-actionPerformed

        }); // fin parámetros-addActionListener

        btnLimpiar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                moneda.limpiar();
                lblfrecuenciaCara.setText( "CARA: " + moneda.getFrecuenciaCara() );
                lblfrecuenciaCruz.setText( "CRUZ: " + moneda.getFrecuenciaCruz() );
                lblResultado.setText( moneda.getCara() );

            }
            
        });


    } // fin-creacionVentana


} // fin-class Frontend
