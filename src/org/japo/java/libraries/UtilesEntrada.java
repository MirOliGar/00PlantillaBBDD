/*
 * Copyright 2020 Mireia Oliver García <mireia.oliver.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mireia Oliver García <mireia.oliver.alum@iescamp.es>
 */
public class UtilesEntrada {
//Scanner.

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    //*************************************************************************
    //                     ENTRADA POR TECLADO
    //*************************************************************************
    //Método para obtener un número real.
    public static final double obtenerReal(String msgUsr, String msgErr) {
        boolean entradaOK = false;
        double numero = 0;
        do {
            try {
                System.out.print(msgUsr);
                numero = SCN.nextDouble();
                entradaOK = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (!entradaOK);

        return numero;
    }

    //Utilizando el método anterior, sacamos el entero.
    public static final int obtenerEntero(String msgUsr, String msgErr) {
        return (int) obtenerReal(msgUsr, msgErr);
    }

    //Método para obtener un caracter
    public static final char obtenerCaracter(String msgUsr, String msgErr) {
        boolean entradaOK = false;
        char caracter = 'A';
        do {
            try {
                System.out.print(msgUsr);
                caracter = SCN.nextLine().charAt(0);
                entradaOK = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            }
        } while (!entradaOK);

        return caracter;
    }

    //Método para obtener un valor lógico
    public static final boolean obtenerLogico(String msgUsr, String msgErr) {
        boolean entradaOK = false;
        boolean logico = false;
        do {
            try {
                System.out.print(msgUsr);
                logico = SCN.nextBoolean();
                entradaOK = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (!entradaOK);

        return logico;

    }

    //Método para obtener texto.
    public static final String obtenerTexto(String msgUsr) {

        System.out.print(msgUsr);
        return SCN.nextLine();

    }

    //*************************************************************************
    //                           OBTENER RANGOS
    //*************************************************************************
    public static final int obtenerEnteroRango(int min, int max, String msgUsr,
            String msgErr) {

        //Variables
        int dato;
        //Semáforo
        boolean entradaOK = false;

        //Bucle
        do {
            //Traigo el código de obtener entero
            dato = obtenerEntero(msgUsr, msgErr);

            //Bucle de comprobación
            if (dato >= min && dato <= max) {
                entradaOK = true;
            } else {
                System.out.println("RANGO INCORRECTO");
            }

        } while (!entradaOK);

        //Salida por pantalla
        return dato;
    }
    
    public static final double obtenerRealRango(double minRea, double maxRea,
            String msgUsr, String msgErr){
        //Variables
        double dato;
        //Semáforo
        boolean entradaOK = false;

        //Bucle
        do {
            //Traigo el código de obtener entero
            dato = obtenerEntero(msgUsr, msgErr);

            //Bucle de comprobación
            if (dato >= minRea && dato <= maxRea) {
                entradaOK = true;
            } else {
                System.out.println("RANGO INCORRECTO");
            }

        } while (!entradaOK);

        //Salida por pantalla
        return dato;
    }
//    
//    public static final char obtenerCaracterRango(char minCar, char maxCar, 
//            String msgUsr, String msgErr){
//        
//    }
}
