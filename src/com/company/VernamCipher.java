package com.company;

import java.util.Random;

public class VernamCipher {
    private char[] key;
    private final Random random;
    public VernamCipher(){
        random = new Random();
    }

    public String encrypt(String message){
        char[] message1 = message.toCharArray();
        key = new char[message1.length];
        char[] cryptogram = new char[message1.length];
        for(int i = 0; i < message1.length; i++){
            key[i] = (char) random.nextInt(Character.MAX_VALUE);
            cryptogram[i] = (char) (message1[i] ^ key[i]);
        }
        System.out.println("Message: "+ String.valueOf(message));
        System.out.println("Key: "+ String.valueOf(key));
        System.out.println("Cryptogram: "+ String.valueOf(cryptogram));
        return String.valueOf(cryptogram);
    }

    public String decrypt(String cryptogram){
        char[] cryptogramAr = cryptogram.toCharArray();
        char[] decryptedMessage = new char[cryptogramAr.length];
        for (int i=0; i<cryptogramAr.length; i++){
            decryptedMessage[i] = (char) (cryptogramAr[i]^key[i]);
        }
        System.out.println("Decrypted message: "+String.valueOf(decryptedMessage));
        return String.valueOf(decryptedMessage);
    }
}
