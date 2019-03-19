package pl.sdacademy.powtorka.zadania.klasy.lock;

public class Main {
    public static void main(String[] args) {

        Lock lock = new Lock();
        System.out.println("Randomowe hasło: " + lock.getRandomLock());
        System.out.println("Pierwsza cyfra podniesiona o 1: " + lock.changeA());
        System.out.println("Druga cyfra podniesiona o 1: " + lock.changeB());
        System.out.println("Trzecia cyfra podniesiona o 1: " + lock.changeC());

        }
}
