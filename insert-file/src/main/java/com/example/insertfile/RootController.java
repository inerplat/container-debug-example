package com.example.insertfile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

@RestController
public class RootController {

    @GetMapping("/{fileName}")
    public String getFile(@PathVariable String fileName) throws FileNotFoundException {
        File file = new File("/file/" + fileName);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fileInputStream);
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = isr.read()) != -1) {
                sb.append((char) c);
            }
            return sb.toString();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        throw new FileNotFoundException();
    }
}
