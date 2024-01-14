package by.me.data.dto;



import java.io.Serializable;

public class UserDto implements Serializable {
    private final String id;


    private final String username;

    private final  String password;

    private final String role;

    private final UserDetailsDto detailsDto;

    public UserDto(String id, String username, String password, String role, UserDetailsDto detailsDto) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.detailsDto = detailsDto;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public UserDetailsDto getDetailsDto() {
        return detailsDto;
    }
}
