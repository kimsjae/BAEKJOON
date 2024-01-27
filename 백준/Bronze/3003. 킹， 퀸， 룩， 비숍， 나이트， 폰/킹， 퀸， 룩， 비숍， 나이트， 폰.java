import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String s = br.readLine();
            String[] ss = s.split(" ");
            int a,b,c,d,e,f;
            a = 1 - Integer.parseInt(ss[0]);
            b = 1 - Integer.parseInt(ss[1]);
            c = 2 - Integer.parseInt(ss[2]);
            d = 2 - Integer.parseInt(ss[3]);
            e = 2 - Integer.parseInt(ss[4]);
            f = 8 - Integer.parseInt(ss[5]);
            bw.write(a + " " + b + " " + c + " " + d + " " + e + " " + f + "\n");
            bw.flush();
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}