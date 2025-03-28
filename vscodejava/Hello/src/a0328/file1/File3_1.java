package a0328.file1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class File3_1 {
    public static void main(String[] args) throws IOException{
        String folderPath = "d:\\abc";
        File folder = new File(folderPath);

        if (!folder.exists()) {
            if(folder.mkdirs()){
                System.out.println("폴더 생성됨 : " + folderPath);
            }
            else{
                System.out.println("폴더 생성 실패");
                return;
            }
        }
        PrintWriter pw = new PrintWriter("d:\\abc\\out.txt");
        
        for(int i = 1; i < 11;i++){
            String data = i + "첫번째 줄입니다.\r\n";
            pw.println(data.getBytes());
        }
        
        pw.close();
    }
}
