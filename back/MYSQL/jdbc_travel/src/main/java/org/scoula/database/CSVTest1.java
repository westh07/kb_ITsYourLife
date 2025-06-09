package org.scoula.database;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// OpenSCV 라이브러리
// CSV파일을 읽을때 도와주는 라이브러리
public class CSVTest1 {
    public static void main(String[] args) throws Exception {

        // CSVReader 객체 생성
        CSVReader csvReader = new CSVReader(new FileReader("travel.csv"));

        // 각 줄을 읽어올 배열
        String[] line;

        while((line = csvReader.readNext()) != null) {
            System.out.println(String.join(",", line));
        }

        csvReader.close();

    }
}
