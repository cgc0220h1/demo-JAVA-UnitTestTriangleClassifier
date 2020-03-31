public class TriangleClassifier {

    public static final String EQUILATERAL = "tam giác đều";
    public static final String ISOSCELES = "tam giác cân";
    public static final String NORMAL = "tam giác thường";
    public static final String NOPE = "không phải là tam giác";

    public static String classifyTriangle(int side1, int side2, int side3){
        if (isPositiveSide(side1, side2, side3)) {
            if (isValidTriangle(side1, side2, side3)) {
                if (isAllSideEqual(side1, side2, side3)) {
                    return EQUILATERAL;
                } else if (isTwoSideEqual(side1, side2, side3)) {
                    return ISOSCELES;
                }
                return NORMAL;
            }
        }
        return NOPE;
    }

    private static boolean isTwoSideEqual(int side1, int side2, int side3) {
        return side1 == side2 || side2 == side3;
    }

    private static boolean isAllSideEqual(int side1, int side2, int side3) {
        return side1 == side2 && side2 == side3;
    }

    private static boolean isValidTriangle(int side1, int side2, int side3) {
        return side1 + side2 > side3
                && side2 + side3 > side1
                && side1 + side3 > side2;
    }

    private static boolean isPositiveSide(int side1, int side2, int side3) {
        return side1 > 0 
                && side2 > 0 
                && side3 > 0;
    }
}
