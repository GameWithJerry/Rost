package de.unstableprogrammers.feoh.utils;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class JsonFileParser {
    protected JSONObject jsonobj;

    public JsonFileParser(String filename) {
        try {
            this.jsonobj = new JSONObject(readFile(filename));
        } catch(IOException | URISyntaxException exception) {}
    }

    public JSONObject get() {
        return this.jsonobj;
    }

    private String readFile(String fileName) throws URISyntaxException, IOException {

        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            byte[] encoded = Files.readAllBytes(Path.of(resource.toURI()));
            return new String(encoded, StandardCharsets.UTF_8);
        }

    }
}
