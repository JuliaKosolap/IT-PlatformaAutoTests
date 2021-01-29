package common.global;

public class Global {
    public static String globalDevice = "";
    public static String globalBrowserName = "";

    public static void resetGlobalVariablesAfterMethod() {
        globalDevice = "";
        globalBrowserName = "";
    }
}
