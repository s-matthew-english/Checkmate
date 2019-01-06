package board;

public class Square extends Piece {

    // true the square is empty, false if
    public boolean empty;

    public Piece piece;


    //fill square based on key - val object
    public Square fillSquare(String name){
        Square s = new Square();
        if (name == "Empty") {
            s.empty = true;
            s.piece = null;
            return s;
        }else{
            s.empty = false;
            s.piece = newPiece(name);
            return s;
        }
    }


    // constructor
    public Square(){
        this.empty = true;
        this.piece = null;
    }

}