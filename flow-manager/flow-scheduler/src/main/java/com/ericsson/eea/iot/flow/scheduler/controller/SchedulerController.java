package com.ericsson.eea.iot.flow.scheduler.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/scheduler")
public class SchedulerController {

    private final static Logger logger = LoggerFactory.getLogger(SchedulerController.class);


    @RequestMapping(value = "/v1/start-flow/{flowId}", method = RequestMethod.GET)
	@ResponseBody
    public Map startFlow(@PathVariable("flowId") Integer flowId) throws Exception {

        Map map = new HashMap();
		map.put("flowId",flowId);
		map.put("errCode",00);

        return map;
    }
}
