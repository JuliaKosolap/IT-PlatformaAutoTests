package common.test_data;

public enum Five_Element_Links {
    FIVE_ELEMENT_MAIN_PAGE("https://5element.ua/"),
    FIVE_ELEMENT_OFFER_PAGE("https://5element.ua/about/special_offer/"),
    FIVE_ELEMENT_SCHEDULE_PAGE("https://5element.ua/shedule/"),
    FIVE_ELEMENT_CLUB_CARD_PAGE("https://5element.ua/klubnye-karty/");

    private final String value;


    Five_Element_Links(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
