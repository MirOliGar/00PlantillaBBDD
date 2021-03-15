/* 
 * Copyright 2020 Mireia Oliver García <mireia.oliver.11@gmail.com>.
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
package org.japo.java.main;

import java.util.Properties;
import org.japo.java.app.App;
import org.japo.java.libraries.UtilesApp;

/**
 *
 * @author Mireia Oliver García - mireia.oliver.11@gmail.com
 */
public class Main {

    //Contraseña
//    private static final String PASSWORD = "JAPO_Onicron-000";
    private static final String PRP_PASSWORD = "app.password";
    //Cargar Propiedades recurso
    private static final Properties PRP = UtilesApp.importarPropiedadesRecurso();

    public static void main(String[] args) {

        try {

            if (args[0].equals(PRP.get(PRP_PASSWORD))) {
                //Instancia App
                App app = new App(PRP);

                //Iniciar app
                app.launchApp();
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("Autodestrucción activada");
            System.out.println("---");
            System.out.println("Contacte con el servicio técnico");
        }

    }
}
