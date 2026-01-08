package default2;

import java.io.*;



public class Demo28_FileHandling {

	public static void main(String[] args) throws IOException { 
 
		File f = new File("C:\\AStarAgile_2025\\Java\\FileHandling\\Test.txt");//file created
		
		FileReader fw = new FileReader(f);
		
		BufferedReader read = new BufferedReader(fw);
		
        System.out.println(read.readLine()); //file read
        
		read.close();
		
		
	}}
     
		/*/*File f = new File("C:\\AStarAgile_2025\\Java\\FileHandling\\Test.txt");
		
		FileWriter fw = new FileWriter(f);
		
		BufferedWriter writer = new BufferedWriter(fw);
		
		writer.write("First Line write in file");//write in a file
		
		writer.close();/*
	}

}/**/

/*
 * class ReadFile{
 */
	
	/*void main() throws IOException {
		
File f = new File("C:\\AStarAgile_2025\\Java\\FileHandling\\Test.txt");
		
		FileReader fw = new FileReader(f);
		
		BufferedReader read = new BufferedReader(fw);
		
        System.out.println(read.readLine());
        
		read.close();
	}
}/**/

