package edu.dp.sau.akompaniiets.lab4.json;

import com.google.gson.*;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializationContext;

import edu.dp.sau.akompaniiets.lab4.model.*;

import java.lang.reflect.Type;

public class HumanAdapter implements JsonSerializer<Human>, JsonDeserializer<Human> {

    @Override
    public JsonElement serialize(Human src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("firstName", src.getFirstName());
        jsonObject.addProperty("lastName", src.getLastName());
        jsonObject.addProperty("middleName", src.getMiddleName());
        jsonObject.addProperty("sex", src.getSex().toString());

        if (src instanceof Rector) {
            jsonObject.addProperty("type", "Rector");
        } else if (src instanceof Dean) {
            jsonObject.addProperty("type", "Dean");
        } else if (src instanceof GroupHead) {
            jsonObject.addProperty("type", "GroupHead");
        }
        else if (src instanceof DepartmentHead) {
            jsonObject.addProperty("type", "DepartmentHead");
        }
        return jsonObject;
    }

    @Override
    public Human deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();

        String firstName = jsonObject.get("firstName").getAsString();
        String lastName = jsonObject.get("lastName").getAsString();
        String middleName = jsonObject.get("middleName").getAsString();
        Sex sex = Sex.valueOf(jsonObject.get("sex").getAsString());

        String type = jsonObject.get("type").getAsString();
        switch (type) {
            case "Rector":
                return new Rector(firstName, lastName, middleName, sex);
            case "Dean":
                return new Dean(firstName, lastName, middleName, sex);
            case "GroupHead":
                return new GroupHead(firstName, lastName, middleName, sex);
            case "DepartmentHead":
                return new DepartmentHead(firstName, lastName, middleName, sex);
            default:
                throw new JsonParseException("Unknown type: " + type);
        }
    }
}
