5월 연휴 자바 과제
# 도서 관리 프로그램

## 📋 프로젝트 개요
도서 정보를 관리할 수 있는 콘솔 기반 프로그램을 구현합니다.

## 📁 프로젝트 구조
```

hw
├── model
│   └── BookDTO.java # 도서 정보를 담는 클래스
├── controller
│   └── BookManager.java # 도서 관리 기능 구현
├── view
│   └── BookMenu.java # 사용자 인터페이스
└── run
└── Application.java # 프로그램 실행

````

## 💻 구현 클래스

### 1. BookDTO (도서 정보)
```java
public class BookDTO {
    // 필드
    private String bNo; // 도서 번호
    private int category; // 도서분류코드
    private String title; // 도서 제목
    private String author; // 도서 저자

    // 생성자
    // 1. 기본 생성자
    // 2. bNo, category, title, author를 초기화하는 생성자

    // getter/setter 메소드

    // toString() 메소드

    // lombok 사용해도 OK
}
````

### 2. BookManager (도서 관리)

```java
public class BookManager {
    private ArrayList<BookDTO> bookList; // 도서 목록

    public BookManager() {
        // bookList 인스턴스 생성
    }

    public void addBook(BookDTO book) {
        // 도서 추가
    }

    public void deleteBook(int index) {
        // 전달받은 index로 도서 삭제
    }

    public int searchBook(String title) {
        // 도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
        // 도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴
    }

    public void printBook(int index) {
        // 인덱스 위치의 객체의 정보를 출력함
        // 인덱스 도서가 없으면 적절한 메시지 출력
    }

    public void displayAll() {
        // 도서 전체 리스트를 출력
        // 도서가 없는 경우 적절한 메시지 출력
    }
}
```

### 3. BookMenu (메뉴)

```java
public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {}

    public void menu() {
        // 메뉴 출력
        /*
        *** 도서 관리 프로그램 ***
        1. 새 도서 추가
        2. 도서 삭제
        3. 도서 검색출력
        4. 전체 출력
        5. 끝내기
        */
        // 메뉴 번호 입력 받기
        // 잘못된 입력 처리
        // 각 메뉴에 따른 기능 실행
    }

    public BookDTO inputBook() {
        // 도서 번호 : 입력받음
        // 도서 제목 : 입력 받음
        // 도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : 입력 받음 (숫자로)
        // 도서 저자 : 입력 받음
        // 매개변수 생성자를 이용하여 위의 초기값을 이용한 BookDTO객체 리턴
    }

    public String inputBookTitle() {
        // "도서 제목 : " 입력 받아 리턴
    }
}
```

### 4. Application (실행)

```java
public class Application {
    public static void main(String[] args) {
        // 메뉴실행
        new BookMenu().menu();
    }
}
```

## 📑 요구사항 명세

### 기능 요구사항

* **새 도서 추가**
  `BookMenu.inputBook()`를 통해 입력받은 `BookDTO` 객체를 `BookManager.addBook()`로 추가한다.
* **도서 삭제**
  “삭제할 도서의 인덱스를 입력해 주세요” 메시지 후 정수 입력 → `BookManager.deleteBook(index)` 호출.
* **도서 검색 및 출력**
  “확인할 도서명을 입력해주세요” 메시지 후 제목 입력 → `BookManager.searchBook(title)`로 인덱스 검색 → `BookManager.printBook(index)` 호출.
* **전체 도서 목록 출력**
  `BookManager.displayAll()` 호출하여 등록된 모든 도서를 출력한다.
* **프로그램 종료**
  메뉴 “5. 끝내기” 선택 시 y/n 확인 후 ‘Y’ 입력 시 프로그램을 종료한다.
* **잘못된 메뉴 입력 처리**
  메뉴 번호가 1\~5 범위를 벗어날 경우 “잘못 입력하셨습니다.” 메시지를 출력하고 메뉴를 재표시한다.

### 데이터 요구사항

* 도서번호 (String): ISBN 형식 (하이픈 포함 여부 무관)
* 분류코드 (int): 1: 인문 / 2: 자연과학 / 3: 의료 / 4: 기타
* 제목 (String): 빈 값 불가
* 저자 (String): 빈 값 불가

### UI 요구사항

```
**_ 도서 관리 프로그램 _**

1. 새 도서 추가  
2. 도서 삭제  
3. 도서 검색출력  
4. 전체 출력  
5. 끝내기  
메뉴 선택 : 
```

### 예외 처리

* 목록이 비어 있을 때 `bookList.isEmpty() == true` → “출력할 도서가 없습니다.”
* 검색 결과가 없을 때 `searchBook()`가 -1 반환 → “조회한 도서가 존재하지 않음”
* 잘못된 메뉴 선택 시 메뉴 번호가 1\~5 범위를 벗어날 때 → “잘못 입력하셨습니다.”
* 삭제/검색 인덱스 오류: 입력한 인덱스가 `0 ≤ index < bookList.size()` 범위를 벗어날 경우 `IndexOutOfBoundsException` 발생 → 차후 유효성 검증 필요

## 💡 풀면서 어려웠던 것

* `void` 리턴 타입도 `return;` 문을 사용해 메소드의 실행을 종료할 수 있다는 것을 이용하는 것이 좋음
* 메뉴 반복 구조를 `main` 메소드에서 직접 구현하는 것보다, `BookMenu` 클래스 내에서 처리하는 방식이 더 깔끔함 이때 `return;`을 사용해 메뉴 반복을 제어할 수 있음

## 🔧 나중에 추가할 사항

* **입력값 유효성 검사**: 도서 제목, 저자 등 빈 값이나 데이터 타입에 적합하지 않은 값을 입력한 경우 다시 입력을 요구하도록 처리
