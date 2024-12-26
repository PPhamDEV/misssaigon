package com.qptech.misssaigon;

import java.util.ArrayList;
import java.util.List;

public class MenuService {
    public static List<OrderItem> initMenu() {
        List<OrderItem> menu = new ArrayList<>();
        menu.add(new OrderItem("1", 3.8F));
        menu.add(new OrderItem("2", 2.9F));
        menu.add(new OrderItem("3", 4.6F));
        menu.add(new OrderItem("4", 5.6F));

        menu.add(new OrderItem("6", 4.1F));
        menu.add(new OrderItem("7", 5.6F));
        menu.add(new OrderItem("8", 5.6F));
        menu.add(new OrderItem("8g", 6.3F));
        menu.add(new OrderItem("8h", 6.3F));

        menu.add(new OrderItem("9", 8.4F));
        menu.add(new OrderItem("10", 8.6F));
        menu.add(new OrderItem("11", 8.0F));
        menu.add(new OrderItem("12", 8.4F));
        menu.add(new OrderItem("13", 8.0F));
        menu.add(new OrderItem("14", 8.6F));
        menu.add(new OrderItem("15", 8.6F));
        menu.add(new OrderItem("15a", 9.0F));
        menu.add(new OrderItem("19", 8.6F));

        menu.add(new OrderItem("20", 9.2F));
        menu.add(new OrderItem("20g", 12.3F));
        menu.add(new OrderItem("22", 11.4F));
        menu.add(new OrderItem("23", 11.9F));
        menu.add(new OrderItem("24", 10.6F));
        menu.add(new OrderItem("25", 13.4F));
        menu.add(new OrderItem("26", 10.6F));

        menu.add(new OrderItem("20b", 9.7F));
        menu.add(new OrderItem("22b", 11.9F));
        menu.add(new OrderItem("23b", 12.4F));
        menu.add(new OrderItem("24b", 11.1F));
        menu.add(new OrderItem("25b", 13.70F));

        menu.add(new OrderItem("30", 9.2F));
        menu.add(new OrderItem("30g", 12.3F));
        menu.add(new OrderItem("32", 11.4F));
        menu.add(new OrderItem("33", 11.9F));
        menu.add(new OrderItem("34", 10.6F));
        menu.add(new OrderItem("35", 13.4F));
        menu.add(new OrderItem("36", 10.6F));

        menu.add(new OrderItem("40", 10.6F));
        menu.add(new OrderItem("41", 10.8F));
        menu.add(new OrderItem("42", 10.8F));
        menu.add(new OrderItem("42a", 11.0F));
        menu.add(new OrderItem("43", 9.5F));
        menu.add(new OrderItem("43b", 12.8F));
        menu.add(new OrderItem("44", 9.5F));
        menu.add(new OrderItem("44b", 12.8F));
        menu.add(new OrderItem("46", 10.8F));
        menu.add(new OrderItem("47", 10.6F));
        menu.add(new OrderItem("49", 10.8F));

        menu.add(new OrderItem("60", 13.9F));
        menu.add(new OrderItem("61", 14.1F));
        menu.add(new OrderItem("62", 10.9F));
        menu.add(new OrderItem("62b", 14.1F));
        menu.add(new OrderItem("63", 10.9F));
        menu.add(new OrderItem("63b", 14.1F));
        menu.add(new OrderItem("68", 14.1F));
        menu.add(new OrderItem("68a", 14.3F));
        menu.add(new OrderItem("69", 14.1F));

        menu.add(new OrderItem("64", 11.3F));
        menu.add(new OrderItem("65", 11.3F));
        menu.add(new OrderItem("66", 11.3F));
        menu.add(new OrderItem("67", 11.3F));

        menu.add(new OrderItem("70", 12.2F));
        menu.add(new OrderItem("71", 12.4F));
        menu.add(new OrderItem("72", 12.4F));
        menu.add(new OrderItem("72a", 12.6F));
        menu.add(new OrderItem("76", 12.4F));
        menu.add(new OrderItem("79", 12.4F));

        menu.add(new OrderItem("80", 11.6F));
        menu.add(new OrderItem("81", 11.8F));
        menu.add(new OrderItem("82", 11.8F));
        menu.add(new OrderItem("82a", 12.0F));
        menu.add(new OrderItem("86", 11.8F));
        menu.add(new OrderItem("87", 11.8F));
        menu.add(new OrderItem("89", 11.8F));

        menu.add(new OrderItem("Groß", 2.0F));
        menu.add(new OrderItem("Beilage", 5.3F));
        menu.add(new OrderItem("Soße", 1.5F));
        menu.add(new OrderItem("Reis", 3.5F));
        menu.add(new OrderItem("Statt Reis", 3.8F));
        menu.add(new OrderItem("Getränk", 2.3F));
        menu.add(new OrderItem("Getränk mit Pfand", 2.45F));
        return menu;
    }
}
