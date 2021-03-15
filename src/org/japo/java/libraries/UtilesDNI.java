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
public class UtilesDNI {

    //Secuencia de letras
    public static final String SECUENCIA = "TRWAGMYFPDXBNJZSQVHLCKE";

    //Método validar
    public static final boolean validar(int num, char ctr) {
        //Calcular letra
        char ctrAct = calcular(num);
        //Devolver comparación letras
        return ctrAct == ctr;
    }

    //Método calcular
    public static final char calcular(int num) {
        //Calcular posición
        int pos = num % 23;
        //Devolver
        return SECUENCIA.charAt(pos);
    }

}
