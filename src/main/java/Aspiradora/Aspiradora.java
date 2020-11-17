/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aspiradora;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author diabl
 */
public class Aspiradora {

    public static void main(String[] args) {
        //Inicializamos las variables 
        boolean repetir = true;
        boolean salirBucle = true;
        boolean cocinaSucio = true;
        boolean salonSucio = true;
        boolean habitacion1Sucio = true;
        boolean habitacion2Sucio = true;
        boolean banioSucio = true;
        double bateria = 100;
        double bateriaNecesaria;
        double metrosCocina, metrosSalon, metrosHabitacion1, metrosHabitacion2, metrosBanio;
        final double PORCENTAJEGASTADONORMAL = 1.5;
        final double PORCENTAJEGASTADOFREGADO = 2.25;
        String salir = "si";
        String resultado;
        final String usuario = "usuario";
        final String contraseña = "contraseña";
        int modoDependencia1;
        String sMododependenci;
        String sMododependencia1;
        String sitio = " base de carga";
        //Bucle para que introduzca la contraseña

        JOptionPane.showMessageDialog(null, "Hola bienvenido a la app de la aspiradora");
        do {
            resultado = JOptionPane.showInputDialog(null, "Introduzca el usuario");

        } while (!resultado.equalsIgnoreCase(usuario));
        do {
            resultado = JOptionPane.showInputDialog(null, "Introduzca la contraseña");

        } while (!resultado.equalsIgnoreCase(contraseña));
        do {
            String sCocina = JOptionPane.showInputDialog(null, "Introduzca el tamaño de la cocina");
            metrosCocina = Double.parseDouble(sCocina);
        } while (metrosCocina < 0 || metrosCocina > 100);
        do {
            String sSalon = JOptionPane.showInputDialog(null, "Introduzca el tamaño del salón");
            metrosSalon = Double.parseDouble(sSalon);
        } while (metrosSalon < 0 || metrosSalon > 100);
        do {
            String sHabitacion1 = JOptionPane.showInputDialog(null, "Introduzca el tamaño de la habitación 1");
            metrosHabitacion1 = Double.parseDouble(sHabitacion1);
        } while (metrosHabitacion1 < 0 || metrosHabitacion1 > 100);
        do {
            String sHabitacion2 = JOptionPane.showInputDialog(null, "Introduzca el tamaño de la habitación 2");
            metrosHabitacion2 = Double.parseDouble(sHabitacion2);
        } while (metrosHabitacion2 < 0 || metrosHabitacion2 > 100);
        do {
            String sBanio = JOptionPane.showInputDialog(null, "Introduzca el tamaño del cuarto de baño");
            metrosBanio = Double.parseDouble(sBanio);
        } while (metrosBanio < 0 || metrosBanio > 100);
        do {
            //Menú de la aspiradora 
            String sModo = JOptionPane.showInputDialog(null, "Introduzca el modo que quiere ejecutar\n"
                    + "1.Modo Completo\n"
                    + "2.Modo Dependencia \n"
                    + "3.Modo Fregado \n"
                    + "4.Estado General \n"
                    + "5.Base de Carga \n"
                    + "6.Ensuciar la casa\n"
                    + "7.Salir");
            int modo = Integer.parseInt(sModo);
            //Damos valor a las habitaciones de la casa

            switch (modo) {

                case 1:
                    //Modo completo limpia todas las habitaciones que pueda hasta que le quede la suficiente batería
                    JOptionPane.showMessageDialog(null, "Ha seleccionado el modo completo");

                    JOptionPane.showMessageDialog(null, "El robot empieza por la cocina");
                    bateriaNecesaria = (metrosCocina * PORCENTAJEGASTADONORMAL);
                    if (cocinaSucio) {
                        if (bateria < bateriaNecesaria || bateria < 3) {
                            JOptionPane.showMessageDialog(null, "No tiene suficiente bateria ");
                        } else {
                            bateria -= bateriaNecesaria;
                            bateriaNecesaria = 0;
                            JOptionPane.showMessageDialog(null, "El robot ha limpiado la cocina");
                            sitio = " la cocina";
                            cocinaSucio = false;
                            JOptionPane.showMessageDialog(null, "Después de limpiar  tiene: " + bateria + "%");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La cocina está limpia ");
                    }

                    JOptionPane.showMessageDialog(null, "El robot empieza el salón ");

                    bateriaNecesaria = (metrosSalon * PORCENTAJEGASTADONORMAL);
                    if (salonSucio) {
                        if (bateria < bateriaNecesaria || bateria < 3) {
                            JOptionPane.showMessageDialog(null, "No tiene suficiente bateria ");
                        } else {
                            bateria -= bateriaNecesaria;
                            bateriaNecesaria = 0;
                            JOptionPane.showMessageDialog(null, "El robot ha limpiado el salón");
                            sitio = " el salón";
                            salonSucio = false;
                            JOptionPane.showMessageDialog(null, "Después de limpiar tiene:" + bateria + "%");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El salón está limpio ");
                    }
                    JOptionPane.showMessageDialog(null, "El robot empieza la habitación 1 ");
                    bateriaNecesaria = (metrosHabitacion1 * PORCENTAJEGASTADONORMAL);
                    if (habitacion1Sucio) {
                        if (bateria < bateriaNecesaria || bateria < 3) {
                            JOptionPane.showMessageDialog(null, "No tiene suficiente bateria");
                        } else {
                            bateria -= bateriaNecesaria;
                            bateriaNecesaria = 0;
                            JOptionPane.showMessageDialog(null, "El robot ha limpiado la habitación 1 ");
                            sitio = " la habitación 1";
                            habitacion1Sucio = false;
                            JOptionPane.showMessageDialog(null, "Después de limpiar tiene:" + bateria + "%");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La habitación 1 está limpia ");
                    }
                    JOptionPane.showMessageDialog(null, "El robot empieza la habitación 2 ");
                    bateriaNecesaria = (metrosHabitacion2 * PORCENTAJEGASTADONORMAL);
                    if (habitacion2Sucio) {
                        if (bateria < bateriaNecesaria || bateria < 3) {
                            JOptionPane.showMessageDialog(null, "No tiene suficiente bateria ");

                        } else {
                            bateria -= bateriaNecesaria;
                            bateriaNecesaria = 0;
                            sitio = " la habitación 2";
                            habitacion2Sucio = false;
                            JOptionPane.showMessageDialog(null, "Después de limpiar tiene:" + bateria + "%");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La habitación 2 está limpia ");
                    }
                    JOptionPane.showMessageDialog(null, "El robot empieza el baño ");
                    bateriaNecesaria = (metrosBanio * PORCENTAJEGASTADONORMAL);
                    if (banioSucio) {
                        if (bateria < bateriaNecesaria || bateria < 3) {
                            JOptionPane.showMessageDialog(null, "No tiene suficiente bateria ");

                        } else {
                            bateria -= bateriaNecesaria;
                            bateriaNecesaria = 0;
                            sitio = " el Baño";
                            banioSucio = false;
                            JOptionPane.showMessageDialog(null, "Después de limpiar tiene:" + bateria + "%");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El baño está limpia ");
                    }
                    break;
                //Modo dependencia selecciona la habitación deseada pero si está ya limpia no se podrá repetir 
                case 2:

                    JOptionPane.showMessageDialog(null, "Ha seleccionado el modo dependencia");
                    do {
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
                                bateriaNecesaria = (metrosCocina * PORCENTAJEGASTADONORMAL);
                                if (cocinaSucio) {
                                    if (bateria < bateriaNecesaria || bateria < 3) {
                                        JOptionPane.showMessageDialog(null, "No tiene suficiente batería");
                                    } else {

                                        bateria -= bateriaNecesaria;
                                        bateriaNecesaria = 0;
                                        cocinaSucio = false;
                                        sitio = " la cocina ";
                                        JOptionPane.showMessageDialog(null, "Después de limpiar tiene: " + bateria + "%");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "La cocina está limpia ");
                                }
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Ha seleccionado el salón ");

                                bateriaNecesaria = (metrosSalon * PORCENTAJEGASTADONORMAL);
                                if (salonSucio) {
                                    if (bateria < bateriaNecesaria || bateria < 3) {
                                        JOptionPane.showMessageDialog(null, "No tiene suficiente batería");
                                    } else {
                                        bateria -= bateriaNecesaria;
                                        bateriaNecesaria = 0;
                                        salonSucio = false;
                                        sitio = " el salón";
                                        JOptionPane.showMessageDialog(null, "Después de limpiar tiene:" + bateria + "%");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "El salón está limpio ");
                                }
                                break;
                            case 3:

                                JOptionPane.showMessageDialog(null, "Ha seleccionado la habitación 1 ");
                                bateriaNecesaria = (metrosHabitacion1 * PORCENTAJEGASTADONORMAL);
                                if (habitacion1Sucio) {
                                    if (bateria < bateriaNecesaria || bateria < 3) {
                                        JOptionPane.showMessageDialog(null, "No tiene suficiente batería");
                                    } else {

                                        bateria -= bateriaNecesaria;
                                        bateriaNecesaria = 0;
                                        habitacion1Sucio = false;
                                        sitio = " la habitación 1";
                                        JOptionPane.showMessageDialog(null, "Después de limpiar tiene:" + bateria + "%");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "La habitación 1 está limpia ");
                                }
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Ha seleccionado la habitación 2 ");
                                bateriaNecesaria = (metrosHabitacion2 * PORCENTAJEGASTADONORMAL);
                                if (habitacion2Sucio) {
                                    if (bateria < bateriaNecesaria || bateria < 3) {
                                        JOptionPane.showMessageDialog(null, "No tiene suficiente batería");
                                    } else {

                                        bateria -= bateriaNecesaria;
                                        bateriaNecesaria = 0;
                                        habitacion2Sucio = false;
                                        sitio = " la habitación 2";
                                        JOptionPane.showMessageDialog(null, "Después de limpiar tiene:" + bateria + "%");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "La habitación 2 está limpia ");

                                }
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Ha seleccionado el baño ");
                                bateriaNecesaria = (metrosBanio * PORCENTAJEGASTADONORMAL);
                                if (banioSucio) {
                                    if (bateria < bateriaNecesaria || bateria < 3) {
                                        JOptionPane.showMessageDialog(null, "No tiene suficiente batería");
                                    } else {
                                        bateria -= bateriaNecesaria;
                                        bateriaNecesaria = 0;
                                        banioSucio = false;
                                        sitio = " el baño";
                                        JOptionPane.showMessageDialog(null, "Después de limpiar tiene:" + bateria + "%");
                                    }
                                }
                                JOptionPane.showMessageDialog(null, "El baño está limpio ");
                                break;
                            case 6:
                                JOptionPane.showMessageDialog(null, "Ha seleccionado salir");
                                salirBucle = false;
                                break;
                        }
                    } while (salirBucle);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Ha seleccionado el modo fregado ");
                    do {
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
                                JOptionPane.showMessageDialog(null, "Ha seleccionado la cocina");
                                bateriaNecesaria = (metrosCocina * PORCENTAJEGASTADOFREGADO);
                                if (cocinaSucio) {
                                    if (bateria < bateriaNecesaria || bateria < 3) {
                                        JOptionPane.showMessageDialog(null, "No tiene suficiente batería");
                                    } else {

                                        bateria -= bateriaNecesaria;
                                        bateriaNecesaria = 0;
                                        cocinaSucio = false;
                                        sitio = " la cocina";
                                        JOptionPane.showMessageDialog(null, "Después de limpiar tiene:" + bateria + "%");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "La cocina está limpia ");
                                }
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Ha seleccionado el salón ");

                                bateriaNecesaria = (metrosSalon * PORCENTAJEGASTADOFREGADO);
                                if (salonSucio) {
                                    if (bateria < bateriaNecesaria || bateria < 3) {
                                        JOptionPane.showMessageDialog(null, "No tiene suficiente batería");
                                    } else {
                                        bateria -= bateriaNecesaria;
                                        bateriaNecesaria = 0;
                                        salonSucio = false;
                                        sitio = " el salón";
                                        JOptionPane.showMessageDialog(null, "Después de limpiar tiene:" + bateria + "%");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "El salón está limpio ");
                                }
                                break;
                            case 3:

                                JOptionPane.showMessageDialog(null, "Ha seleccionado la habitación 1 ");
                                bateriaNecesaria = (metrosHabitacion1 * PORCENTAJEGASTADOFREGADO);
                                if (habitacion1Sucio) {
                                    if (bateria < bateriaNecesaria || bateria < 3) {
                                        JOptionPane.showMessageDialog(null, "No tiene suficiente batería");
                                    } else {

                                        bateria -= bateriaNecesaria;
                                        bateriaNecesaria = 0;
                                        habitacion1Sucio = false;
                                        sitio = " la habitación 1";
                                        JOptionPane.showMessageDialog(null, "Después de limpiar tiene:" + bateria + "%");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "La habitación 1 está limpia ");
                                }
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Ha seleccionado la habitación 2 ");
                                bateriaNecesaria = (metrosHabitacion2 * PORCENTAJEGASTADOFREGADO);
                                if (habitacion2Sucio) {
                                    if (bateria < bateriaNecesaria || bateria < 3) {
                                        JOptionPane.showMessageDialog(null, "No tiene suficiente batería");
                                    } else {

                                        bateria -= bateriaNecesaria;
                                        bateriaNecesaria = 0;
                                        habitacion2Sucio = false;
                                        sitio = " la habitación 2";
                                        JOptionPane.showMessageDialog(null, "Después de limpiar tiene:" + bateria + "%");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "La habitación 2 está limpia ");
                                }
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Ha seleccionado el baño ");
                                bateriaNecesaria = (metrosBanio * PORCENTAJEGASTADOFREGADO);
                                if (banioSucio) {
                                    if (bateria < bateriaNecesaria || bateria < 3) {
                                        JOptionPane.showMessageDialog(null, "No tiene suficiente batería");
                                    } else {
                                        bateria -= bateriaNecesaria;
                                        bateriaNecesaria = 0;
                                        banioSucio = false;
                                        sitio = " el baño";
                                        JOptionPane.showMessageDialog(null, "Después de limpiar tiene:" + bateria + "%");
                                    }
                                }
                                JOptionPane.showMessageDialog(null, "El baño está limpio ");
                                break;
                            case 6:
                                JOptionPane.showMessageDialog(null, "Ha seleccionado salir");
                                salirBucle = false;
                                break;
                        }
                    } while (salirBucle);
                    break;
                case 4:
                    //Este es el switch del estado general de la aspiradora
                    JOptionPane.showMessageDialog(null, "Ha seleccionado Estado General ");
                    Date date = new Date();
                    
                    //obtener hora y fecha 
                    DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
                    JOptionPane.showMessageDialog(null, "Hora y fecha: " + hourdateFormat.format(date));
                    //Nivel Batería
                    JOptionPane.showMessageDialog(null, "La batería es de: " + bateria);
                    //Metros cuadrados de la casa
                    JOptionPane.showMessageDialog(null, "Los metros de cada habitación son de  "
                            + metrosCocina + " para la cocina, \n"
                            + metrosSalon + " para el salón \n"
                            + metrosHabitacion1 + " para la primra habitación,\n "
                            + metrosHabitacion2 + " para la segunda habitación \n"
                            + " y " + metrosBanio + " para el baño ");
                    JOptionPane.showMessageDialog(null, "El robot está en" + sitio);
                    break;
                case 5:
                    bateria = 100;
                    JOptionPane.showMessageDialog(null, "Ha seleccionado cargar la batería, la batería se está cargando...\n"
                            + " La bateria está al " + bateria + "%");
                    sitio = "base de carga";
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Ensuciando la casa... ");
                    cocinaSucio = true;
                    salonSucio = true;
                    habitacion1Sucio = true;
                    habitacion2Sucio = true;
                    banioSucio = true;
                    JOptionPane.showMessageDialog(null, "Ahora tu casa está sucia ");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Ha seleccionado salir");
                    repetir = false;
                    break;
            }
        } while (repetir);
    }
}
