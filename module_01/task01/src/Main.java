import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Текущая дата: " + LocalDateTime.now().toLocalDate());
        System.out.println("Текущая время: " + LocalDateTime.now().toLocalTime());
    }
}
