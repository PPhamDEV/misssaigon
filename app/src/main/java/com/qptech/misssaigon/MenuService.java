package com.qptech.misssaigon;

import java.util.ArrayList;
import java.util.List;

public class MenuService {
    public static List<OrderItem> initMenu() {
        List<OrderItem> menu = new ArrayList<>();
        menu.add(new OrderItem("1", 3.6F));
        menu.add(new OrderItem("2", 2.8F));
        menu.add(new OrderItem("3", 4.4F));
        menu.add(new OrderItem("4", 5.4F));

        menu.add(new OrderItem("6", 3.9F));
        menu.add(new OrderItem("7", 5.4F));
        menu.add(new OrderItem("8", 5.4F));
        menu.add(new OrderItem("8g", 6.1F));
        menu.add(new OrderItem("8h", 6.1F));

        menu.add(new OrderItem("9", 8.1F));
        menu.add(new OrderItem("10", 8.3F));
        menu.add(new OrderItem("11", 7.7F));
        menu.add(new OrderItem("12", 8.1F));
        menu.add(new OrderItem("13", 7.7F));
        menu.add(new OrderItem("14", 8.3F));
        menu.add(new OrderItem("15", 8.3F));
        menu.add(new OrderItem("15a", 8.8F));
        menu.add(new OrderItem("19", 8.3F));

        menu.add(new OrderItem("20", 8.8F));
        menu.add(new OrderItem("20g", 11.9F));
        menu.add(new OrderItem("22", 11.0F));
        menu.add(new OrderItem("23", 11.5F));
        menu.add(new OrderItem("24", 10.2F));
        menu.add(new OrderItem("25", 13.0F));
        menu.add(new OrderItem("26", 10.2F));

        menu.add(new OrderItem("20b", 9.3F));
        menu.add(new OrderItem("22b", 11.5F));
        menu.add(new OrderItem("23b", 12.0F));
        menu.add(new OrderItem("24b", 10.7F));
        menu.add(new OrderItem("25b", 13.30F));

        menu.add(new OrderItem("30", 8.8F));
        menu.add(new OrderItem("30g", 11.9F));
        menu.add(new OrderItem("32", 11.0F));
        menu.add(new OrderItem("33", 11.5F));
        menu.add(new OrderItem("34", 10.2F));
        menu.add(new OrderItem("35", 13.0F));
        menu.add(new OrderItem("36", 10.2F));

        menu.add(new OrderItem("40", 10.2F));
        menu.add(new OrderItem("41", 10.4F));
        menu.add(new OrderItem("42", 10.4F));
        menu.add(new OrderItem("42a", 10.6F));
        menu.add(new OrderItem("43", 9.1F));
        menu.add(new OrderItem("43b", 12.4F));
        menu.add(new OrderItem("44", 9.1F));
        menu.add(new OrderItem("44b", 12.4F));
        menu.add(new OrderItem("46", 10.4F));
        menu.add(new OrderItem("47", 10.2F));
        menu.add(new OrderItem("49", 10.4F));

        menu.add(new OrderItem("60", 13.6F));
        menu.add(new OrderItem("61", 13.8F));
        menu.add(new OrderItem("62", 10.7F));
        menu.add(new OrderItem("62b", 13.8F));
        menu.add(new OrderItem("63", 10.7F));
        menu.add(new OrderItem("63b", 13.8F));
        menu.add(new OrderItem("68", 13.8F));
        menu.add(new OrderItem("68a", 14.0F));
        menu.add(new OrderItem("69", 13.8F));

        menu.add(new OrderItem("64", 11.0F));
        menu.add(new OrderItem("65", 11.0F));
        menu.add(new OrderItem("66", 11.0F));
        menu.add(new OrderItem("67", 11.0F));

        menu.add(new OrderItem("70", 11.8F));
        menu.add(new OrderItem("71", 12.0F));
        menu.add(new OrderItem("72", 12.0F));
        menu.add(new OrderItem("72a", 12.2F));
        menu.add(new OrderItem("76", 12.0F));
        menu.add(new OrderItem("79", 12.0F));

        menu.add(new OrderItem("80", 11.2F));
        menu.add(new OrderItem("81", 11.4F));
        menu.add(new OrderItem("82", 11.4F));
        menu.add(new OrderItem("82a", 11.6F));
        menu.add(new OrderItem("86", 11.4F));
        menu.add(new OrderItem("87", 11.4F));
        menu.add(new OrderItem("89", 11.4F));

        menu.add(new OrderItem("Groß", 1.9F));
        menu.add(new OrderItem("Beilage", 5.1F));
        menu.add(new OrderItem("Soße", 1.4F));
        menu.add(new OrderItem("Reis", 3.4F));
        menu.add(new OrderItem("Statt Reis", 3.6F));
        menu.add(new OrderItem("Getränk", 2.0F));
        menu.add(new OrderItem("Getränk mit Pfand", 2.15F));
        return menu;
    }
}
