package com.hsbc.gcph.xaracloud.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by subhash on 25/7/17.
 */
@RestController
public class UtilService {

    @GetMapping("/_ah/health")
    public String healthCheck() {
        return "OK";
    }

}
