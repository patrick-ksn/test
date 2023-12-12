package ksn.example;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {

    public static void main(String [] args)
    {
        System.out.println("Stream test");

        List list = Arrays.asList(1,2,3,4,4,5,65,6);


        list.stream().peek(System.out::println).count();


    }

}
