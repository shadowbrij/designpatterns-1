package com.codewithmosh.strategy;

public class DESCompression implements ICompressionStrategy {
    @Override
    public void Compress(String input) {
        System.out.println("Compressing using DES");
    }
}
