package com.whateley.University;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    public List<University> getAllUniversities() {
        List<University> unis = new ArrayList<>();
        universityRepository.findAll()
                .forEach(unis :: add);
        return unis;
    }

    public University getUniversityById(String id) {
        return universityRepository.findOne(id);
    }

    public void addUniversity(University uni) {
        universityRepository.save(uni);
    }

    public void deleteUniversity(String id) {
        universityRepository.delete(id);
    }

    public void updateUniveristy(University uni, String id) {
        universityRepository.save(uni);
    }
}
