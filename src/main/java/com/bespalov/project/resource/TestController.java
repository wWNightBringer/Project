package com.bespalov.project.resource;

import com.bespalov.project.annotation.JsonSerialize;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/test")
public class TestController {

    @JsonSerialize
    @GetMapping(value = "/value")
    public ResponseEntity<String> getTest(HttpServletRequest request) {
        return ResponseEntity.ok().body("Hello aspect spring");
    }
}
