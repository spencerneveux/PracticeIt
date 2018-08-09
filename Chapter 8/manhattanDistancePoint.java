public int manhattanDistance(Point other) {
    int dx = Math.abs(this.x - other.x);
    int dy = Math.abs(this.y - other.y);
    int sum = dx + dy;
    return sum;
}
