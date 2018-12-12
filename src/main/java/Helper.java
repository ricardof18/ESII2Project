import java.io.*;

public class Helper {
        public static String Reader(String filename) throws IOException{
            StringBuilder contentBuilder = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader(filename)))
            {

                String sCurrentLine;
                while ((sCurrentLine = br.readLine()) != null)
                {
                    contentBuilder.append(sCurrentLine).append("\n");
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return contentBuilder.toString();
        }
        public static Boolean Writer(String str, String filename)throws FileNotFoundException{
            try (PrintWriter out = new PrintWriter(filename)) {
                out.println(str);
            }
            return true;
        }
}


