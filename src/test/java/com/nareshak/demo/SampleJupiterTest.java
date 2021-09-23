package com.nareshak.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SampleJupiterTest {

    @Test
    @DisplayName("This test should pass if project is setup properly")
    public void thisTestShouldPassIfProjectIsSetupProperly() {
        assertThat(true).isTrue();
    }

    @Test
    public void testListAssertion() {
        final List<Integer> integers = List.of(1, 2, 3);

        final List<Integer> result = List.of(2, 2, 6);

        //Assertions.assertEquals(List.of(2,4,6), result);
        assertThat(result).isEqualTo(List.of(2, 4, 6));
    }

    @Test
    public void listShouldContainTheExpectedElement() {
        assertThat(List.of(2, 4, 6)).contains(2, 10);
    }
}
