package projects.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int dimension;
    List<List<Cell>> matrix;

    /*
     [                   //outer list
        [_ _ _],         //inner list
        [_ _ _],         //inner list
        [_ _ _],         //inner list
     ]
    */

    public Board(int dimension){
        this.dimension = dimension;
        matrix = new ArrayList<>(); //outer list

        for(int i=0; i<dimension; i++){
            matrix.add(new ArrayList<>());
            for(int j=0; j<dimension; j++){
                matrix.get(i).add(new Cell(i, j));
            }
        }
    }
    public void displayBoard(){
        for(int i=0; i<dimension; i++){
            List<Cell> cells = matrix.get(i);
            for(Cell cell: cells){
                cell.displayCell();
            }
            //to print next array list in next line
            System.out.println();
        }
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<List<Cell>> getMatrix() {
        return matrix;
    }

    public void setMatrix(List<List<Cell>> matrix) {
        this.matrix = matrix;
    }
}
