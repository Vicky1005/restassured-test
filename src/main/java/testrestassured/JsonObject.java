package testrestassured;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class JsonObject {
    public static void main(String[] args) throws IOException {

      /*  String jsonString = " \"id\": 2,\n" +
                "        \"email\": \"janet.weaver@reqres.in\",\n" +
                "        \"first_name\": \"Janet\",\n" +
                "        \"last_name\": \"Weaver\",\n" +
                "        \"avatar\": \"https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg\"\n" +
                "    }\n" +
                "}";

        StringReader reader=new StringReader(jsonString);

        ObjectMapper mapper=new ObjectMapper();

        SingleUser singleUser=mapper.readValue(reader, SingleUser.class);*/


        SingleUser singleUser = new SingleUser();
        singleUser.id = 2;
        singleUser.email = "janet.weaver@reqres.in";
        singleUser.firstName = "Janet";
        singleUser.lastName = "Weaver";
        singleUser.avatar = "https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg";

        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer, singleUser);

        String result = writer.toString();
        System.out.println(result);



    }

}






