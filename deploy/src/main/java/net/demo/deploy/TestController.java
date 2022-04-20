package net.demo.deploy;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
public class TestController {
    
    @GetMapping(produces = "application/json")
    public ResponseEntity<String> ciallo(){
        return new ResponseEntity<String>("Ciallo~", HttpStatus.OK);
    }

    @GetMapping(value="/hi",produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public String getMethodName() {
        return "hi";
    }

    
}
