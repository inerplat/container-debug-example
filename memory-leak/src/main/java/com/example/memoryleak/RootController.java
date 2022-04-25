package com.example.memoryleak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RootController {
    private static int next = 1;
    private static class LargeClass {
        private final byte[] bytes = new byte[1024 * 1024 * 10];
    }

    @GetMapping("/")
    public String get() {
        List<LargeClass> largeClasses = new ArrayList<>();
        for (int i = 0; i < next; i++) {
            largeClasses.add(new LargeClass());
        }
        next *= 10;
        return "BOMB " + largeClasses.size();
    }
}
