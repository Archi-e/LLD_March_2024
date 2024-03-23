package projects.tictactoe.service.botPlayingStrategy;

import projects.tictactoe.models.Board;
import projects.tictactoe.models.Move;
import projects.tictactoe.models.Player;

public interface BotPlayingStrategy {

    public Move makeMove(Board board, Player player);
}
