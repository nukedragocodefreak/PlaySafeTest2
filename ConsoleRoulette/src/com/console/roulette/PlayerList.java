package com.console.roulette;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class PlayerList {
	
	public void readFileIntoList(String file) {
		
	    List<String> lines = Collections.emptyList();
	    try {
	      lines = Files.readAllLines(Paths.get(file), StandardCharsets.UTF_8);
	    } 
	    catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    //return lines;
	    System.out.println(lines.forEach(t -> System.out.println(t)));
	    
	  }

}
