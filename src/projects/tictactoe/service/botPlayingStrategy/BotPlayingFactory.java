package projects.tictactoe.service.botPlayingStrategy;

public class BotPlayingFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotPlayingStrategyName botPlayingStrategyName){
        return switch(botPlayingStrategyName){
            case RANDOM -> new RandomBotPlayingStrategy();
        };
    }
}
