package projects.tictactoe.service.winningstrategy;

import projects.tictactoe.models.Board;
import projects.tictactoe.models.Move;
import projects.tictactoe.models.Player;

public interface WinningStrategy {

    public Player checkWinner(Board board, Move lastMovePlayed);
}
