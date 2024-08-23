package com.codewithmosh.strategy;

public class AESCompression implements ICompressionStrategy {
    @Override
    public void Compress(String input) {
        System.out.println("Compressting using AES algorithm");
    }
}
