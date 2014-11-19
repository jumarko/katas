package com.example.jumar.katas.primefactors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.Collections;

public class PrimeFactorsTest {

    @Test
    public void one() {
        assertThat(PrimeFactors.generate(1), is(Collections.<Integer>emptyList()));

    }

}