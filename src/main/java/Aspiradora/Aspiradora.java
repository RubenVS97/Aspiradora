/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aspiradora;

import javax.swing.JOptionPane;

/**
 *
 * @author diabl
 */
public class Aspiradora {

    public static void main(String[] args) {
        //Inicializamos las variables 
        boolean repetir = true;
        double bateria = 100;
        double bateriaNecesaria;
        final double PORCENTAJEGASTADONORMAL = 1.5;
        final double PORCENTAJEGASTADOFREGADO = 2.25;
        String salir = "si";
        String resultado;
        final String usuario = "usuario";
        final String contraseña = "contraseña";
        int modoDependencia1;
        String sMododependenci;
        String sMododependencia1;
        //Bucle para que introduzca la contraseña

        JOptionPane.showMessageDialog(null, "Hola bienvenido a la app de la aspiradora");
        do {
            resultado = JOptionPane.showInputDialog(null, "Introduzca el usuario");

        } while (!resultado.equalsIgnoreCase(usuario));
        do {
            resultado = JOptionPane.showInputDialog(null, "Introduzca la contraseña");

        } while (!resultado.equalsIgnoreCase(contraseña));

        //Menú de la aspiradora 
        String sModo = JOptionPane.showInputDialog(null, "Introduzca el modo que quiere ejecutar\n"
                + "1.Modo Completo\n"
                + "2.Modo Dependencia \n"
                + "3.Modo Fregado \n"
                + "4.Estado General \n"
                + "5.Base de Carga \n"
                + "6.Salir");
        int modo = Integer.parseInt(sModo);
        //Damos valor a las habitaciones de la casa
        //do {
        String sCocina = JOptionPane.showInputDialog(null, "Introduzca el tamaño de la cocina");
        double metrosCocina = Double.parseDouble(sCocina);

        String sSalon = JOptionPane.showInputDialog(null, "Introduzca el tamaño del salón");
        double metrosSalon = Double.parseDouble(sSalon);

        String sHabitacion1 = JOptionPane.showInputDialog(null, "Introduzca el tamaño de la habitación 1");
        double metrosHabitacion1 = Double.parseDouble(sHabitacion1);

        String sHabitacion2 = JOptionPane.showInputDialog(null, "Introduzca el tamaño de la habitación 2");
        double metrosHabitacion2 = Double.parseDouble(sHabitacion2);

        String sBanio = JOptionPane.showInputDialog(null, "Introduzca el tamaño del cuarto de baño");
        double metrosBanio = Double.parseDouble(sBanio);

        //} while (metrosCocina > 1 && metrosCocina < 100);
        switch (modo) {

            case 1:
                //Modo completo 
                JOptionPane.showMessageDialog(null, "Ha seleccionado el modo completo");
                JOptionPane.showMessageDialog(null, "El robot empieza por la cocina");
                bateriaNecesaria = (metrosCocina * PORCENTAJEGASTADONORMAL);
                JOptionPane.showMessageDialog(null, "El robot empieza el salón y tiene " + bateria + "%");
                bateriaNecesaria = (metrosSalon * PORCENTAJEGASTADONORMAL);

                if (bateria < bateriaNecesaria || bateria < 3) {
                    JOptionPane.showMessageDialog(null, "No tiene suficiente bateria ");

                } else {

                    bateriaNecesaria = (metrosHabitacion1 * PORCENTAJEGASTADONORMAL);
                    bateria -= bateriaNecesaria;
                    bateriaNecesaria = 0;
                }

                JOptionPane.showMessageDialog(null, "El robot empieza la cocina y tiene " + bateria + "%");
                bateriaNecesaria = (metrosHabitacion1 * PORCENTAJEGASTADONORMAL);
                if (bateria < bateriaNecesaria || bateria < 3) {
                    JOptionPane.showMessageDialog(null, "No tiene suficiente bateria");

                } else {

                    bateria -= bateriaNecesaria;
                    bateriaNecesaria = 0;
                }

                JOptionPane.showMessageDialog(null, "El robot empieza la habitación 1 y tiene " + bateria + "%");
                bateriaNecesaria = (metrosHabitacion2 * PORCENTAJEGASTADONORMAL);
                if (bateria < bateriaNecesaria || bateria < 3) {
                    JOptionPane.showMessageDialog(null, "No tiene suficiente bateria ");

                } else {

                    bateria -= bateriaNecesaria;
                    bateriaNecesaria = 0;
                }

                JOptionPane.showMessageDialog(null, "El robot empieza la habitación 2  y tiene " + bateria + "%");
                bateriaNecesaria = (metrosBanio * PORCENTAJEGASTADONORMAL);
                if (bateria < bateriaNecesaria || bateria < 3) {
                    JOptionPane.showMessageDialog(null, "No tiene suficiente bateria ");

                } else {

                    bateria -= bateriaNecesaria;
                    bateriaNecesaria = 0;

                }
                JOptionPane.showMessageDialog(null, "El robot empieza el baño y tiene " + bateria + "%");
                bateriaNecesaria = (metrosBanio * PORCENTAJEGASTADONORMAL);
                if (bateria < bateriaNecesaria || bateria < 3) {
                    JOptionPane.showMessageDialog(null, "No tiene suficiente bateria ");

                } else {

                    bateriaNecesaria = (metrosHabitacion1 * PORCENTAJEGASTADONORMAL);
                    bateria -= bateriaNecesaria;
                    bateriaNecesaria = 0;
                }
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Ha seleccionado el modo dependencia");
                String sMododependencia = JOptionPane.showInputDialog(null, "Introduzca la/las habitaciones que quiere limpiar\n"
                        + "1.Cocina\n"
                        + "2.Salón \n"
                        + "3.Habitación 1 \n"
                        + "4.Habitación 2 \n"
                        + "5.Baño \n"
                        + "6.Salir");
                int modoDependencia = Integer.parseInt(sMododependencia);

                switch (modoDependencia) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Ha seleccionado la cocina ");
                        JOptionPane.showMessageDialog(null, "El robot empieza por la cocina tiene " + bateria + "%");
                        bateriaNecesaria = (metrosCocina * PORCENTAJEGASTADONORMAL);
                        if (bateria < bateriaNecesaria || bateria < 3) {
                            JOptionPane.showMessageDialog(null, "No tiene suficiente batería");
                        } else {

                            bateria -= bateriaNecesaria;
                            bateriaNecesaria = 0;

                        }
                        sMododependencia1 = JOptionPane.showInputDialog(null, "Introduzca la siguiente habitación que quiere limpiar\n"
                                + "1.Salón\n"
                                + "2.Habitación 1 \n"
                                + "3.Habitación 2 \n"
                                + "4.Baño \n"
                                + "5.Salir \n");
                        modoDependencia1 = Integer.parseInt(sMododependencia);
                        switch (modoDependencia1) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "El robot empieza el salón y tiene " + bateria + "%");
                                bateriaNecesaria = (metrosSalon * PORCENTAJEGASTADONORMAL);
                                if (bateria < bateriaNecesaria || bateria < 3) {
                                    JOptionPane.showMessageDialog(null, "No tiene suficiente batería");
                                } else {

                                    bateria -= bateriaNecesaria;
                                    bateriaNecesaria = 0;
                                }
                                sMododependencia1 = JOptionPane.showInputDialog(null, "Introduzca la siguiente habitación que quiere limpiar\n"
                                        + "1.Habitacion 1\n"
                                        + "2.Habitación 2 \n"
                                        + "3.Baño \n"
                                        + "4.Salir \n");
                                modoDependencia1 = Integer.parseInt(sMododependencia);

                                switch (modoDependencia1) {
                                    case 1:
                                        JOptionPane.showMessageDialog(null, "El robot empieza la habitación 1  y tiene " + bateria + "%");
                                        bateriaNecesaria = (metrosHabitacion1 * PORCENTAJEGASTADONORMAL);
                                        if (bateria < bateriaNecesaria || bateria < 3) {
                                            JOptionPane.showMessageDialog(null, "No tiene suficiente batería");
                                        } else {

                                            bateria -= bateriaNecesaria;
                                            bateriaNecesaria = 0;
                                        }

                                        sMododependencia1 = JOptionPane.showInputDialog(null, "Introduzca la siguiente habitación que quiere limpiar\n"
                                                + "1.Habitacion 2\n"
                                                + "2.Baño \n"
                                                + "3.Salir \n");
                                        modoDependencia1 = Integer.parseInt(sMododependencia);

                                        switch (modoDependencia1) {
                                            case 1:
                                                JOptionPane.showMessageDialog(null, "El robot empieza la habitación 2  y tiene " + bateria + "%");
                                                bateriaNecesaria = (metrosHabitacion2 * PORCENTAJEGASTADONORMAL);
                                                if (bateria < bateriaNecesaria || bateria < 3) {
                                                    JOptionPane.showMessageDialog(null, "No tiene suficiente batería");
                                                } else {

                                                    bateria -= bateriaNecesaria;
                                                    bateriaNecesaria = 0;
                                                }

                                                sMododependencia1 = JOptionPane.showInputDialog(null, "Introduzca la siguiente habitación que quiere limpiar\n"
                                                        + "1.Baño\n"
                                                        + "2.Salir \n");
                                                modoDependencia1 = Integer.parseInt(sMododependencia);
                                                switch (modoDependencia1) {
                                                    case 1:
                                                        JOptionPane.showMessageDialog(null, "El robot empieza el baño  y tiene " + bateria + "%");
                                                        bateriaNecesaria = (metrosBanio * PORCENTAJEGASTADONORMAL);
                                                        if (bateria < bateriaNecesaria || bateria < 3) {
                                                            JOptionPane.showMessageDialog(null, "No tiene suficiente batería");
                                                        } else {
                                                            bateria -= bateriaNecesaria;
                                                            bateriaNecesaria = 0;
                                                        }
                                                        JOptionPane.showMessageDialog(null, "El robot ha limpiado por completo y tiene " + bateria + "%");
                                                        break;
                                                }
                                                break;
                                            case 2:
                                                break;
                                        }
                                    case 2:
                                        break;
                                }
                                modoDependencia1 = Integer.parseInt(sMododependencia);
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                        }
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Ha seleccionado la habitación 1 ");
                        JOptionPane.showMessageDialog(null, "El robot empieza por la habitacón 1 tiene " + bateria + "%");
                        bateriaNecesaria = bateria - (metrosHabitacion1 * PORCENTAJEGASTADONORMAL);
                        bateria = bateriaNecesaria;
                        bateriaNecesaria = 0;
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Ha seleccionado la habitación 2 ");
                        JOptionPane.showMessageDialog(null, "El robot empieza por la habitacón 2 tiene " + bateria + "%");
                        bateriaNecesaria = bateria - (metrosHabitacion2 * PORCENTAJEGASTADONORMAL);
                        bateria = bateriaNecesaria;
                        bateriaNecesaria = 0;
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Ha seleccionado el baño");
                        JOptionPane.showMessageDialog(null, "El robot empieza baño tiene " + bateria + "%");
                        bateriaNecesaria = bateria - (metrosBanio * PORCENTAJEGASTADONORMAL);
                        bateria = bateriaNecesaria;
                        bateriaNecesaria = 0;
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Ha seleccionado salir");
                        repetir = false;
                        break;

                }
                while (repetir);

        }

    }
}
