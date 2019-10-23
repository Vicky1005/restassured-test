package testrestassured;


public class RegisterFactory {


    public static Register successfulRegister() {
        return new Register("eve.holt@reqres.in", "pistol");
    }

    public static Register unsuccessfulRegister() {
        return new Register("sydney@fife");
    }
}
