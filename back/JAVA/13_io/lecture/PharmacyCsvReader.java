package lecture;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PharmacyCsvReader {
    public static List<Pharmacy> readCsv(String filePath) {

        // list 생성
        List<Pharmacy> pharmacies = new ArrayList<>();

        // BufferedReader -> 보조스트림
        // FileReader
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {

                // 첫줄 (헤더)무시
                if(isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                // 문자열배열
                String[] field = parseCsvLine(line);

//                System.out.println("field = " + Arrays.toString(field));

                if(field.length < 14) {
                    System.out.println(" 잘못된 라인 " + line);
                    continue;
                }

                pharmacies.add(new Pharmacy(field));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return  pharmacies;
    }

    private static String[] parseCsvLine(String line) {

        List<String> result = new ArrayList<>();

        StringBuilder current = new StringBuilder();

        // 큰따옴표 상태
        boolean inQuotes = false;

        for(int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            // 큰따옴표 만났을때
            if(c == '"') {
                inQuotes = !inQuotes; // 큰따옴표의 상태 반전

                // 문자가 , 일때 && 현재 inQoutes가 ture가 아닐 때
            } else if (c == ',' && !inQuotes) {

                // current.toString : (StringBuilder)에 쌓인 문자를 문자열로 반환
                result.add(current.toString().trim());
                current.setLength(0); // 초기화

                // 나머지 문자일때
            } else {
                // StringBuilder에 문자 추가
                current.append(c);
            }

        }

        // 마지막 필드 추가
        result.add(current.toString().trim());

        return result.toArray(String[]::new);
    }
}