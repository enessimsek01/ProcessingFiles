package com.enes.learningreadfiles;


class MyClass implements AutoCloseable{// burada kendi resource umuzu olusturuyoruz. bu satiri ilk yazdiginda hata alacaksin
    // bu hatayi add unimplement secenegini secerek atliyoruz ve asagida close fonksiyonu olusuyor.

    @Override
    public void close() throws Exception {
        System.out.println("Closing...");

    }

}
public class Application2 {

    public static void main(String[] args) {

        try(MyClass var=new MyClass();) {


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}