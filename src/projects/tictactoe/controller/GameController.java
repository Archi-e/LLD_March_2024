package projects.tictactoe.controller;

import projects.tictactoe.models.*;
import projects.tictactoe.service.winningstrategy.WinningStrategy;
import projects.tictactoe.service.winningstrategy.WinningStrategyFactory;
import projects.tictactoe.service.winningstrategy.WinningStrategyName;

import java.util.List;

//this class will contain all the methods that will be required by user
public class GameController {

    public Game createGame(int dimension, List<Player> players, WinningStrategyName winningStrategyName){
        return Game.builder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategy(WinningStrategyFactory.getWinningStrategy(winningStrategyName, dimension))
                .build();
    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }
    public void displayBoard(Game game){
        game.getCurrentBoard().displayBoard();
    }
    public Move makeMove(Player player, Game game){
        return player.makeMove(game.getCurrentBoard());
    }

    public void undoMove(Game game, Move lastMovePlayed){

    }

    public void replay(){

    }

    public Player checkWinner(Game game, Move lastMovePlayed){
        return game.getWinningStrategy().checkWinner(game.getCurrentBoard(), lastMovePlayed);
    }
}
