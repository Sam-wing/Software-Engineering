package service;

import entity.RecruitmentList;
import entity.impl.CandidateTeacher;

public interface AdministratorService {

    RecruitmentList downloadRecruitmentList();

    CandidateTeacher chooseCandidateTeacher(String GUID);
}
