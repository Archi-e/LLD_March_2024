package projects.tictactoe.service.winningstrategy;

public class WinningStrategyFactory {
    public static WinningStrategy getWinningStrategy(WinningStrategyName winningStrategyName, int dimension){
        return switch(winningStrategyName){
            case ORDERONE -> new OrderOneWinningStrategy(dimension);
            case ORDERN ->  new OrderNWinningStrategy(dimension);
            case ORDERNSQUARE -> new OrderNSquareWinningStrategy(dimension);
            default -> null;
        };


    }
}
