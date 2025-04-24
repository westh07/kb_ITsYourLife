package basic.ch14.sec03.exam02;

import java.awt.*;

public class RunnableClass implements Runnable{
    @Override
    public void run() {
        // 스레드한테 시킬 일
        // Toolkit 도구모음 클래스
        // beep()

        // singletone(?) 패턴 있으면 그것을 return하고 없으면 생성해서 return
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();

            try{
                Thread.sleep(500);
            } catch(Exception e){
                // printStackTrace() : 예외가 발생한 위치 경로를 알려줌
                e.printStackTrace();
            }
        }
    }
}
