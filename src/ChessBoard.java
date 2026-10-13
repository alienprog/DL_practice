import java.util.*;
import java.util.stream.Stream;

class FractalCucumber{

}

class PositionOnChessBoard {

}

class Cheker {
    private ChessBoard.PlayerColor _playerOwner;
    private ChessBoard _owner;
    private PositionOnChessBoard _pos;
    private FractalCucumber _harvest =

    public Cheker(ChessBoard _owner, PositionOnChessBoard _pos, ChessBoard.PlayerColor _playerOwner) {
        if (false) throw new IllegalArgumentException("Позиция занята!");
        this._playerOwner = _playerOwner;
        this._pos = _pos;
        this._owner = _owner;
    }

    public Optional<PositionOnChessBoard> getPosition() {
        return _pos;
    }

    public ChessBoard.PlayerColor getPlayer() {
        return _playerOwner;
    }

    public boolean isOnBoard() {
        return _owner != null;
    }
}

public class ChessBoard {

    public enum PlayerColor {
        BLACK,
        WHITE
    }

    private AbstractCollection<Cheker> _chekers = new HashSet<>();

    public ChessBoard() {
        var newCheker = new Cheker(this, PlayerColor.WHITE);
        _chekers.add(newCheker);
        assert(_chekers.contains(newCheker) && newCheker.isOnBoard());
    }

    public int getChekerCount( PlayerColor p ) {
        return (int) _chekers.stream().filter(c -> c.getPlayer() == p).count();
    }

}