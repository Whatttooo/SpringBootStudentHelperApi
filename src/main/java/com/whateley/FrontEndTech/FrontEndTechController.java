package com.whateley.FrontEndTech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontEndTechController {

    @Autowired
    private FrontEndTechService frontEndTechService;
}
