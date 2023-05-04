import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        // Gerar data e hora do momento que instancia:
        System.out.println("DATA E HORA DO MOMENTO");

        LocalDate ex01 = LocalDate.now(); // Mostra apenas a data (yyyy-MM-dd)
        LocalDateTime ex02 = LocalDateTime.now(); // Mostra da data e a hora (yyyy-MM-dd HH:mm:ss.ms)
        Instant ex03 = Instant.now(); // Mostra data e hora global GMT 0

        System.out.println("ex01 " + ex01);
        System.out.println("ex02 " + ex02);
        System.out.println("ex03 " + ex03);

        // Formatar data e hora para formato ISO 8601:
        System.out.println("DATA FORMATADA");

        LocalDate ex04 = LocalDate.parse("2023-05-04");
        LocalDateTime ex05 = LocalDateTime.parse("2023-05-04T16:26:30");
        Instant ex06 = Instant.parse("2023-05-04T16:26:30Z");
        Instant ex07 = Instant.parse("2023-05-04T16:26:30-03:00");

        System.out.println("ex04 " + ex04);
        System.out.println("ex05 " + ex05);
        System.out.println("ex06 " + ex06);
        System.out.println("ex07 " + ex07);

        // Formatos customizados para ISO
        System.out.println("DATA CUSTOMIZADA");

        DateTimeFormatter fe01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fe02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDate ex08 = LocalDate.parse("04/05/2023", fe01); // Indicar o tipo de data customizada no segundo parametro
        LocalDateTime ex09 = LocalDateTime.parse("04/05/2023 16:48:50", fe02);

        System.out.println("ex08 " + ex08);
        System.out.println("ex09 " + ex09);

        // ISO para formatos customizados
        // Metodo format()

        LocalDate ex10 = LocalDate.parse("2023-05-04");
        LocalDateTime ex11 = LocalDateTime.parse("2023-05-04T16:26:30");

        System.out.println("ex10 " + ex10.format(fe01));
        System.out.println("ex11 " + ex11.format(fe02));
    }
}
