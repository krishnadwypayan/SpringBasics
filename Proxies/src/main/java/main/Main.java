package main;

/**
 * Created by Krishna Kota on 06/06/21
 */
public class Main {
    public static void main(String[] args) {
        Person proxy = (Person) TimeStampProxy.getProxyFor(new PersonImpl());
        proxy.greet();
    }
}
