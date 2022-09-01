package org.example;

public class PasswordValidator {


    private static final String WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE = "비밀번호가 최소 8자이상";

    public static void validate(String password) throws IllegalAccessException {
        int length = password.length();

        if (length < 8 || length >12){
            throw new IllegalAccessException(WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE);
        }
    }
}