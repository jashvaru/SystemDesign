package LLD.DesignPatterns.CreationalDesignPatterns.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard> {
    
    private List<GamePiece> pieces;

    public GameBoard() {
        this.pieces = new ArrayList<>();
    }

    public void addPiece(GamePiece piece) {
        pieces.add(piece);
    }

    public void showBoadState() {
        for (GamePiece gamePiece : pieces) {
            System.out.println(gamePiece);
        }
    }

    @Override
    public GameBoard cloneClass() {
        GameBoard newGameBoard = new GameBoard();
        for (GamePiece gamePiece : pieces) {
            newGameBoard.addPiece(gamePiece.cloneClass());
        }
        return newGameBoard;
    }

}
