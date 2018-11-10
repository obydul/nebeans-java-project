package com.obydul.json;

import java.io.IOException;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;

public class JsonEncodeDemo {

    public static void main(String[] args) {
        try {
            JSONObject obj = new JSONObject();
            obj.put("name", "foo");
            obj.put("num", new Integer(100));
            obj.put("balance", new Double(1000.21));
            obj.put("is_vip", new Boolean(true));

            StringWriter out = new StringWriter();
            obj.writeJSONString(out);
            String jsonText = out.toString();

            System.out.print(jsonText);
            System.out.println("");
        } catch (IOException ex) {
            Logger.getLogger(JsonEncodeDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
