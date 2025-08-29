package com.vit.bajaj;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class BajajClient {

    private RestTemplate restTemplate = new RestTemplate();
    private ObjectMapper mapper = new ObjectMapper();
    private String inlineFinalQuery;
    private String overrideSubmitUrl;

    public void run() {
        // your pasted logic here
    }

    private String readSqlFromResource(String path) {
        try (InputStream is = getClass().getResourceAsStream(path)) {
            if (is == null) return null;
            try (BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line).append('\n');
                }
                return sb.toString().trim();
            }
        } catch (IOException e) {
            return null;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GenerateResponse {
        public String webhook;
        public String accessToken;
    }

    public static void main(String[] args) {
        new BajajClient().run();
    }
}
