import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Passport ukPassport = new Passport("1234", "UK", LocalDate.of(2025,1,1));
        Passport usPassport = new Passport("3412", "USA", LocalDate.of(2030,4,11));
    }

    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}