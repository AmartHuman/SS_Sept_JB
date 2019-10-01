package com.ss.daythree;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class DayThree {
	
	public static void main(String[] args) throws IOException {
		
		
		System.out.println("1)");
		Files.list(new File("./resources").toPath()).limit(10).forEach(d -> {
			System.out.print(d);
			System.out.println();
		});
		
		System.out.println("\n\n");
		
		
		System.out.println("2)");
		System.out.println("More Text has been added to addwords file");
		Files.write(Paths.get("./resources/addwords"), " More Text".getBytes(), StandardOpenOption.APPEND);
		
		
		System.out.println("\n\n");
		
		
		
		
		
		System.out.println("3)");
		String holdLine = " ";
		String line = " ";
		int countE = 0;
		BufferedReader bufferRead = new BufferedReader(new FileReader("./resources/test"));
		
		while((holdLine = bufferRead.readLine())!=null) {
			String token[] = holdLine.split(" ");
			for(int x = 0;x<holdLine.length();x++) {
				if(holdLine.charAt(x)=='e') {
					countE++;
				}
			}
		}
		
		
	
		bufferRead.close();
		
		String addText = "MORE";
		System.out.println("There are " + countE +" e's in the file");
		
		
		
		
		
		
		
	}

}
