package common.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Props {
    //путь к нашему файлу конфигураций
    public static final String PATH_TO_PROPERTIES = "src/test/resources/config.properties";
    public static String site = "";
    public static String login = "";
    public static String password = "";

    public static void initProperties() throws IOException {
        //инициализируем специальный объект Properties
        Properties prop = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream(PATH_TO_PROPERTIES)) {
            //обращаемся к файлу и получаем данные
            prop.load(fileInputStream);
            site = prop.getProperty("site");
            login = prop.getProperty("login");
            password = prop.getProperty("password");
            //печатаем полученные данные в консоль
            System.out.println(
                    "site: " + site
                            + "\nlogin: " + login
                            + "\npassword: " + password
            );
        }
    }

    public static void resetProperties() {
        site = "";
        login = "";
        password = "";
    }

}


