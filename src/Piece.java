public abstract class Piece {

    private String color;
    private boolean isKilled = false;

    public Piece(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }

    public abstract boolean canMove(Board board, Position start, Position stop);
}


