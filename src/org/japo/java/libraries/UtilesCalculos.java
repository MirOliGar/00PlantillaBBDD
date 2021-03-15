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

/**
 *
 * @author Mireia Oliver García <mireia.oliver.alum@iescamp.es>
 */
public class UtilesCalculos {

    //Obtener porcentaje
    public static final double obtenerPorcReal(double NUM1, double NUM2) {
        double valor = (NUM1 * NUM2) / 100;
        return valor;
    }

    public static final int obtenerPorcEntero(int NUM1, int NUM2) {
        return (int) obtenerPorcReal(NUM1, NUM2);
    }

    //Obtener media
    public static final double obtenerMedia(double ACUM, double NUM1) {
        double valor = ACUM / NUM1;
        return valor;
    }

    //Obtener mayor y menor
    public static final double obtenerMayor(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static final double obtenerMenor(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    //Calcular cuadrado de un número
    public static int calcularCuadrado(int n) {
        return n * n;
    }

}

//Añadir:

//calcularDoble
//CalcularMitad
//calcularPotencia
//calcularRaizCuadrada
//calcularAbsoluto
//calcularFactorial
