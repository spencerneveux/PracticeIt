public boolean contains(int x, int y) {
    if ((this.x <= x && x <= this.x + width) && (this.y <= y && y <= this.y + height)) {
        return true;
    }
    return false;
}

public boolean contains(Point p) {
     if ((this.x <= p.x && p.x <= this.x + width) && (this.y <= p.y && p.y <= this.y + height)) {
        return true;
    }
    return false;
}
