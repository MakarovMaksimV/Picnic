package util;

import repository.PicnicRepository;
import view.PicnicView;
import java.io.*;
public class AplicationRun {

    public void Runner() throws IOException {

        PicnicView pv = new PicnicView();
        PicnicRepository pr = new PicnicRepository();
        pv.view(pr.repositoryOpen());
        pr.repositoryClose();
    }
}
