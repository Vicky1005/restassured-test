package testrestassured;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonAutoDetect
public class SingleUser {
    public int id;
    public String email;
    public String firstName;
    public String lastName;
    public String avatar;


    public SingleUser() {
    }


}

