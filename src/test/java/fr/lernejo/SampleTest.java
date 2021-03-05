package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    private final Sample sample = new Sample();

    @ParameterizedTest
    @CsvSource({
        "3, 7, 10"
    })

    void add_behaves_as_expected(int a, int b, int expectedResult){
        int result = sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertThat(result).isEqualTo(expectedResult);
    }

}
