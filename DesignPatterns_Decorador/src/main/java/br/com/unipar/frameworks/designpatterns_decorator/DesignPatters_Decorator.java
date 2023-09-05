package br.com.unipar.frameworks.designpatterns_decorator;

public class DesignPatters_Decorator {

    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream (
                new CompressedCloudStream(
                        new CloudStream())));

    }

    public static void storeCreditCard(Stream stream) {
        stream.write("123-123-123-123");
    }

}