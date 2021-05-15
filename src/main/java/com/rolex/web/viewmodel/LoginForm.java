package com.rolex.web.viewmodel;


import com.rolex.web.validation.constraint.customer.login.LoginConstraint;

@LoginConstraint.List({
        @LoginConstraint(
                email = "email",
                password = "password"
        )
})
public class LoginForm {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
