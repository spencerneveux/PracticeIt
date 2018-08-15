public double getSlope() {
    if (p1.x == p2.x) {throw new IllegalStateException();}
    
    double dx = p2.x - p1.x;
    double dy = p2.y - p1.y;
    double slope = dy / dx;
    return slope;
}
