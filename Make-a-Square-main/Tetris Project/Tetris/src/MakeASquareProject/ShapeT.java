/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MakeASquareProject;

/**
 *
 * @author RMDN
 */
import java.util.*;
public class ShapeT extends Shape{
    ArrayList <ArrayList<Pair>> positionCombinations = new ArrayList<>();

    public ShapeT(){
        generateCombinations();
    }

    // generateCombinations, calculates all the valid positions for Shape T.
    @Override
    void generateCombinations() {
        ArrayList <Pair> tempArray = new ArrayList<>();
        boolean inBounds;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // To generate first rotation of T;
                inBounds = Shape.checkBounds(i, j) &&
                        Shape.checkBounds(i, j+1) &&
                        Shape.checkBounds(i, j+2) &&
                        Shape.checkBounds(i+1, j+1);
                if(inBounds) {
                    tempArray = new ArrayList<>();
                    tempArray.add(new Pair(i, j));
                    tempArray.add(new Pair(i, j+1));
                    tempArray.add(new Pair(i, j+2));
                    tempArray.add(new Pair(i+1, j+1));
                    positionCombinations.add(tempArray);
                }

                // To generate second rotation of T;
                inBounds = Shape.checkBounds(i, j) &&
                        Shape.checkBounds(i, j-1) &&
                        Shape.checkBounds(i, j+1) &&
                        Shape.checkBounds(i-1, j);
                if(inBounds) {
                    tempArray = new ArrayList<>();
                    tempArray.add(new Pair(i, j));
                    tempArray.add(new Pair(i, j-1));
                    tempArray.add(new Pair(i, j+1));
                    tempArray.add(new Pair(i-1, j));
                    positionCombinations.add(tempArray);
                }

                // To generate third rotation of T;
                inBounds = Shape.checkBounds(i, j) &&
                        Shape.checkBounds(i+1, j) &&
                        Shape.checkBounds(i+2, j) &&
                        Shape.checkBounds(i+1, j+1);
                if(inBounds) {
                    tempArray = new ArrayList<>();
                    tempArray.add(new Pair(i, j));
                    tempArray.add(new Pair(i+1, j));
                    tempArray.add(new Pair(i+2, j));
                    tempArray.add(new Pair(i+1, j+1));
                    positionCombinations.add(tempArray);
                }

                // To generate forth rotation of T;
                inBounds = Shape.checkBounds(i, j) &&
                        Shape.checkBounds(i+1, j) &&
                        Shape.checkBounds(i+1, j-1) &&
                        Shape.checkBounds(i+2, j);
                if(inBounds) {
                    tempArray = new ArrayList<>();
                    tempArray.add(new Pair(i, j));
                    tempArray.add(new Pair(i+1, j));
                    tempArray.add(new Pair(i+1, j-1));
                    tempArray.add(new Pair(i+2, j));
                    positionCombinations.add(tempArray);
                }
            }
        }
    }
    public void printCombinations (){
        System.out.println(positionCombinations.size());
        for (ArrayList<Pair> positionCombination : positionCombinations) {
            for (Pair pair : positionCombination) {
                int x = pair.x;
                int y = pair.y;
                System.out.println(x + " " + y);
            }
            System.out.println();
        }
    }
}

