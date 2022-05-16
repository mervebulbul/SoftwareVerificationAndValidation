
public class Triangle {

        public static TriangleType classify(final double angle1, final double angle2, final double angle3){
            if ((angle1 + angle2 + angle3 != 180)) {
                System.out.println("This is an invalid triangle. The sum of the interior angles of a triangle cannot be different from 180. ");
                return TriangleType.INVALID;
            } else if ((angle1 <= 0) || (angle2 <= 0) || (angle3 <= 0) || (angle1 >= 180) || (angle2 >= 180) || (angle3 >= 180)) {
                System.out.println("This is an invalid triangle. Any of the interior angles of a triangle cannot be less than 0 or greater than 180.");
                return TriangleType.INVALID;
            } else {
                if ((angle1 == 90) || (angle2 == 90) || (angle3 == 90)) {
                    System.out.println("This is a right triangle.");
                    return TriangleType.RIGHT;
                } else if ((angle1 > 90) || (angle2 > 90) || (angle3 > 90)) {
                    return TriangleType.OBTUSE;
                } else {
                    return TriangleType.ACUTE;
                }
            }
        }
}

