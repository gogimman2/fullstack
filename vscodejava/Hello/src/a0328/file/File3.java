package a0328.file;

import java.io.IOException;
import java.io.PrintWriter;

public class File3 {
    public static void main(String[] args) throws IOException{
        PrintWriter pw = new PrintWriter("d:/out.txt");
        
        for(int i = 1; i < 11;i++){
            String data = i + "첫번째 줄입니다.\r\n";
            pw.println(data.getBytes());
        }
        
        // println 메서드 사용할 수 있다. \r\n 대체한다
        pw.close();
    }
}
