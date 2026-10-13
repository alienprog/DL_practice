// Code for Brothers
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Stream;

class Cheker {
    private ChessBoard.PlayerColor _playerOwner;
    private ChessBoard _owner;

    public Cheker(ChessBoard _owner, ChessBoard.PlayerColor _playerOwner) {
        this._playerOwner = _playerOwner;
        this._owner = _owner;
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
        var newCheker = new Cheker(this,PlayerColor.WHITE);
        _chekers.add(newCheker);
        assert(_chekers.contains(newCheker) && newCheker.isOnBoard());
    }
    public int getChekerCount( PlayerColor p ) {
        return (int) _chekers.stream().filter(c -> c.getPlayer() == p).count();
    }

}
