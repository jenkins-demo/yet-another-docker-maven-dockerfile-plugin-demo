package demo;

import static spark.Spark.get;

/**
 * Created by Pierre Beitz
 * on 12/07/2018.
 */
public class Service {

    public static void main(String args[]) {
        get("/say-hello", (request, response) -> {
            return "hello world";
        });
    }
}
