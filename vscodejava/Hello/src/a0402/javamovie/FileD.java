package a0402.javamovie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class FileD {
    private MovieManager mm = new MovieManager();

    public void ticketSaveFile(Map<String, Movie> rm, String name) {
        try {
            File file = new File("d:\\movie\\ticket.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            if (file.isFile() && file.canWrite()) {
                bw.write(mm.ticketPrint(rm, name));
                bw.flush();
                System.out.println("파일저장완료");
                bw.close();
            }
        } catch (Exception e) {
            System.out.println("파일저장실패");
        }
    }

    public void upload() {
        try {
            File file = new File("d\\movie==schedule.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("========================================");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] movie = line.split("/");
                (MovieManager.getMovies()).add(new Movie(movie[0], movie[1], Integer.parseInt(movie[2]), Boolean.parseBoolean(movie[3])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("schedule.txt 파일을 찾을수 없습니다.");
        }catch (IOException e) {
            System.out.println("파일 열기 실패");
        }
    }

}
