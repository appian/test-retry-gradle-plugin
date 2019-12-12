package org.gradle.testretry.sample;

import org.junit.jupiter.api.Test;

import static org.gradle.testretry.sample.FlakyAssert.flakyAssert;
import static org.junit.jupiter.api.Assertions.fail;

class SamplesTests {
    @Test
    void successful() {
    }

    @Test
    void flaky() {
        flakyAssert();
    }
}
