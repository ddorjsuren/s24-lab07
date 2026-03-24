package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    public boolean isValid(int position) {
        return position >= 0 && position < occupied.length;
    }

    public boolean isOccupied(int position) {
        if (!isValidPosition(position)) return false;
        return occupied[position];
    }
}
