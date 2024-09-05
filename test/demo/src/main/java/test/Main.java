package test;

import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.mpp.MPPReader;
import java.io.File;


public class Main {
    MPPReader mppReader = new MPPReader();
    ProjectFile projectFile = mppReader.read(new File("./123.mpp"));

}