package pl.sdacademy.powtorka.zadania.klasy.lock;

public class Main {
    public static void main(String[] args) {

       Lock lock = new Lock();
        System.out.println("Aktualnie ustawiona kombinacja zamka: " + lock.getRandomLock());

        System.out.println("Kombinacja zamieniona o 1 _każda cyfra: " + lock.changeA() + lock.changeB() + lock.changeC());

        System.out.println("Czy zamek jest otwarty? (otwarty jeżeli true ) - " + lock.isLockOpen(555));


        }
}
