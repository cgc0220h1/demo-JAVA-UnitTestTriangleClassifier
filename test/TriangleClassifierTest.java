import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @DisplayName("Test with a=2, b=2, c=2")
    @Test
    void classifyTriangleCase1() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;
        String expectedResult = "tam giác đều";
        String actualResult = TriangleClassifier.classifyTriangle(side1,side2,side3);
        assertEquals(expectedResult,actualResult);
    }
}