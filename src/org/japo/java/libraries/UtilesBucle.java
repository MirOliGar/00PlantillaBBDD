/*
 * Copyright 2020 Mireia.
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
 * @author Mireia
 */
public class UtilesBucle {

    public static final String obtenerDiaSemSrg(int DIAS, String DIA) {

        for (int i = 0; i < DIAS; i++) {

            if (i == 0) {
                DIA = "Lunes";
            }
            if (i == 1) {
                DIA = "Martes";
            }
            if (i == 2) {
                DIA = "Miércoles";
            }
            if (i == 3) {
                DIA = "Jueves";
            }
            if (i == 4) {
                DIA = "Viernes";
            }
            if (i == 5) {
                DIA = "Sábado";
            }
            if (i == 6) {
                DIA = "Domingo";
            }
        }

        return DIA;
    }

    public static final String obtenerEquals(String nombre, String MSG_SI,
            String MSG_NO, String texto) {
        
        if (nombre.equals(texto)) {
            return MSG_SI;
        } else {
            return MSG_NO;
        }

    }

}
