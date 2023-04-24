package funcao11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Locale;

public class FuncaoEx11 {

    public static void getDia(String data){

        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        Date dt;
        try {
            dt = df.parse (data);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        DateFormat df2 = new SimpleDateFormat("MMMMM", new Locale("pt", "BR"));
        System.out.println (df2.format (dt)); // "Janeiro"
    }

    public static boolean eValido(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate d = LocalDate.parse(date, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
