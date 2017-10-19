package com.whateley.University;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @RequestMapping("/universities")
    public List<University> getAllUniversities(){
        return universityService.getAllUniversities();
    }

    @RequestMapping("/universities/{id}")
    public University getUniversityById(@PathVariable String id){
        return universityService.getUniversityById(id);
    }

    @RequestMapping(value="/universities", method= RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
    public University addUniversity(@RequestBody University uni){
        universityService.addUniversity(uni);
        return uni;
    }

    @RequestMapping(value = "/universities/{id}", method = RequestMethod.PUT ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public University updateUniversity(@RequestBody University uni, @PathVariable String id){
        universityService.updateUniveristy(uni, id);
        return uni;
    }

    @RequestMapping(value="/universities/{id}", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String deleteUniversity(@PathVariable String id){
        universityService.deleteUniversity(id);
        return "Success";
    }
}
