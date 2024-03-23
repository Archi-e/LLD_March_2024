package projects.tictactoe.models;

import projects.tictactoe.exceptions.InvalidBotCountException;
import projects.tictactoe.exceptions.InvalidPlayerCountException;
import projects.tictactoe.exceptions.InvalidPlayerSymbolException;
import projects.tictactoe.service.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
    Board currentBoard;
    int noOfSymbol;
    List<Player> players;
    List<Move> moves;
    GameStatus gameStatus;
    List<Board> boardStatus;
    Player currentPlayer;
    WinningStrategy winningStrategy;

    private Game(Board currentBoard, List<Player> players, WinningStrategy winningStrategy) {
        this.currentBoard = currentBoard;
        this.noOfSymbol = players.size();
        this.players = players;
        this.moves = new ArrayList<>();
        this.gameStatus = GameStatus.IN_PROGRESS;
        this.boardStatus = new ArrayList<>();
        this.currentPlayer = null;
        this.winningStrategy = winningStrategy;
    }

    public Board getCurrentBoard() {
        return currentBoard;
    }

    public void setCurrentBoard(Board currentBoard) {
        this.currentBoard = currentBoard;
    }

    public int getNoOfSymbol() {
        return noOfSymbol;
    }

    public void setNoOfSymbol(int noOfSymbol) {
        this.noOfSymbol = noOfSymbol;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public List<Board> getBoardStatus() {
        return boardStatus;
    }

    public void setBoardStatus(List<Board> boardStatus) {
        this.boardStatus = boardStatus;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public WinningStrategy getWinningStrategy() {
        return winningStrategy;
    }

    public void setWinningStrategy(WinningStrategy winningStrategy) {
        this.winningStrategy = winningStrategy;
    }

    public static Builder builder(){
        return new Builder();
    }

    //Using builder design patter as we have a lot of params and that needs validation to create game
    public static class Builder{
        Board currentBoard;
        int noOfSymbol;
        List<Player> players;
        List<Move> moves;
        GameStatus gameStatus;
        List<Board> boardStatus;
        Player currentPlayer;
        WinningStrategy winningStrategy;

        int dimension;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setCurrentBoard(Board currentBoard) {
            this.currentBoard = currentBoard;
            return this;
        }

        public Builder setNoOfSymbol(int noOfSymbol) {
            this.noOfSymbol = noOfSymbol;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setMoves(List<Move> moves) {
            this.moves = moves;
            return this;
        }

        public Builder setGameStatus(GameStatus gameStatus) {
            this.gameStatus = gameStatus;
            return this;
        }

        public Builder setBoardStatus(List<Board> boardStatus) {
            this.boardStatus = boardStatus;
            return this;
        }

        public Builder setCurrentPlayer(Player currentPlayer) {
            this.currentPlayer = currentPlayer;
            return this;
        }

        public Builder setWinningStrategy(WinningStrategy winningStrategy) {
            this.winningStrategy = winningStrategy;
            return this;
        }

        //Adding validate methods
        public void validateNoOfPlayers(){
            if(players.size() >= dimension || players.size() < dimension-2){
                throw new InvalidPlayerCountException("Player count should be N-1 or N-2 as per board size");
            }
        }

        public void validateBotCount(){
            int noOfBots = 0;
            for(Player player: players){
                if(player.getPlayerType().equals(PlayerType.BOT)) noOfBots++;
            }

            if(noOfBots < 0 || noOfBots > 1){
                throw new InvalidBotCountException("Bot count can be 1 at maximum");
            }
        }

        public void validateUniquePlayerSymbols(){
            HashSet<Character> hs = new HashSet<>();
            for(Player player: players){
                hs.add(player.getSymbol());
            }

            if(hs.size() != players.size()){
                throw new InvalidPlayerSymbolException("Each Player must have unique game symbols");
            }
        }

        public void validate(){
            validateNoOfPlayers();
            validateBotCount();
            validateUniquePlayerSymbols();
        }

        //create a build method for Builder Design Pattern that will create the objects
        public Game build(){
            validate();
            return new Game(new Board(dimension), players, winningStrategy);
        }
    }
}
