package a0324.doseo1;

import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Library> librarys; //Library를 객체를 리스트(묶음으로 저장할 수 있는 배열종류)
    private ArrayList<Library> booklocation;// Library를 객체중 대여한 객체를 저장하는 리스트

    public LibraryManager(){
        librarys = new ArrayList<>();//전체 책목록을 담을 리스트
        booklocation = new ArrayList<>(); // 대출한 목록 리스트
        librarys.add(new Library("This is Java","Shin","SectionA","979-11-691-229-8"));
        librarys.add(new Library("First Encounter with React", "Lee", "SectionB", "979-11-6921-169-7"));
        librarys.add(new Library("The Principles of Web Standards", "Ko", "SectionC", "979-11-6303-622-7"));
            //더미 데이터 
    }

    public void allLibrary() {
        System.out.println("대출 가능한 도서보기");
        for(int i=0; i < librarys.size(); i++){
            Library library = librarys.get(i);
            if (library.isAvailable()) {
                System.out.println(library);
            }
        }
       
       
        // for(Library library  :librarys){
        //     if(library.isAvailable()){
        //         System.out.println(library);
        //     }
        // }
    }

    public boolean booklocations(String name){
        for(Library library  :librarys){ //librarys 도서리스트를 순회 
            if(library.getTitile().equalsIgnoreCase(name) && library.isAvailable()){
                library.book();//대출이 실행되면 available에 = false 넣어 주는 메서드
                booklocation.add(library); //대출한 도서를 booklocation 리스트에 추가
                return true;
            }
        }
        return false;
    }

    public void booklocation() {
       System.out.println("대출한 도서 :");
       for(Library location : booklocation){
            System.out.println(location);
       }
    }

    public void addLibrary(String newTitle, String newAuthor, String newLocation, String newIsbn) {
        librarys.add(new Library(newTitle, newAuthor,newLocation,newIsbn));
    }




}