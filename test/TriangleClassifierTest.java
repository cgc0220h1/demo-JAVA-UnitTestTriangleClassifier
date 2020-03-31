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

    @DisplayName("Test with a=2, b=2, c=3")
    @Test
    void classifyTriangleCase2() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 3;
        String expectedResult = "tam giác cân";
        String actualResult = TriangleClassifier.classifyTriangle(side1,side2,side3);
        assertEquals(expectedResult,actualResult);
    }

    @DisplayName("Test with a=3, b=4, c=5")
    @Test
    void classifyTriangleCase3() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        String expectedResult = "tam giác thường";
        String actualResult = TriangleClassifier.classifyTriangle(side1,side2,side3);
        assertEquals(expectedResult,actualResult);
    }

    @DisplayName("Test with a=8, b=2, c=3")
    @Test
    void classifyTriangleCase4() {
        int side1 = 8;
        int side2 = 2;
        int side3 = 3;
        String expectedResult = "không phải là tam giác";
        String actualResult = TriangleClassifier.classifyTriangle(side1,side2,side3);
        assertEquals(expectedResult,actualResult);
    }
}