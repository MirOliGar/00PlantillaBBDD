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

import java.util.Random;

/**
 *
 * @author Mireia Oliver García <mireia.oliver.alum@iescamp.es>
 */
public class UtilesRandom {

    public static final Random RND = new Random();

    //Números enteros
    public static final int obtenerRndEntero(int MAX, int MIN) {
        int valor = RND.nextInt(MAX - MIN + 1) + MIN;
        return valor;
    }

    //Números reales
    public static final double obtenerRndReal(double MAX, double MIN) {
        double valor = RND.nextDouble() * (MAX - MIN) + MIN;
        return valor;
    }

    //Boolean
    public static final boolean obtenerRndLogico() {
        boolean valor = RND.nextBoolean();
        return valor;
    }

    //Caracteres
    public static final char obtenerRndCaracter(char CAR_MIN, char CAR_MAX) {
        char valor = (char) (RND.nextInt(CAR_MAX - CAR_MIN + 1) + CAR_MIN);
        return valor;
    }

    //Ascensor
    public static final char obtenerCaracterConjunto(String opciones) {
        char dato = (char) 0;

        try {
            int pos = obtenerRndEntero(0, opciones.length() - 1);
            dato = opciones.charAt(pos);
        } catch (Exception e) {

        }

        return dato;
    }

    //Ejercicio lluvia.
    public static final double obtenerMinMaxRnd(double total, int MAX, int MIN,
        double maxim, double minim, int diaMax, int diaMin, double totalAcum) {

        for (int i = 0; i < 10; i++) {

            total = RND.nextDouble() * (MAX - MIN) + MIN;
            System.out.printf("Lluvia dia %02d......: %.2f%n", i + 1, total);

            if (total > maxim) {
                maxim = total;
                diaMax = i + 1;
            }

            if (total < minim) {
                minim = total;
                diaMin = i + 1;
            }
            // Acumular lluvia
            // Alternativa: lluviaAcum += lluvia;
            totalAcum = totalAcum + total;
        }
        return totalAcum;
    }
}
