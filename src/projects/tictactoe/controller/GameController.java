package projects.tictactoe.controller;

import projects.tictactoe.models.*;
import projects.tictactoe.service.WinningStrategy;

import java.util.List;

//this class will contain all the methods that will be required by user
public class GameController {

    public Game createGame(int dimension, List<Player> players, WinningStrategy winningStrategy){
        return Game.builder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategy(winningStrategy)
                .build();
    }

    public GameStatus getGameStaus(Game game){
        return game.getGameStatus();
    }
    public void displayBoard(Game game){
        game.getCurrentBoard().displayBoard();
    }
    public void makeMove(Player player, Game game){
        player.makeMove(game.getCurrentBoard());
    }

    public void undoMove(Game game, Move lastMovePlayed){

    }

    public void replay(){

    }

    public Player checkWinner(WinningStrategy winningStrategy){
        return null;
    }
}
