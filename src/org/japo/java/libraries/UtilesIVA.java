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
public class UtilesIVA {

    public static final int IVA01 = 4;
    public static final int IVA02 = 10;
    public static final int IVA03 = 21;

    // Validar IVA
    public static final boolean validarTipoIVA(int iva) {
        return iva == IVA01 || iva == IVA02 || iva == IVA03;
    }

}
