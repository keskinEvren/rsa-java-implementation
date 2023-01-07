/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author evren
 */
public class TestRSA {

    public static void main(String[] args) {
        RSA rsa = new RSA();
        int message = 33;
        int encryptedMessage = rsa.encrypt(message);

        System.out.println("Original message: " + message);
        System.out.println("Encrypted message: " + encryptedMessage);
    }
}
