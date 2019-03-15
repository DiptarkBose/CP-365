import java.io.*;
import java.util.*;

public class HashCode19
{
	public static void main(String[] args) {
        /*
        String data = "I will write this String to File in Java!";
        int noOfLines = 10000;
        writeUsingOutputStream(data);
        System.out.println("DONE");
		*/
		String line = null;
		int[][] nodes = new int[n][];
		int count=-1, z, i;
        try {
            FileReader fileReader = 
                new FileReader("a_example.txt");
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) 
            {
            	if(count!=-1)
            	{
	            	String[] arr =line.split(" ");
	        		nodes[count]= new int[arr.size()-2];
	        		i=0;
	        		for(string s: arr)
	        		{
	        			z=word_to_int_map.get(s);
	        			nodes[count][i]=z;
	        			i++;
	        		}
        		}
            	count++;
                System.out.println(line);
            }   
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file");                
        }
        catch(IOException ex) {
            System.out.println("Unable to open file");                  
        } 
        /*
        int similarity;
        for(Line i: lines)
        {
        	similarity=0;
        	for(Line j: lines)
        	{
        		Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
        		for(Integer color: i)
        			m.put(color, 1);
        		for(Integer color: j)
        			if(m.containSkey(j))
        				similarity++;
        	}
        	System.out.println(similarity);
        }
        */
    }
    private static void writeUsingOutputStream(String data) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(new File("doc.txt"));
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}