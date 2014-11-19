package com.example.jumar.katas.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int number) {
        final List<Integer> primes = new ArrayList<Integer>();
        if (number > 1) {
            int candidate = 2;
            while (number > 1) {
                while (number % candidate == 0) {
                    primes.add(candidate);
                    number = number / candidate;
                }
                candidate++;
            }

            if (number > 1) {
                primes.add(number);
            }
        }
        return primes;
    }


}
