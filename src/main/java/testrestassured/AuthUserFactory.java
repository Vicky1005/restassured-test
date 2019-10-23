package testrestassured;

public class AuthUserFactory {

    public static AuthUser createSuccedUser() {
        return new AuthUser("eve.holt@reqres.in", "cityslicka");
    }

    public static AuthUser creatUserIncorrectPassword() {
        return new AuthUser("eve.holt@reqres.in");
    }

    public static AuthUser creatUserIncorrectEmail() {
        return new AuthUser("eve.holtreqres.in", "efg8");
    }
}
