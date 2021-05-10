package com.rolex.web.viewmodel;



import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class RegisterViewModel {
    @NotNull(message = "Required", groups = CheckNull.class)
    private String firstName;

    @NotNull(message = "Required", groups = CheckNull.class)
    private String lastName;

    @Email(message = "The value is not in the right format.", groups = CheckOthers.class)
    @NotNull(message = "Required")
    private String email;

    @Digits(message = "The value contains letters.", integer = 11, fraction = 11, groups = CheckOthers.class)
    @NotNull(message = "Required", groups = CheckNull.class)
    private String phoneNumber;

    @NotNull(message = "Required", groups = CheckNull.class)
    private String address;

    @Length(min = 8, message = "Minimum 8 characters", groups = CheckOthers.class)
    @NotNull(message = "Required", groups = CheckNull.class)
    private String password;

    @Length(min = 8, message = "Minimum 8 characters", groups = CheckOthers.class)
    @NotNull(message = "Required", groups = CheckNull.class)
    private String passwordConfirm;


    private boolean subscribed;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public boolean isSubscribed() {
        return subscribed;
    }
}
