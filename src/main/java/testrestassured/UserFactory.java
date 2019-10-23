package testrestassured;

public class UserFactory {

    public static User createUser1(){
        User user=new User();
        user.setId(1);
        user.setEmail("george.bluth@reqres.in");
        user.setFirstName("George");
        user.setLastName("Bluth");
        user.setAvatar("https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg");
        return user;
    }
}
