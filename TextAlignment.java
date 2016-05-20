package practice;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextAlignment {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String align = br.readLine();
		int lines = Integer.parseInt(br.readLine());
		String[] str = new String[lines];
		for(int i=0;i<lines;i++){
			str[i] = br.readLine();
		}
		
		if(align.equalsIgnoreCase("LEFT")){
			 for(int i=0;i<str.length;i++){
					 System.out.println(str[i]);
			    }
		}
		else if(align.equalsIgnoreCase("RIGHT")){
		    for(int i=0;i<str.length;i++){
		    	String s = "";
		    	 s = String.format("%" + 49 + "s", str[i]);
				 System.out.println(s);
		    }
		}
		else if(align.equalsIgnoreCase("CENTER")){
			 int width = 49;
			    for(int i=0;i<str.length;i++){
			    	String s = "";
			    	int padSize = width - str[i].length();
				    int padStart = str[i].length() + Math.abs(padSize / 2);
			    	 s = String.format("%" + padStart + "s", str[i]);
					 System.out.println(s);
			    }
		}
		else if(align.equalsIgnoreCase("JUSTIFY")){
			int max = str[0].length();
			 for(int i=0;i<str.length;i++){
			    	 if(max<str[i].length()){
			    		 max = str[i].length();
			    	 }
			    }
			 for(int i=0;i<str.length;i++){
				 int noOfSpacesToAdd = max-str[i].length();				 
				 if(noOfSpacesToAdd != 0){
					 String[] strOutput = str[i].split(" ");
					 StringBuilder sbOutput = new StringBuilder();
					 for(int j=0;j<strOutput.length;j++){
						 sbOutput.append(strOutput[j]);
						 if(j!=strOutput.length-1){
						 sbOutput.append("   ");
						 }
						 
					 }
					 
					 System.out.println(sbOutput.toString());
				 }
				 else{
					 System.out.println(str[i]);
				 }
			 } 
		}
	}
}
