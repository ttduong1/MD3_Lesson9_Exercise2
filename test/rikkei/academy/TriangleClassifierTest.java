package rikkei.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    public void classifyTriangleEquilateral() {
        String expected = "Tam giác đều";
        String result = TriangleClassifier.classifyTriangle(2,2,2);
        assertEquals(expected, result);
    }
    @Test
    public void classifyTriangleIsosceles() {
        String expected = "Tam giác cân";
        String result = TriangleClassifier.classifyTriangle(2,2,3);
        assertEquals(expected, result);
    }
    @Test
    public void classifyTriangleNormal() {
        String expected = "Tam giác thường";
        String result = TriangleClassifier.classifyTriangle(3,4,5);
        assertEquals(expected, result);
    }
    @Test
    public void classifyNotATringle() {
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.classifyTriangle(8,2,3);
        assertEquals(expected, result);
    }
    @Test
    public void classifyNotATringle2() {
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.classifyTriangle(-1,2,1);
        assertEquals(expected, result);
    }@Test
    public void classifyNotATringle3() {
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.classifyTriangle(0,1,1);
        assertEquals(expected, result);
    }
}