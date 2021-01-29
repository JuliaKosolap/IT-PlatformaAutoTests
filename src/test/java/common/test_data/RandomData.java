package common.testData;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomData {

    public static String randomString(int stringLength) {
        String string = RandomStringUtils.randomAlphanumeric(stringLength);
        return string;
    }

    public static String randomUserName() {
        String userName = "Test" + System.nanoTime();
        return userName;
    }

    public static String invalidRandomUserName() {
        String userName = RandomStringUtils.randomAscii(20);
        return userName;
    }

    public static String randomEmail() {
        String email = "TestEmail" + System.nanoTime() + "@gmail.com";
        return email;
    }

    public static String invalidRandomEmail() {
        String email = RandomStringUtils.randomAlphanumeric(10);
        return email;
    }

    public static String randomPassword() {
        String password = RandomStringUtils.randomAlphanumeric(10                                           );
        return password;
    }
}
