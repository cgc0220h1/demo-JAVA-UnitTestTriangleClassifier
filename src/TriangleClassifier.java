public class TriangleClassifier {
    public static String classifyTriangle(int side1, int side2, int side3){
        if (side1 == side2 && side2 == side3) {
            return "tam giác đều";
        }
        return "tam giác cân";
    }
}
