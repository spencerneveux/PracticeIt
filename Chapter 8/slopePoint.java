public double slope(Point other) {
    if (this.x == other.x) {throw new IllegalArgumentException();}
    
    double dy = other.y - this.y;
    double dx = other.x - this.x;
    return dy / dx;
}
