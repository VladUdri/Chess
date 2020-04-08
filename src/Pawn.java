public class Pawn extends Piece {

    public Pawn (String color) {
        super(color);
    }

    // verify if this is the first move
    private boolean firstMove (Position start) {
        if (this.getColor().equals("white")) {
            if (start.getX() == 6)  return true;
        } else {
            if (start.getX() == 1)  return true;
        }
        return false;
    }

    // verify if the pawn can attack other piece (can move diagonally)
    private boolean canAttack (Position stop) {
        return stop.getPiece().getColor().equals(this.getColor());
    }

    @Override
    public boolean canMove(Board board, Position start, Position stop) {

        //TODO cant go forward if there is a piece on that position

        if (stop.getPiece().getColor().equals(this.getColor())){
            return false;
        }

        int x = Math.abs(start.getX() - stop.getX());
        int y = Math.abs(start.getY() - stop.getY());

        // if x = 1 and y = 1 means the pawn is going diagonally
        if (x == 1 && y == 1) return canAttack(stop);

        if (firstMove(start)) {
            // the pawn is allowed to move 2 spaces
            if (x > 2)  return false;
        } else {
            // the pawn is allowed to move only 1 space
            if(x > 1)   return false;
        }
        return true;
    }
}
