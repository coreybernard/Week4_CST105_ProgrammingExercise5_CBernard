import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Program: 2 Dimensional Array Program
 * 
 * File: Exercise5.java
 * 
 * Summary: Read text from a file and place the characters in a 20 X 45 2D array in row major order. 
 * 			Then display the characters in column major order. 
 * 
 * Author: Corey Bernard
 * 
 * Date: June 25, 2017
 * 
 **/

public class Exercise5 {
	public static void main(String[] args) {
		//Create variables
		String entireText = "";
		char[][] textArray;
		//try-catch for reading from a file
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\corey\\Workspace\\Exercise 5\\src\\text.txt"));
			
			String readLine = "";
	
			while((readLine = br.readLine()) != null){
				entireText += readLine;
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//call method to create an array
		textArray = fillArray(entireText);
		
		//print the array in column order
		arrayOutput(textArray);
	}
	
	//Method for reading the array in column order and printing it to the screen
	private static void arrayOutput(char[][] textArray) {
		StringBuilder outputText = new StringBuilder();
		
		for (int i = 0; i < 45; i++){
			for (int j = 0; j < 20; j++){
				char temp = textArray[j][i];
				outputText.append(temp);
			}
		}
		
		System.out.println(outputText);
		
	}
	
	//Method for creating an array by filling in row order
	public static char[][] fillArray(String entireText){
		char[][] textArray = new char[20][45];
		int count = 0;
		
		for (int i = 0; i < 20; i++){
			for (int j = 0; j < 45; j++){
				if (count < entireText.length()){
					textArray[i][j] = entireText.charAt(count);
					count++;
				}else{
					textArray[i][j] = '@';
				}
				
			}
		}
		
		return textArray;
		
	}
	
	
	
	
}



























