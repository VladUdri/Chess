public class Queen extends Piece {

    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Position start, Position stop) {
        return false;
    }

}
