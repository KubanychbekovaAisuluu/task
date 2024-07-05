package model.service;

import model.Agency;
import model.House;

import java.util.List;

public interface AgencyService {
    String addAgency(Agency agency);
    String deleteAgency(Long id);
    String updateAgency(Long id, Agency agency);
    List<Agency> getAllAgency();




}
