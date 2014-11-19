package com.example.jumar.katas.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int number) {
        final List<Integer> primes = new ArrayList<Integer>();

        for (int candidate = 2; number > 1; candidate++) {
            for (; number % candidate == 0; number /= candidate) {
                primes.add(candidate);
            }
        }

        return primes;
    }


}
