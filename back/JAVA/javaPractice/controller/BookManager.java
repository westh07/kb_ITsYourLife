package pm.javaPractice.controller;

import pm.javaPractice.model.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Iterator;

public class BookManager {
    private ArrayList<BookDTO> bookList; //도서 목록
    public BookManager(){
        bookList = new ArrayList<>();
    }
    public void addBook(BookDTO book){
        bookList.add(book);
    }
    public void deleteBook(int index) {
        // 전달받은 index로 도서 삭제
        try {
            bookList.remove(index);
        } catch (Exception e) {
            System.out.println("해당하는 index가 없습니다");
        }
    }

    public int searchBook(String title) {
        Iterator<BookDTO> bookIterator = bookList.iterator();
        int index = -1;

        // 도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
        while(bookIterator.hasNext()){
            index+=1;
            BookDTO book = bookIterator.next();
            String extitle = book.getTitle();
            if(extitle.equals(title)){
                return index;
            }
        }
        // 도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴
        return -1;
    }

    public void printBook(int index) {
        //인덱스 위치의 객체의 정보를 출력함
        try {
            System.out.println(bookList.get(index));
        } catch (Exception e) {
            System.out.println("존재하지 않은 인덱스 번호입니다");
        }
        // 인덱스 도서가 없으면 적절한 메시지 출력
    }

    public void displayAll() {
        // 도서가 없는 경우 적절한 메시지 출력
        if(bookList.isEmpty()){
            System.out.println("도서가 없습니다 추가해주세요");
        } else{
            // 도서 전체 리스트를 출력
            for(BookDTO book : bookList){
                System.out.println(book);
            }
        }
    }
}
