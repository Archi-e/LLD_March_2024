package projects.tictactoe.service.winningstrategy;

import projects.tictactoe.models.Board;
import projects.tictactoe.models.Move;
import projects.tictactoe.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneWinningStrategy implements WinningStrategy{
    int dimension;
    List<HashMap<Character, Integer>> rowHashMapList;
    List<HashMap<Character, Integer>> colHashMapList;
    HashMap<Character, Integer> leftDiagHashMap;
    HashMap<Character, Integer> rightDiagHashMap;
    HashMap<Character, Integer> cornerHashMap;

    public OrderOneWinningStrategy(int dimension) {
        this.dimension = dimension;
        this.rowHashMapList = new ArrayList<>();
        this.colHashMapList = new ArrayList<>();
        this.leftDiagHashMap = new HashMap<>();
        this.rightDiagHashMap = new HashMap<>();
        this.cornerHashMap = new HashMap<>();

        for(int i=0; i<dimension; i++){
            rowHashMapList.add(new HashMap<>());
            colHashMapList.add(new HashMap<>());
        }
    }

    @Override
    public Player checkWinner(Board board, Move lastMovePlayed) {
        int row = lastMovePlayed.getCell().getRow();
        int col = lastMovePlayed.getCell().getCol();

        Player player = lastMovePlayed.getPlayer();
        char symbol = player.getSymbol();


        boolean winner = (checkCorner(row, col) && checkAndUpdateCornerHashMap(symbol))
                || (checkLeftDiag(row, col) && checkAndUpdateForLeftDiagHashMap(symbol))
                || (checkRightDiag(row, col) && checkAndUpdateForRightDiagHashMap(symbol))
                || (checkAndUpdateForColHashMap(col, symbol))
                || (checkAndUpdateForRowHashMap(row, symbol));

        if(winner){
            return player;
        }
        return null;
    }

    public boolean checkCorner(int row, int col){
        return (row == 0 && col == 0)
                || (row == 0 && col == dimension-1)
                || (row == dimension-1 && col == 0)
                || (row == dimension-1 && col == dimension-1);
    }

    public boolean checkLeftDiag(int row, int col){
        return (row == col);
    }

    public boolean checkRightDiag(int row, int col){
        return (row + col) == dimension-1;
    }

    public boolean checkAndUpdateForRowHashMap(int row, Character symbol){
        HashMap<Character, Integer> rowHashMap = rowHashMapList.get(row);
        if(rowHashMap.containsKey(symbol)){
            rowHashMap.put(symbol, rowHashMap.get(symbol)+1);
            return (rowHashMap.get(symbol) == dimension);
        }
        else{
            rowHashMap.put(symbol, 1);
        }
        return false;
    }

    public boolean checkAndUpdateForColHashMap(int col, Character symbol){
        HashMap<Character, Integer> colHashMap = rowHashMapList.get(col);
        if(colHashMap.containsKey(symbol)){
            colHashMap.put(symbol, colHashMap.get(symbol)+1);
            return (colHashMap.get(symbol) == dimension);
        }
        else{
            colHashMap.put(symbol, 1);
        }
        return false;
    }

    public boolean checkAndUpdateForLeftDiagHashMap(Character symbol){

        if(leftDiagHashMap.containsKey(symbol)){
            leftDiagHashMap.put(symbol, leftDiagHashMap.get(symbol)+1);
            return (leftDiagHashMap.get(symbol) == dimension);
        }
        else{
            leftDiagHashMap.put(symbol, 1);
        }
        return false;
    }

    public boolean checkAndUpdateForRightDiagHashMap(Character symbol){

        if(rightDiagHashMap.containsKey(symbol)){
            rightDiagHashMap.put(symbol, rightDiagHashMap.get(symbol)+1);
            return (rightDiagHashMap.get(symbol) == dimension);
        }
        else{
            rightDiagHashMap.put(symbol, 1);
        }
        return false;
    }

    public boolean checkAndUpdateCornerHashMap(Character symbol){
        if(cornerHashMap.containsKey(symbol)){
            cornerHashMap.put(symbol, cornerHashMap.get(symbol)+1);
            return (cornerHashMap.get(symbol) == 4);
        }
        else{
            cornerHashMap.put(symbol, 1);
        }
        return false;
    }






}
