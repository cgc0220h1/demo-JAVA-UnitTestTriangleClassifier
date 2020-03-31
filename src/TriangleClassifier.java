public class TriangleClassifier {
    public static String classifyTriangle(int side1, int side2, int side3){
        if (side1 == side2 && side2 == side3) {
            return "tam giác đều";
        } else if (side1 == side2 || side2 == side3) {
            return "tam giác cân";
        } else if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            return "tam giác thường";
        }
        return "không phải là tam giác";
    }
}
