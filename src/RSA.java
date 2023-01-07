/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author evren
 */

import java.util.Random;

public class RSA {

    private static final int KEY_SIZE = 1024;
    private static final Random RANDOM = new Random();

    private int p;
    private int q;
    private int n;
    private int phi;
    private int e;
    private int d;

    public RSA() {
        generateKeys();
    }

    public int getN() {
        return n;
    }

    public int getE() {
        return e;
    }

    public int encrypt(int message) {
        return (int) Math.pow(message, e) % n;
    }


    private void generateKeys() {
        p = generatePrime();
        q = generatePrime();
        n = p * q;
        phi = (p - 1) * (q - 1);
        e = generateE(phi);
        d = generateD(e, phi);
    }

    private int generatePrime() {
        int prime = RANDOM.nextInt(KEY_SIZE) + KEY_SIZE;
        while (!isPrime(prime)) {
            prime++;
        }
        return prime;
    }

    private boolean isPrime(int n) {
        if (n == 2 || n == 3) {
            return true;
        }
        if (n == 1 || n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int generateE(int phi) {
        int e = RANDOM.nextInt(phi - 2) + 2;
        while (gcd(e, phi) != 1) {
            e = RANDOM.nextInt(phi - 2) + 2;
        }
        return e;
    }

    private int generateD(int e, int phi) {
        int d = 1;
        while ((d * e) % phi != 1) {
            d++;
        }
        return d;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
