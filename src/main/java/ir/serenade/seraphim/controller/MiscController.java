package ir.serenade.seraphim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiscController {

    @GetMapping(path = "/api/v2/version")
    public String version() {
        return "";
    }
}
