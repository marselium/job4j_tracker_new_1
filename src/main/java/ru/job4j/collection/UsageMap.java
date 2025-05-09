package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        for (String key : map.keySet()) {
            String val = map.get(key);
            System.out.println(key + " = " + val);
        }
        System.out.println("--After update--");
        map.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
