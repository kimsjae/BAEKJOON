import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int count = Integer.parseInt(br.readLine());

            int[] sum = new int[count];
            for (int i = 0; i < count; i++) {
                String s = br.readLine();
                String[] ss = s.split(" ");
                sum[i] = Integer.parseInt(ss[0]) + Integer.parseInt(ss[1]);
            }

            for (int i = 0; i < count; i++) {
                bw.write(sum[i]+ "\n");
            }
            bw.flush();
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}