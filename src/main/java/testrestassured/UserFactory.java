package testrestassured;

import io.qameta.allure.Step;

public class UserFactory {

@Step("Первый юзер")
    public static User createUser1(int id, String email, String firstName, String lastName, String avatar) {
        return new User(id, email, firstName, lastName, avatar);
    }

    public static User createUser2() {
        User user = new User();
        user.setId(2);
        user.setEmail("janet.weaver@reqres.in");
        user.setFirstName("Janet");
        user.setLastName("Weaver");
        user.setAvatar("https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg");
        return user;
    }

    public static User createUser3() {
        User user = new User();
        user.setId(3);
        user.setEmail("emma.wong@reqres.in");
        user.setFirstName("Emma");
        user.setLastName("Wong");
        user.setAvatar("https://s3.amazonaws.com/uifaces/faces/twitter/olegpogodaev/128.jpg");
        return user;
    }

    public static User createUser4() {
        User user = new User();
        user.setId(4);
        user.setEmail("eve.holt@reqres.in");
        user.setFirstName("Eve");
        user.setLastName("Holt");
        user.setAvatar("https://s3.amazonaws.com/uifaces/faces/twitter/marcoramires/128.jpg");
        return user;
    }

    public static User createUser5() {
        User user = new User();
        user.setId(5);
        user.setEmail("charles.morris@reqres.in");
        user.setFirstName("Charles");
        user.setLastName("Morris");
        user.setAvatar("https://s3.amazonaws.com/uifaces/faces/twitter/stephenmoon/128.jpg");
        return user;
    }

    public static User createUser6() {
        User user = new User();
        user.setId(6);
        user.setEmail("tracey.ramos@reqres.in");
        user.setFirstName("Tracey");
        user.setLastName("Ramos");
        user.setAvatar("https://s3.amazonaws.com/uifaces/faces/twitter/bigmancho/128.jpg");
        return user;
    }



}
