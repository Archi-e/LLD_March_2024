package projects.tictactoe.models;

import projects.tictactoe.service.botPlayingStrategy.BotPlayingFactory;
import projects.tictactoe.service.botPlayingStrategy.BotPlayingStrategy;
import projects.tictactoe.service.botPlayingStrategy.BotPlayingStrategyName;

public class Bot extends Player{

    BotDifficultyLevel botDifficultyLevel;
    //BotPlayingStrategyName botPlayingStrategyName;

    public Bot(int id, char symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, "BOT", PlayerType.BOT, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
        //this.botPlayingStrategyName = BotPlayingStrategyName.RANDOM;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move makeMove(Board board) {
        return BotPlayingFactory.getBotPlayingStrategy().makeMove(board, this);
    }
}
