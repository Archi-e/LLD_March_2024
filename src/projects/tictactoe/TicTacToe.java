package projects.tictactoe;

import projects.tictactoe.controller.GameController;
import projects.tictactoe.models.*;
import projects.tictactoe.service.winningstrategy.OrderOneWinningStrategy;
import projects.tictactoe.service.winningstrategy.WinningStrategyName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        Scanner sc = new Scanner(System.in);

        int id = 1;
        List<Player> players = new ArrayList<>();

        System.out.println("Welcome to Tic Tac Toe");

        System.out.println("Enter the dimension of board: ");
        int dimension = sc.nextInt();

        System.out.println("Do you want a BOT as one player? Enter Y / N");
        String ansBot = sc.next();

//        System.out.println("Choose the difficulty level of BOT: EASY / MEDIUM / HARD");
//        String difficultyLevel = sc.next();


        if(ansBot.equalsIgnoreCase("Y")){
            Player bot = new Bot(id++, 'B', BotDifficultyLevel.HARD);
            players.add(bot);
        }

        while(id < dimension){
            System.out.println("Please enter the player name: ");
            String name = sc.next();
            System.out.println("Please enter the player symbol: ");
            char symbol = sc.next().charAt(0);

            Player newPlayer = new Player(id++, name, PlayerType.HUMAN, symbol);
            players.add(newPlayer);
        }

        Collections.shuffle(players);
        Game game = gameController.createGame(dimension, players, WinningStrategyName.ORDERONE);
        int playerIndex = -1;
        while(game.getGameStatus().equals(GameStatus.IN_PROGRESS)){
            System.out.println("Current Board Status: ");
            gameController.displayBoard(game);

            playerIndex++;
            playerIndex = playerIndex % players.size();

            Move movePlayed = gameController.makeMove(players.get(playerIndex), game);
            game.getMoves().add(movePlayed);
            game.getBoardStatus().add(game.getCurrentBoard());

            Player winner = gameController.checkWinner(game, movePlayed);
            if(winner != null){
                System.out.println("WINNER IS: "+ winner.getName());
                break;
            }

        }

        System.out.println("Final Board Status");
        gameController.displayBoard(game);

        System.out.println("Do you want to replay? Y / N");


    }

}
