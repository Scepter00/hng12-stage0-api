package africa.hng12stage0api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class InfoController {

    @GetMapping
    public Map<String, String> getApiResponse() {
        Map<String, String> response = new HashMap<>();
        response.put("email", "chukwunenyeebuka@gmail.com");
        response.put("current_datetime", Instant.now().atOffset(ZoneOffset.UTC).truncatedTo(java.time.temporal.ChronoUnit.SECONDS).format(DateTimeFormatter.ISO_INSTANT));
        response.put("github_url", "https://github.com/Scepter00/hng12-stage0-api.git");

        return response;
    }
}
