package ch06.sec10.exam01;

public class Application {
    // static이 아니면 Appication을 만들어서 올려줘야함
    public static int plus(int x, int y){
        return x+y;
    }

    // static : 맨위로 올림
    public static void main(String[] args){
        int a = plus(1,2);
    }
}
