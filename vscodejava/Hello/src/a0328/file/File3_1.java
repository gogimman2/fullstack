package a0328.file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class File3_1 {
    public static void main(String[] args) throws IOException{
        // 폴더경로
        String folderPath = "d:\\abc";
        File folder = new File(folderPath);

        // 폴더가 존재하지 않으면 생성
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
        
        // println 메서드 사용할 수 있다. \r\n 대체한다
        pw.close();
    }
}
