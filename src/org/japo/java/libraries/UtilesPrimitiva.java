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
public class UtilesPrimitiva {

    // Lotería Primitiva
    public static final int PRIM_MIN = 1;
    public static final int PRIM_MAX = 49;

    // Validar primitiva - Entre 1 y 49
    public static final boolean validarNumeroPrimitiva(int n) {
        return UtilesValidar.validarRango(n, PRIM_MIN, PRIM_MAX);
    }
}
