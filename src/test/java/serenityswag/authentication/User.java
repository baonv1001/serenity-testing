package serenityswag.authentication;

public enum User {
    STANDARD_USER("acquyhexom1@gmail.com", "NiflFaejY92", "a standard user");
    private final String username;
    private final String password;
    private final String description;

    User(String username, String password, String description) {
        this.username = username;
        this.password = password;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
