package com.whateley.BackEndTech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackEndTechController {

    @Autowired
    private BackEndTechService backEndTechService;
}
