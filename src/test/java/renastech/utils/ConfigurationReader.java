package renastech.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

        private static Properties confiFile;
        static{

            try {
                FileInputStream fileInputStream=new FileInputStream("configurations.properties");
                confiFile =new Properties();
                confiFile.load(fileInputStream);
                fileInputStream.close();

            }catch (Exception e){
                e.printStackTrace();
            }

        }



        public  static String getProperty (String key){

            return  confiFile.getProperty(key);
        }

    }


