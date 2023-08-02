package readcsv;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "src/csvData/경기도 광주시_체육시설현황_20220816.csv"; // 읽고자 하는 CSV 파일 경로와 이름
        String line;
        String csvDelimiter = ","; // CSV 파일에서 데이터를 구분하는 문자(쉼표로 구분된 경우)

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile), StandardCharsets.UTF_8))) {
            while ((line = br.readLine()) != null) {
                // CSV 파일의 한 줄을 읽고 원하는 처리를 수행합니다.
                String[] data = line.split(csvDelimiter);
                // data 배열에는 한 줄의 데이터가 쉼표를 기준으로 나누어져 있습니다.
                // 원하는 작업을 수행하면 됩니다.
                
                System.out.println(data[0] +" " + data[1]);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
