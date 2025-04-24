package lecture.date;

import java.util.Calendar;
import java.util.Date;

public class Application1 {
    public static void main(String[] args) {
        Date legacyDate = new Date();
        legacyDate.setYear(2025);
        System.out.println("legacyDate.setYear(2025) 실제 출력 : " + legacyDate); // 1900 더해져서 출력됨

        // Calender 0월부터 시작
        Calendar cal = Calendar.getInstance();
        cal.set(2025,4,24);
        System.out.println("Calendar ..set(2025,4,24) -> 실제 출력 : " + cal.getTime());
    }
}
