package board;

public class Piece extends StringP{

    // Char, b if black piece, w if white piece
    public Character color;

    //Piece type, p = pawn, r = rook, k = knight, b = bishop, q = queen, k = king
    public Character piType;

    //need a constructor
    public Piece newPiece(String name){
        Piece p = new Piece();

        Character [] arr = id(name);

        // need something here that gets value name of piece,

        p.color = arr[0];
        p.piType = arr[1];
        return p;
    }

    // constructor
    public Piece(){
    }
}
