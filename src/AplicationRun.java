import view.PicnicView;
import java.io.*;
public class AplicationRun {
    String fileName = "input.txt";

    public void Runner() throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        PicnicView pv = new PicnicView();
        pv.run(br);
    }
}
