package com.whateley.University;

import javassist.NotFoundException;
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

    public University getUniversityById(Long id) {
        University uni = universityRepository.findOne(id);
        return uni;
    }

    public void addUniversity(University uniData) {
        University uni = UniversityBuilder
                .anUniversity()
                .withUniId(uniData.getId())
                .withName(uniData.getName())
                .withAddress(uniData.getAddress())
                .withCity(uniData.getCity())
                .withCountry(uniData.getCountry())
                .build();
        universityRepository.save(uni);
    }

    public void deleteUniversity(Long id) {
        universityRepository.delete(id);
    }

    public void updateUniveristy(University uni, Long id) {
        universityRepository.save(uni);
    }


}
