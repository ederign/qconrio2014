import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteAroundPattern {


    public static String processFileBasic() throws IOException{
        try(BufferedReader br = new BufferedReader( new FileReader( "src/data.txt" ) )){
            return br.readLine();
        }
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException{
        try(BufferedReader br = new BufferedReader( new FileReader( "src/data.txt" ) )){
            return p.process( br );
        }
    }

     public interface BufferedReaderProcessor{
        String process(BufferedReader p ) throws  IOException;
     }

    public static void main( String[] args ) throws IOException {
        System.out.println(processFileBasic());
        System.out.println(processFile((BufferedReader br)-> br.readLine()) );
        System.out.println(processFile((BufferedReader br)-> br.readLine() + br.readLine()) );
    }
}
