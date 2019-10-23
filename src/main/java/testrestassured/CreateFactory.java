package testrestassured;

import io.qameta.allure.Step;

public class CreateFactory {

    public static Create createUser() {
        return createUser("morpheus", "leader");
    }

    @Step("создаем юзверя {0} {1}")
    public static Create createUser(String name, String surname) {
        return new Create(name, surname);
    }

}
