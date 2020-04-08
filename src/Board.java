public class Board {

    Position [][] board;

    public Board() {
        this.newBoard();
    }

    public Position getBoard (int x, int y)  {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new IndexOutOfBoundsException();
        }
        System.out.println(board[x][y]);
        return board[x][y];
    }

    public void newBoard () {

        /* BLACK PIECES */

        String black_color = "black";
        int black_x = 0;

        // black rooks
        board[black_x][0] = new Position(black_x, 0, new Rook(black_color));
        board[black_x][7] = new Position(black_x, 7, new Rook(black_color));

        //TODO black knight
        board[black_x][1] = new Position(black_x, 1, new Rook(black_color));
        board[black_x][6] = new Position(black_x, 6, new Rook(black_color));

        //TODO black bishops
        board[black_x][2] = new Position(black_x, 2, new Rook(black_color));
        board[black_x][5] = new Position(black_x, 5, new Rook(black_color));

        //TODO black queen
        board[black_x][3] = new Position(black_x, 3, new Rook(black_color));

        // black king
        board[black_x][4] = new Position(black_x, 4, new King(black_color));

        // black pawns
        for (int y = 0; y < 8; ++y) {
            board[black_x + 1][y] = new Position(black_x + 1, y, new Pawn(black_color));
        }

        /* WHITE PIECES */

        String white_color = "white";
        int white_x = 7;

        // white rooks
        board[white_x][0] = new Position(white_x, 0, new Rook(white_color));
        board[white_x][7] = new Position(white_x, 7, new Rook(white_color));

        //TODO white knight
        board[white_x][1] = new Position(white_x, 1, new Rook(white_color));
        board[white_x][6] = new Position(white_x, 6, new Rook(white_color));

        //TODO white bishops
        board[white_x][2] = new Position(white_x, 2, new Rook(white_color));
        board[white_x][5] = new Position(white_x, 5, new Rook(white_color));

        //TODO white queen
        board[white_x][3] = new Position(white_x, 3, new Rook(white_color));

        // white king
        board[white_x][4] = new Position(white_x, 4, new King(white_color));

        // white pawns
        for (int y = 0; y < 8; ++y) {
            board[white_x - 1][y] = new Position(white_x - 1, y, new Pawn(white_color));
        }

        /* THE REST OF THE BOARD */

        for (int x = 2; x < 6; ++x) {
            for (int y = 0; y < 8; ++y) {
                board[x][y] = new Position(x, y, null);
            }
        }
    }
}
