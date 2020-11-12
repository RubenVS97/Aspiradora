/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aspiradora;

import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author diabl
 */
public class Aspiradora {

    public static void main(String[] args) {
        boolean repetir = true;
        double bateria = 100;
        final double PORCENTAJEGASTADONORMAL = 1.5;
        final double PORCENTAJEGASTADOFREGADO = 2.25;
        String salir = "si";

        do {

            JOptionPane.showMessageDialog(null, "Hola bienvenido a la app de la aspiradora");
            String sModo = JOptionPane.showInputDialog(null, "Introduzca el modo que quiere ejecutar\n"
                    + "1.Modo Completo\n"
                    + "2.Modo Dependencia \n"
                    + "3.Modo Fregado \n"
                    + "4.Estado General \n"
                    + "5.Base de Carga \n"
                    + "6.Salir");
            int modo = Integer.parseInt(sModo);

            //do {
            String sCocina = JOptionPane.showInputDialog(null, "Introduzca el tamaño de la cocina");
            double metrosCocina = Double.parseDouble(sCocina);

            String sSalon = JOptionPane.showInputDialog(null, "Introduzca el tamaño del salón");
            double metrosSalon = Double.parseDouble(sSalon);

            String sHabitacion1 = JOptionPane.showInputDialog(null, "Introduzca el tamaño de la habitación 1");
            double metrosHabitacion1 = Double.parseDouble(sHabitacion1);

            String sHabitacion2 = JOptionPane.showInputDialog(null, "Introduzca el tamaño de la habitación 2");
            double metrosHabitacion2 = Double.parseDouble(sHabitacion2);

            String sBaño = JOptionPane.showInputDialog(null, "Introduzca el tamaño del cuarto de baño");
            double metrosBaño = Double.parseDouble(sBaño);

            //} while (metrosCocina > 1 && metrosCocina < 100);
            switch (modo) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Ha seleccionado el modo completo");
                    JOptionPane.showMessageDialog(null, "El robot empieza por la cocina tiene " + bateria + "%");
                    double bateriaNecesaria = bateria - (metrosCocina * PORCENTAJEGASTADONORMAL);
                    bateria = bateriaNecesaria;
                    bateriaNecesaria = 0;
                    JOptionPane.showMessageDialog(null, "El robot empieza el salón y tiene " + bateria + "%");
                    bateriaNecesaria = bateria - (metrosSalon * PORCENTAJEGASTADONORMAL);
                    if (bateria < bateriaNecesaria) {
                        JOptionPane.showMessageDialog(null, "No tiene suficiente bateria  ");
                    }
                    bateria = bateriaNecesaria;
                    bateriaNecesaria = 0;
                    JOptionPane.showMessageDialog(null, "El robot empieza la primera habitación y tiene " + bateria + "%");
                    bateriaNecesaria = bateria - (metrosHabitacion1 * PORCENTAJEGASTADONORMAL);
                    if (bateriaNecesaria >= bateria) {
                        JOptionPane.showMessageDialog(null, "No tiene suficiente bateria  ");
                    }
                    bateria = bateriaNecesaria;
                    bateriaNecesaria = 0;
                    JOptionPane.showMessageDialog(null, "El robot empieza la segunda habitación y tiene " + bateria + "%");
                    bateriaNecesaria = bateria - (metrosHabitacion2 * PORCENTAJEGASTADONORMAL);
                    if (bateria < bateriaNecesaria) {
                        JOptionPane.showMessageDialog(null, "No tiene suficiente bateria  ");
                    }
                    bateria = bateriaNecesaria;
                    bateriaNecesaria = 0;
                    JOptionPane.showMessageDialog(null, "El robot empieza la segunda habitación y tiene " + bateria + "%");
                    bateriaNecesaria = bateria - (metrosCocina * PORCENTAJEGASTADONORMAL);
                    if (bateria < bateriaNecesaria) {
                        JOptionPane.showMessageDialog(null, "No tiene suficiente bateria  ");
                    }
                    bateria = bateriaNecesaria;
                    bateriaNecesaria = 0;
                    JOptionPane.showMessageDialog(null, "Le queda " + bateria + "%");
                    JOptionPane.showInputDialog(null, "¿Quiere cargar la bateria?");

                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Ha seleccionado el modo dependencia");

                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Ha seleccionado el modo fregado");

                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Ha seleccionado el estado general");

                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Ha seleccionado base de carga");

                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Ha seleccionado salir");
                    repetir = false;
            }

        } while (repetir);
    }
}
