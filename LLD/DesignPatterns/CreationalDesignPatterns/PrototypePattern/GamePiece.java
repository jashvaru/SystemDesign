package LLD.DesignPatterns.CreationalDesignPatterns.PrototypePattern;

public class GamePiece implements Prototype<GamePiece> {

    private String colour;
    private int pos;

    public GamePiece(String colour, int pos) {
        this.colour = colour;
        this.pos = pos;
    }

    @Override
    public GamePiece cloneClass() {
        return new GamePiece(this.colour, this.pos);
    }

    @Override
    public String toString() {
        return "GamePiece [colour=" + colour + ", pos=" + pos + "]";
    }
}
