/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.designpatterns_decorator;

/**
 *
 * @author marti
 */
public class CompressedCloudStream implements Stream{
    
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }
    
    
    
    @Override
    public void write(String data){
        String compressed = compress(data);
        stream.write(compressed);
    }
    
    private String compress(String data){
        return data.substring(0,5);
    }
    
}
