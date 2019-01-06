package board;


import org.json.simple.JSONArray;




public class Board extends StringP{


    public Square[][] fillBoard(JSONArray rowArr){
        Square[][] chessB = new Square[8][8];

        //now iterate through rowArr and make each row its own json object
        for (int i = 0; i < 8; i++){
            String row = rowArr.get(i).toString();
            String [] piArr = SqArr(row);
            for (int j = 0; j < 8; j++){
                Square s = new Square();
                s.fillSquare(piArr[j]);
                chessB[i][j] = s;
            }
        }
        return chessB;
    }


    public Board(JSONArray arr){
        this.fillBoard(arr);
    }
}
