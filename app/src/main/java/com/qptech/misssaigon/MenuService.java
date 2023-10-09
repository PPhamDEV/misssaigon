package com.qptech.misssaigon;

import java.util.ArrayList;
import java.util.List;

public class MenuService {
    public static List<OrderItem> initMenu() {
        List<OrderItem> menu = new ArrayList<>();
        menu.add(new OrderItem("1", 3.6F));
        menu.add(new OrderItem("2", 2.8F));
        menu.add(new OrderItem("3", 4.2F));
        menu.add(new OrderItem("4", 5.1F));

        menu.add(new OrderItem("6", 3.9F));
        menu.add(new OrderItem("7", 5.1F));
        menu.add(new OrderItem("8", 5.1F));
        menu.add(new OrderItem("8g", 5.8F));
        menu.add(new OrderItem("8h", 5.8F));

        menu.add(new OrderItem("9", 7.7F));
        menu.add(new OrderItem("10", 7.9F));
        menu.add(new OrderItem("11", 7.3F));
        menu.add(new OrderItem("12", 7.7F));
        menu.add(new OrderItem("13", 7.3F));
        menu.add(new OrderItem("14", 7.9F));
        menu.add(new OrderItem("15", 7.9F));
        menu.add(new OrderItem("15a", 8.3F));
        menu.add(new OrderItem("19", 7.9F));

        menu.add(new OrderItem("20", 8.3F));
        menu.add(new OrderItem("20g", 11.4F));
        menu.add(new OrderItem("22", 10.5F));
        menu.add(new OrderItem("23", 11.0F));
        menu.add(new OrderItem("24", 9.7F));
        menu.add(new OrderItem("25", 12.5F));
        menu.add(new OrderItem("26", 9.7F));

        menu.add(new OrderItem("20b", 8.8F));
        menu.add(new OrderItem("22b", 11.0F));
        menu.add(new OrderItem("23b", 11.5F));
        menu.add(new OrderItem("24b", 10.2F));
        menu.add(new OrderItem("25b", 12.80F));

        menu.add(new OrderItem("30", 8.3F));
        menu.add(new OrderItem("30g", 11.4F));
        menu.add(new OrderItem("32", 10.5F));
        menu.add(new OrderItem("33", 11.0F));
        menu.add(new OrderItem("34", 9.7F));
        menu.add(new OrderItem("35", 12.5F));
        menu.add(new OrderItem("36", 9.7F));

        menu.add(new OrderItem("40", 9.7F));
        menu.add(new OrderItem("41", 9.9F));
        menu.add(new OrderItem("42", 9.9F));
        menu.add(new OrderItem("42a", 10.1F));
        menu.add(new OrderItem("43", 8.7F));
        menu.add(new OrderItem("43b", 11.9F));
        menu.add(new OrderItem("44", 8.7F));
        menu.add(new OrderItem("44b", 11.9F));
        menu.add(new OrderItem("46", 9.9F));
        menu.add(new OrderItem("47", 9.7F));
        menu.add(new OrderItem("49", 9.9F));

        menu.add(new OrderItem("60", 13.1F));
        menu.add(new OrderItem("61", 13.3F));
        menu.add(new OrderItem("62", 10.3F));
        menu.add(new OrderItem("62b", 13.3F));
        menu.add(new OrderItem("63", 10.3F));
        menu.add(new OrderItem("63b", 13.3F));
        menu.add(new OrderItem("68", 13.3F));
        menu.add(new OrderItem("68a", 13.5F));
        menu.add(new OrderItem("69", 13.3F))
        ;
        menu.add(new OrderItem("64", 10.9F));
        menu.add(new OrderItem("65", 10.9F));
        menu.add(new OrderItem("66", 10.9F));
        menu.add(new OrderItem("67", 10.9F));

        menu.add(new OrderItem("70", 11.6F));
        menu.add(new OrderItem("71", 11.8F));
        menu.add(new OrderItem("72", 11.8F));
        menu.add(new OrderItem("72a", 12.0F));
        menu.add(new OrderItem("76", 11.8F));
        menu.add(new OrderItem("79", 11.8F));

        menu.add(new OrderItem("80", 10.7F));
        menu.add(new OrderItem("81", 10.9F));
        menu.add(new OrderItem("82", 10.9F));
        menu.add(new OrderItem("82a", 11.2F));
        menu.add(new OrderItem("86", 10.9F));
        menu.add(new OrderItem("87", 10.9F));
        menu.add(new OrderItem("89", 10.9F));

        menu.add(new OrderItem("Groß", 1.9F));
        menu.add(new OrderItem("Beilage", 4.9F));
        menu.add(new OrderItem("Soße", 1.3F));
        menu.add(new OrderItem("Reis / statt Reis", 3.4F));
        menu.add(new OrderItem("Getränk", 1.9F));
        menu.add(new OrderItem("Getränk mit Pfand", 2.05F));
        menu.add(new OrderItem("Bier mit Pfand", 2.0F));
        return menu;
    }
}
