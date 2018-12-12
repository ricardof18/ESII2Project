import java.io.IOException;

public class textMining {
    public static void main(String[] args) throws IOException {
        String durinha = Helper.Reader("ola.txt");
        String  newStr= durinha.replaceAll("[0-9,.!?\\-_\n]","");
        Helper.Writer(newStr, "newfile.txt");
    }
}