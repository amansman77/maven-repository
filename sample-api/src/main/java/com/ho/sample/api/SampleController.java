package com.ho.sample.api;

import com.ho.util.SampleUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping(value = "sample")
    public ResponseEntity<Boolean> getSample() {
        return ResponseEntity.ok(SampleUtil.isSuccess());
    }
}
