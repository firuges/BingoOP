/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author PERSONAL
 */
public class Utilidades {
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
 
    /**
     * Validate given email with regular expression.
     * 
     * @param email
     *            email for validation
     * @return true valid email, otherwise false
     */
    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    //metodo para validar si la fecha es correcta
    //metodo para validar si la fecha es correcta
    public static boolean validarFecha(String fechax) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = formatoFecha.parse(fechax);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    public static boolean passLengthTrust(String pass, String pass2){
        if(pass.length() < 6 || pass2.length() < 6){
            return false;
        }
        return true;
    }
    public static boolean pass1pass2Trust(String pass1, String pass2){
        if(pass1.equals(pass2)){
            return true;
        }
        return false;
    }
    public static boolean camposCompletos(String nombre, String apellido, String Email, String Password, String Password2, String UserName){
        if(nombre.equalsIgnoreCase("") ||apellido.equalsIgnoreCase("") ||Email.equalsIgnoreCase("") ||Password.equalsIgnoreCase("") ||Password2.equalsIgnoreCase("")|| UserName.equalsIgnoreCase("")){
            return false;
        }
         return true;
    }
    public static String FormatearFechaToString(Date fecha) {
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
        String FechaString = formatoFecha.format(fecha);
        return FechaString;
    }
    public static Date FormatearFechaToDate(String fecha) throws ParseException {
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
        Date Fecha = formatoFecha.parse(fecha);
        return Fecha;
    }
    public static String FormatearFechaToStringSQL(Date fecha) throws ParseException {
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String FechaString = formatoFecha.format(fecha);
        return FechaString;
    }
    
    public static boolean validateEmail(String email) {
 
        // Compiles the given regular expression into a pattern.
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
 
    }
}
