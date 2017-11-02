package com.whateley.FrontEndTech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrontEndTechService {

    @Autowired
    private FrontEndTechRepository frontEndTechRepository;
}
