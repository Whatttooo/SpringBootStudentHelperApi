package com.whateley.University;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    public University getUniversityById(@PathVariable Long id){
        return universityService.getUniversityById(id);
    }

    @RequestMapping(value="/universities", method= RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<University> addUniversity(@RequestBody University uni){
        universityService.addUniversity(uni);
        return new ResponseEntity<University>(uni, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/universities/{id}", method = RequestMethod.PUT ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<University> updateUniversity(@RequestBody University uni, @PathVariable Long id){
        universityService.updateUniveristy(uni, id);
        return new ResponseEntity<University>(uni, HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value="/universities/{id}", method=RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deleteUniversity(@PathVariable Long id){
        universityService.deleteUniversity(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
