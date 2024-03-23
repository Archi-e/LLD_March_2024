package projects.tictactoe.service.winningstrategy;

import projects.tictactoe.models.Board;
import projects.tictactoe.models.Move;
import projects.tictactoe.models.Player;

public class OrderNWinningStrategy implements WinningStrategy{
    public OrderNWinningStrategy(int dimension) {
    }

    @Override
    public Player checkWinner(Board board, Move lastMovePlayed) {
        return null;
    }
}
