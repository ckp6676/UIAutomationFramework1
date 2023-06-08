package DataReaders;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Properties;

public class PropertyFileReaders {
    public static LinkedHashMap<Object,Object> your_store_data = new LinkedHashMap<>();
    static {
        if(your_store_data.size()==0){
            readProperties();
        }

    }
    private static void readProperties() {
        File f = new File("TestData");//giving the folder name where all properties files are saved
        if (f.isDirectory()) {
            for (File eachPropFile : f.listFiles()) {
                try {
                    FileInputStream fis = new FileInputStream(eachPropFile);
                    Properties p = new Properties();
                    p.load(fis);
                    your_store_data.putAll(p);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
    public static String getPropertyValue(String key){
        return your_store_data.get(key).toString();
    }
}
