package com.codewithmosh.strategy;

public class ChatClient {
public void Encrypt(String input,ICompressionStrategy cs){
    cs.Compress(input);
}

}
