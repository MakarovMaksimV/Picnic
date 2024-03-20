package repository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PicnicRepository {
    String fileName = "input.txt";
    public BufferedReader repositoryOpen() throws FileNotFoundException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        return br;
    }
    public void repositoryClose() throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        br.close();
    }


}
