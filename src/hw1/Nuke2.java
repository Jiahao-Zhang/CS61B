package hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 
* @author Jiahao Zhang
* @version ：Apr 9, 2018 8:39:42 PM 
* 类说明 
*/
public class Nuke2 {
	public static void main(String[] args){
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		try {
			String string = keyboard.readLine();
			String newString = string.charAt(0)+string.substring(2, string.length());
			System.out.println(newString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
