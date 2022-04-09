 Circle createUnitCircle(Point p, Point q) {
     Point m = p.midPoint(q);
     double theta = p.angleTo(q);
     double d = Math.sqrt(1
     -(p.distanceTo(m) *
       p.distanceTo(m)));

     return new
     Circle(m.moveTo(theta + Math.PI/2,
     d), 1.0) ;
 }
 
 int findMaxDiscCoverage(List<Point> points) {
     int discCoverage = 0;
     int maxDiscCoverage = 0;
     int numOfPoints = points.size();

     for (int i = 0; i < numOfPoints - 1; i++) {
         for (int j = i + 1; j < numOfPoints; j++) {
             // find coverage with points.get(i) and points.get(j)
             if(points.get(i).distanceTo(points.get(j))<= 2) {
                 discCoverage = createUnitCircle(points.get(i), points.get(j)).contains(points);
                 }
             if(discCoverage > maxDiscCoverage) {
                 maxDiscCoverage = discCoverage;
                 }
         }
     }
     return maxDiscCoverage;
 }

