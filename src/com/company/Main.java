package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the message you want to encrypt: ");
        String message = scanner.nextLine();
        VernamCipher vernamCipher = new VernamCipher();
        String cryptogram = vernamCipher.encrypt(message);
        String decryptedMessage = vernamCipher.decrypt(cryptogram);
    }
}
