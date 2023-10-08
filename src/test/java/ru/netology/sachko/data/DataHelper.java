package ru.netology.sachko.data;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.github.javafaker.Faker;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.Value;
import lombok.val;

import java.util.Random;

import java.util.Locale;

import static io.restassured.RestAssured.given;

public class DataHelper {

    private DataHelper(){}

    public static VerificationCode getVerificationCode(){
        return new VerificationCode("12345");
    }

    public static AuthInfo getAuthInfo(){
        return new AuthInfo("vasya","qwerty123");
    }

    public static CardInfo getFirstCardInfo(){
        return new CardInfo("5559 0000 0000 0001", "92df3f1c-a033-48e6-8390-206f6b1f56c0");
    }
    public static CardInfo getSecondCardInfo(){
        return new CardInfo("5559 0000 0000 0002", "0f3f5c2a-249e-4c3d-8287-09f7a039391d");
    }
    public static int generateValidAmount(int balance){
        return new Random().nextInt(Math.abs(balance))+1;
    }

    public static int generateInvalidAmount(int balance){
        return Math.abs(balance)+ new Random().nextInt(10000);
    }

    public static AuthInfo getOtherAuthInfo(AuthInfo original) {
        return new AuthInfo("petya","123qwerty");}

    @Value
    public static class VerificationCode{
        String code;}

    @Value
    public static class CardInfo{
        String cardNumber;
        String testId;}
    @Value
    public static class AuthInfo{
        String login;
        String password;
    }


        public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
            return new VerificationCode("12345");}
}
