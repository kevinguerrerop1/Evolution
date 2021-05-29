package modelo;

import java.util.Calendar;

public class Fechas {

    public static void main(String[] args) {

        Calendar fecha = Calendar.getInstance();

        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
        System.out.println("Fecha Actual: "
                + dia + "/" + (mes + 1) + "/" + año);
        System.out.printf("Hora Actual: %02d:%02d:%02d %n",
                hora, minuto, segundo);
    }
}
