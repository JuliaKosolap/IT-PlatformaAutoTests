package common.testData;

public enum IT_Platforma_Links {

    IT_PLATFORMA_MAIN_PAGE("https://it-platforma.website/"),
    IT_PLATFORMA_REGISTRATION_PAGE("https://it-platforma.website/register/"),
    IT_PLATFORMA_LOGIN_PAGE("https://it-platforma.website/login/"),
    IT_PLATFORMA_DASHBOARD_PAGE("https://it-platforma.website/dashboard/");

    private final String value;


    IT_Platforma_Links(String value) {
        this.value = value;

    }

    public String getValue() {
        return value;
    }


}
