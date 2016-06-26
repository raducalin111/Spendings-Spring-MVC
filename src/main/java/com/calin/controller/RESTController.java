package com.calin.controller;

import com.calin.modelview.Split;
import com.calin.modelview.SplitResult;
import com.calin.service.SplitService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Calin on 6/24/2016.
 */

@RestController
@RequestMapping(value = "/json")
public class RESTController {

    @Autowired
    SplitService splitService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value = "/spendings", headers = "content-type=application/json", method = RequestMethod.POST)
    public String calculate(@RequestBody Split split) {
        SplitResult splitResult = splitService.getSplitResult(split);
        String jsonSplitResult = "";
        try {
            jsonSplitResult = objectMapper.writeValueAsString(splitResult);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonSplitResult;
    }
}
