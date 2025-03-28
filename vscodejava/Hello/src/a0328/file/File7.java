package a0328.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File7 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("d:\\out.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            System.out.println(line);
        }
    }
}
