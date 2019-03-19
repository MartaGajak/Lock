package pl.sdacademy.powtorka.zadania.klasy.lock;

import java.util.Random;

public class Lock {

    private int a;
    private int b;
    private int c;

    public Lock() {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public int getRandomLock() {
        final Random random = new Random();
        this.a = random.nextInt(10);
        this.b = random.nextInt(10);
        this.c = random.nextInt(10);
        return a; // jak zwrocic 3 cyfrowe haslo ? 
    }

    public int changeA () {
        if (this.a == 9) {
            this.a = 0;
        } else {
            this.a ++;
        }
    return this.a;
    }

    public int changeB () {
        if (this.b== 9) {
            this.b = 0;
        } else {
            this.b ++;
        }
        return this.b;
    }

    public int changeC () {
        if (this.c == 9) {
            this.c = 0;
        } else {
            this.c ++;
        }
        return this.c;
    }
}