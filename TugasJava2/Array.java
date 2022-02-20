package Array;
import java.util.*; // Digunakan pada pembuatan Scanner

/**
* <h1>Array</h1>
* Buka Tutup Jalan program implements an application that
* .....
* .....
* <p>
* @author:  Ghessa Theniana
* <p>
* @version:  1.0
* <p>
* @since 2022-02-20
*/

public class Array{
public static void main(String[] args){
	
//One Dimensional Arrays
int[] fisrtArray = {2, 5, 3};
int[] secondArray = {9, 5, 3};
int[] thirdArray = {2, 4, 9};
int[] fourthArray = {10, 11, 12};
int[] fifthArray = {13, 14, 15};
int[] sixthArray = {16, 17, 18};
int[] seventhArray = {19, 20, 21};
int[] eighthArray = {22, 23, 24};
int[] ninthArray = {25, 26, 27};

//Two Dimensional Arrays
int[][] twoDimensionalArray1 = {fisrtArray, secondArray, thirdArray};
int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};

//Three Dimensional Array
int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};

//printing Element of Three Dimensional Array with nested-for looping
for(int i=0; i<threeDimensionalArray.length; i++){
    System.out.print("{");
    for(int j=0; j<threeDimensionalArray[i].length; j++){
        System.out.print("{");
        for(int k=0; k<threeDimensionalArray[i][j].length; k++){
            System.out.print(threeDimensionalArray[i][j][k] + " ");
        }
        System.out.print("} ");
    }
    System.out.print("} ");
    System.out.println();
}
}
}
