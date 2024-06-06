package core;

public class PersonClass {
    public String username;
    public String fullName;
    public String email;
    public String password;
    public String phoneNumber;

    public PersonClass(String username, String name, String email, String password) {
        this.username = username;
        this.fullName = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

 

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return this.password;
    }
}
