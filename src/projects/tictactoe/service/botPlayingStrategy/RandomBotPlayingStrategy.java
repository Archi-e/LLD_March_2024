package projects.tictactoe.service.botPlayingStrategy;

import projects.tictactoe.exceptions.GameOverException;
import projects.tictactoe.models.*;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board, Player bot) {
        for(int i=0; i<board.getDimension(); i++){
            for(int j=0; j<board.getDimension(); j++){
                Cell playedCell = board.getMatrix().get(i).get(j);
                if(playedCell.getCellStatus().equals(CellStatus.EMPTY)){
                    playedCell.setCellStatus(CellStatus.FILLED);
                    playedCell.setPlayer(bot);
                    return new Move(playedCell, bot);
                }
            }
        }
        throw new GameOverException("Game over, there is no empty cell to make a move");
    }
}
