import java.util.List;

class Circle { 
    private final Point centre;
    private final double radius;

    Circle(Point p, double radius) {
        centre = p;
        this.radius = radius;
    }

    public String toString() {
        return "circle of radius " + radius + " centered at " + centre;
    }

    int contains(List<Point> points) {
        int discCoverage = 0;
        for (int i = 0; i < points.size(); i++) {
            if (this.centre.distanceTo(points.get(i)) <= this.radius) {
                discCoverage++;
            }
        }
        return discCoverage;
    }
}
