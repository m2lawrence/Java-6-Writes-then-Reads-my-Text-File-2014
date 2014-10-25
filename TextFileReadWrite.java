//Michael Lawrence BSc (HONS) how to write a text file & read it in Java 6 and using some maths.
import java.io.*;
import static java.lang.System.*;

class TextFileReadWrite {
    public static void main (String[] args) {
        try{
            FileReader fr = new FileReader("manipulate-data.txt");
            //filereader Object, with the file name.
            BufferedReader br = new BufferedReader(fr);
            //bufferedReader object which is the thing that actually does the reading from the filereader Object.
            
            String str; //Here I have a string.
            while ((str = br.readLine()) != null) //Here it reads a line at a time.
            {
                out.println(str + "\n");  //Here it prints out the string with a new line after each part.
            }
            
            br.close();  //Here I close the file reader.
        } catch (IOException e) {
            out.println("File not found Mike!");  //My error handling to prevent my programming from crashing.
        }
        
        try{
            FileWriter fw = new FileWriter("manipulate-data.txt");
            //fileWriter Object, with the file name.
            PrintWriter pw = new PrintWriter(fw);
            //bufferedWriter object which is the thing that actually does the writing to the fileWriter Object.
            
            pw.println("* Michael Lawrence BSc (HONS) *");
            pw.println();
            pw.println("Full Name, Sex, Age, D.O.B");
            pw.println("Bill Johnson, male, 29, 16/03/1977");
            pw.println("Tom Soyer, male, 29, 15/04/1977");
            pw.println("Sav Purell, male, 27, 22/09/1978");
            pw.println("Liam Bolt, male, 26, 22/02/1980");
            pw.println("Suzie Long, female, 24, 17/08/1981");
            pw.println("Tom Soyer, male, 29, 15/04/1977");
            pw.println();
            //------------------------------------
            int Males = 5;
            int Females = 1;
            int TotalPeople = 6;
            
            int TotalMales = (TotalPeople - Females);
            pw.print("1. The amount of Males are: ");
            pw.println(TotalMales);
            //------------------------------------
            pw.print("2. Average age in years = ");
            int a = 29+29+27+26+24+29;
            pw.println(a/6);
            //------------------------------------
            
            int Jan = 31;
            int Feb = 28;
            int Mar = 31;
            
            
            int BillJohnson16031977 = Jan + Feb + 16;
            int TomSoyer15041977 = Jan + Feb + Mar + 15;
            int DaysOlder = (TomSoyer15041977 - BillJohnson16031977);
            
            pw.print("3. How many days older is Bill Johnson than Tom Soyer? ");
            pw.println(DaysOlder);
            
            
            
            
            
            pw.close();  //Here I close the file writer.
        } catch (IOException e){
            out.println("Error here Mike!");  //My error handling to prevent my programming from crashing.
        }
    }
}
