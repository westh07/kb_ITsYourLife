package pm.javaPractice.view;

import pm.javaPractice.controller.BookManager;
import pm.javaPractice.model.BookDTO;

import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();
    public BookMenu(){

    }
    public void menu(){
        do {
            System.out.println("""
                
                *** 도서 관리 프로그램 ***
                1. 새 도서 추가
                2. 도서 삭제
                3. 도서 검색출력
                4. 전체 출력
                5. 끝내기
                ***********************
                """);
            System.out.print("원하는 프로그램을 선택하시오 : ");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("추가하고 싶은 도서의 정보를 입력하세요");
                    BookDTO newBook = inputBook();
                    bm.addBook(newBook);
                    break;
                case 2:
                    System.out.print("삭제하고 싶은 도서의 인덱스를 입력하시오 : ");
                    int in = sc.nextInt();
                    bm.deleteBook(in);
                    break;
                case 3:
                    System.out.print("인덱스로 검색은 1, 제목으로 검색은 2를 입력하시오 : ");
                    int option = sc.nextInt();
                    switch (option){
                        case 1:
                            System.out.print("찾고자하는 인덱스를 입력하시오 : ");
                            int index = sc.nextInt();
                            bm.printBook(index);
                            break;
                        case 2:
                            System.out.println("도서 제목을 입력하면 해당 도서가 존재하는지 출력하겠습니다.");
                            String booktitle= inputBookTitle();
                            int indexBook = bm.searchBook(booktitle);
                            if(indexBook==-1){
                                System.out.println("조회한 도서가 존재하지 않음");
                            }else{
                                System.out.println("해당 도서의 index는 " + indexBook + " 입니다.");
                            }

                            break;
                        default:
                            System.out.println("존재하지 않은 번호입니다.");
                            break;
                    }
                    break;
                case 4:
                    bm.displayAll();
                    break;
                case 5:
                    System.out.print("진짜 종료하겠습니까 (y/n)? ");
                    String inp = sc.next();
                    if(inp.charAt(0)=='Y' || inp.charAt(0)=='y'){
                        return;
                    } else{
                        break;
                    }
                default:
                    System.out.println("잘못된 번호 입니다");
                    break;

            }
        } while (true);
    }
    public BookDTO inputBook(){
        System.out.print("도서 번호 : ");
        String bNo = sc.next();

        String title = inputBookTitle();
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        while (((category<1)||(category>4))){
            System.out.println("잘못된 입력입니다");
            System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
            category = sc.nextInt();
        }
        System.out.print("도서 저자 : ");
        String author = sc.next();
        BookDTO newBook = new BookDTO(bNo,category,title,author);
        return newBook;
    }
    public String inputBookTitle(){
        System.out.print("도서 제목 : ");
        String booktitle= sc.next();
        return booktitle;
    }
}
