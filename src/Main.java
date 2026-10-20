import java.util.*;

// Разбор паттерна "Наблюдатель"
// Клиента создает подписчика
// Итог лекции: Организация связей между сущностями, которые были рассмотрены:
// свойство - односторонняя связь, зависимость - двустороняя, композиция - двустороняя,



interface ChessSubscriber { // role = Subscriber + Client
    void onMoved();
}

class ChessBoard implements ChessSubscriber { // role = Conrete Subscriber

    @Override
    public void onMoved() {
        changePlayer();
    }
    private changePlayer() {
        //......
    }
}

class Chess { // role = Publisher

    private CollectionChessSubscriber> _subscribers = new LinkedList();

    public boolean moveTo(ChessBoardPosition targetPos) {
        // .......
        _subscribers.forEach(s -> s.onMoved());
        return true;
    }
    private Collection<ChessSubscriber> _subscriber = new LinkedList<>();
    public void subscribe(ChessSubscriber chessSubscriber) {

    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}