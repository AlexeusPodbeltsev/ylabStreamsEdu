package homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static homework.ComplexExamples.fuzzySearch;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FuzzySearchTest {

    @ParameterizedTest(name = "{index} - {1} is containing {0}, keeping the sequence")
    @CsvSource(value = {
            "car, ca6$$#_rtwheel",
            "cwhl ,cartwheel",
            "cwhee, cartwheel",
            "cartwheel, cartwheel"
    }, ignoreLeadingAndTrailingWhitespace = true)
    void fuzzySearchReturnTrueTest(String query, String data) {
        assertTrue(fuzzySearch(query, data));
    }

    @ParameterizedTest(name = "{index} - {1} is not containing {0}")
    @CsvSource(value = {
            "cwheeel, cartwheel",
            "lw, cartwheel"
    }, ignoreLeadingAndTrailingWhitespace = true)
    void fuzzySearchReturnFalseTest(String query, String data) {
        assertFalse(fuzzySearch(query, data));
    }
}