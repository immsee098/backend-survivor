package com.hsy.api.rest.demo;

import org.junit.jupiter.api.*;

import java.text.*;

import static org.assertj.core.api.Assertions.*;

public class NewtonMethodTest {
    private NewtonMethod sut;
    private static final DecimalFormat decimalFormat = new DecimalFormat("0.######");

    @BeforeEach
    void setUp() {
        sut = new NewtonMethod();
    }

    @Test
    @DisplayName("제곱근과 비슷한 값인지 확인하는 goodEnough 메서드를 테스트")
    void goodEnough() {

        assertThat(decimalFormat.format(sut.improve(1, 2))).isEqualTo("1.5");
        assertThat(decimalFormat.format(sut.improve(1.5, 2))).isEqualTo("1.4166");
        assertThat(decimalFormat.format(sut.improve(1.4166, 2))).isEqualTo("1.4142");
    }

    @Test
    void sqrtIter() {
        DecimalFormat decimalFormat = new DecimalFormat("0.######");
        assertThat(decimalFormat.format(sut.sqrtIter(1, 2))).isEqualTo("1.414216");
        assertThat(decimalFormat.format(sut.sqrtIter(1, 3))).isEqualTo("1.732143");
        assertThat(decimalFormat.format(sut.sqrtIter(1, 4))).isEqualTo("2");
    }

    @Test
    void sqrt() {
        DecimalFormat decimalFormat = new DecimalFormat("0.######");
        assertThat(decimalFormat.format(sut.sqrt(2))).isEqualTo("1.414216");
        assertThat(decimalFormat.format(sut.sqrt(3))).isEqualTo("1.732143");
        assertThat(decimalFormat.format(sut.sqrt(4))).isEqualTo("2");
    }
}
