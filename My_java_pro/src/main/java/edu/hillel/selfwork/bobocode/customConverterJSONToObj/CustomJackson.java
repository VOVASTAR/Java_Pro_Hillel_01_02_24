package edu.hillel.selfwork.bobocode.customConverterJSONToObj;

import lombok.Data;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class CustomJackson {

    public static void main(String[] args) {
        var json = "{\n" +
                "  \"firstName\": \"Boba\",\n" +
                "  \"lastName\": \"Star\",\n" +
                "  \"email\": \"Boba@gmail.com\",\n" +
                "  \"city\": \"Odesa\"\n" +
                "}";

        var user = jsonToObj(json, User.class);
        System.out.println(user);
    }

    private static <T> T jsonToObj(String json, Class<T> userClass) {
        T user;
        try {
            user = userClass.getDeclaredConstructor().newInstance();
            String substring = json.replaceAll("[{}\"\\n]", "");
            String[] split = substring.split("[:,]+");
            Field[] fields = userClass.getDeclaredFields();

            for (Field field : fields) {
                field.setAccessible(true);
                for (int i = 0; i < split.length - 1; i += 2) {
                    String trim = split[i].trim();
                    if (field.getName().equals(trim)) {
                        field.set(user, split[i + 1].trim());
                    }
                }
            }
            return user;
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }


    @Data
    static class User {
        private String firstName;
        private String lastName;
        private String email;
        private String city;
    }
}