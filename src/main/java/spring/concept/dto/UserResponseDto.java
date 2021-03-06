package spring.concept.dto;

public class UserResponseDto {
    private String name;
    private String email;

    public UserResponseDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserResponseDto { name='" + name
                + ", email = '" + email + "' }";
    }
}
