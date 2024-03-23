package projects.tictactoe.service.botPlayingStrategy;

import projects.tictactoe.exceptions.GameOverException;
import projects.tictactoe.models.*;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board, Player bot) {
        List<List<Cell>> matrix = board.getMatrix();
        for(int i=0; i<matrix.size(); i++){
            for(int j=0; j<matrix.size(); j++){
                if(matrix.get(i).get(j).getCellStatus().equals(CellStatus.EMPTY)){
                    board.getMatrix().get(i).get(j).setCellStatus(CellStatus.FILLED);
                    board.getMatrix().get(i).get(j).setPlayer(bot);
                    return new Move(board.getMatrix().get(i).get(j), bot);
                }
            }
        }
        throw new GameOverException("Game over, there is no empty cell to make a move");
    }
}
