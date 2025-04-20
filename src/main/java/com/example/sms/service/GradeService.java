package com.example.sms.service;

import com.example.sms.model.Grade;
import com.example.sms.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GradeService {
    @Autowired
    private GradeRepository gradeRepository;

    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }

    public Optional<Grade> getGradeById(Long id) {
        return gradeRepository.findById(id);
    }

    public Grade createGrade(Grade grade) {
        return gradeRepository.save(grade);
    }

    public Grade updateGrade(Long id, Grade grade) {
        Optional<Grade> gradeOptional = gradeRepository.findById(id);
        if (gradeOptional.isPresent()) {
            Grade existingGrade = gradeOptional.get();
            existingGrade.setGrade(grade.getGrade());
            existingGrade.setStudent(grade.getStudent());
            existingGrade.setCourse(grade.getCourse());
            return gradeRepository.save(existingGrade);
        }
        return null; // Or throw an exception
    }

    public void deleteGrade(Long id) {
        gradeRepository.deleteById(id);
    }
}
