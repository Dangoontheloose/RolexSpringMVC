package com.rolex.web.viewmodel;



import com.rolex.web.validation.constraint.customer.*;
import com.rolex.web.validation.constraint.customer.register.EmailConstraint;
import com.rolex.web.validation.constraint.customer.register.PasswordConfirmConstraint;
import com.rolex.web.validation.constraint.customer.register.PasswordConstraint;
import com.rolex.web.validation.constraint.customer.register.PhoneNumConstraint;


@PasswordConfirmConstraint.List({
        @PasswordConfirmConstraint(
                field = "password",
                fieldMatch = "passwordConfirm"
        )
})
public class RegisterViewModel {
    @NullConstraint
    private String firstName;

    @NullConstraint
    private String lastName;

    @EmailConstraint
    private String email;

    @PhoneNumConstraint
    private String phoneNumber;

    @NullConstraint
    private String address;

    @PasswordConstraint
    private String password;

    @NullConstraint
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
