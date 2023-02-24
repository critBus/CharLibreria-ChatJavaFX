/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

/**
 *
 * @author Rene
 */
public class Utils {
    //JAVA_RMI_SERVER_CODEBASE

    public static final String CODEBASE = "java.rmi.server.codebase";

    public static void setCodeBase(Class c) {
        String ruta = c.getProtectionDomain().getCodeSource().getLocation().toString(), path = System.getProperty(CODEBASE);
        if (path != null && !path.isEmpty()) {
            ruta = path + " " + ruta;
        }
        System.setProperty(CODEBASE, ruta);
    }
}
