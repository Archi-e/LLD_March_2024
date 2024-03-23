package projects.tictactoe.service.winningstrategy;

import projects.tictactoe.models.Board;
import projects.tictactoe.models.Move;
import projects.tictactoe.models.Player;

public class OrderNSquareWinningStrategy implements WinningStrategy{
    public OrderNSquareWinningStrategy(int dimension) {
    }

    @Override
    public Player checkWinner(Board board, Move lastMovePlayed) {
        return null;
    }
}
