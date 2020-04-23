package BlueMediaSet.Settings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SettingProp {

    public static String getProp(String key) {
        File file = new File("config.properties");

        FileInputStream fileInput = null;

        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        Properties prop = new Properties();

        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
