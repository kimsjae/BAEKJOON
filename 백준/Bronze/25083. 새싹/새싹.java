import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            bw.write("         ,r'\"7\n");
            bw.write("r`-_   ,'  ,/\n");
            bw.write(" \\. \". L_r'\n");
            bw.write("   `~\\/\n");
            bw.write("      |\n");
            bw.write("      |\n");
            bw.flush();
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}