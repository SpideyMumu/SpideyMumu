class Point {
    private final double x;
    private final double y;
    
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "point (" + String.format("%.3f", this.x) + ", " +  
            String.format("%.3f", this.y) + ")";
    }

    Point midPoint(Point q) {
        return new Point((this.x + q.x) / 2, (this.y + q.y) / 2);
    }

    double angleTo(Point q) {
        double dx = q.x - this.x;
        double dy = q.y - this.y;
        return Math.atan2(dy,dx);
    }

    Point moveTo(double theta, double d) {
        double x1 = this.x + d * Math.cos(theta);
        double y1 = this.y + d * Math.sin(theta);
 
        return new Point(x1, y1);
    }

    double distanceTo(Point m) {
        double dx = this.x - m.x;
        double dy = this.y - m.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
