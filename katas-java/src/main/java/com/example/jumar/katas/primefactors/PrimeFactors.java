package com.example.jumar.katas.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int number) {
        final List<Integer> primes = new ArrayList<Integer>();
        if (number > 1) {
            primes.add(2);
        }
        return primes;
    }


}
