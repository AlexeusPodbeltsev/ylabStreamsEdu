package homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static homework.ComplexExamples.fuzzySearch;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FuzzySearchTest {

    @ParameterizedTest(name = "{index} - \"{1}\" is containing \"{0}\", keeping the sequence")
    @CsvSource(value = {
            "car, ca6$$#_rtwheel",
            "cwhl ,cartwheel",
            "cwhee, cartwheel",
            "cartwheel, cartwheel"
    }, ignoreLeadingAndTrailingWhitespace = true)
    void fuzzySearchReturnTrueTest(String query, String data) {
        assertTrue(fuzzySearch(query, data));
    }

    @ParameterizedTest(name = "{index} - \"{1}\" is not containing \"{0}\"")
    @CsvSource(value = {
            "cwheeel, cartwheel",
            "lw, cartwheel"
    }, ignoreLeadingAndTrailingWhitespace = true)
    void fuzzySearchReturnFalseTest(String query, String data) {
        assertFalse(fuzzySearch(query, data));
    }

    @ParameterizedTest(name = "{index} - the input has null value: query = {0}, data = {1}")
    @MethodSource("providedStringsAndNullsValues")
    void fuzzySearch_WithNullGiven_ShouldReturnFalseTest(String query, String data) {
        assertFalse(fuzzySearch(query, data));
    }

    private static Stream<Arguments> providedStringsAndNullsValues() {
        return Stream.of(
                Arguments.of("car", null),
                Arguments.of(null, "ca6$$#_rtwheel"),
                Arguments.of(null, null)
        );
    }
}