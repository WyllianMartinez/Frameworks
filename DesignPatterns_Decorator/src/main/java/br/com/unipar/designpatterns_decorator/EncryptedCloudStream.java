/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns_decorator;

/**
 *
 * @author marti
 */
public class EncryptedCloudStream  implements Stream{
    
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }
    
    
    
    @Override
    public void write(String data ){
        String encrypt = encrypt(data);
        
        stream.write(encrypt);
        
    }

    private String encrypt(String data) {
        return "###$$%¨¨&&&*(((())))))";
    }
    
}
