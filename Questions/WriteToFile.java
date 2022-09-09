package Questions;
import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {
    public static void main(String[] args) throws IOException {

        try {
            FileWriter myWriter = new FileWriter("hello.txt");
            myWriter.write("Hello world!");
            myWriter.append("""
                    Personalize the pitch of your selected voice, \n
                    up to 20 semitones more or less from the default. \n
                    Adjust your speaking rate to be 4x faster or slower than the normal rate.

                    """);
            myWriter.close();
            System.out.println("Successfully wrote into the file...");
        }

        catch (IOException e){
            System.out.println("An error occurred..");
            e.printStackTrace();
        }
    }
}
