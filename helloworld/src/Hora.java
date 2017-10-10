import java.util.Calendar;

public class Hora {

    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);
        int min = data.get(Calendar.MINUTE);
        int seg = data.get(Calendar.SECOND);
        //System.out.println(hora + ":" + min + ":" + seg);
    }
}
