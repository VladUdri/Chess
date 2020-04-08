public class King extends Piece {

    public King(String color) {
        super(color);
    }

    @Override
    public boolean canMove(Board board, Position start, Position stop){

        if (stop.getPiece().getColor().equals(this.getColor())){
            return false;
        }

        int x = Math.abs(start.getX() - stop.getX());
        int y = Math.abs(start.getY() - stop.getY());

        if (x + y != 1) {
            return false;
        }
        return true;
    }
}

