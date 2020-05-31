package pl.bp.ognivo.rest.model;

import lombok.Data;

@Data public class User {
    private final String name;
    private final String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
