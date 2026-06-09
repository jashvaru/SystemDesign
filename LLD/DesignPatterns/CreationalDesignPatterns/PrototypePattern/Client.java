package LLD.DesignPatterns.CreationalDesignPatterns.PrototypePattern;

public class Client {
    
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("red", 1));
        gameBoard.addPiece(new GamePiece("blue", 1));
        gameBoard.showBoadState();

        GameBoard copiedGameBoard = gameBoard.cloneClass();
        copiedGameBoard.addPiece(new GamePiece("white", 2));
        copiedGameBoard.showBoadState();
    }
}
