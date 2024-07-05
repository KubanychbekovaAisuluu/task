package model.service.serviceImpl;

import db.DataBase;
import exeption.Exceptions;
import model.Agency;
import model.House;
import model.service.AgencyService;

import java.util.List;

public class AgenceServiceImpl implements AgencyService {
    private DataBase dataBase;
    private Long agencyID = 1L;
    @Override
    public String addAgency(Agency agency) {
        agency.setId(agencyID++);
        DataBase.agencies.add(agency);
        return "Successfully added";
    }

    @Override
    public String deleteAgency(Long id) {
        try {
            for (Agency agency : DataBase.agencies) {
                if (agency.getId().equals(id)) {
                    DataBase.agencies.remove(agency);
                    return "successfully added";
                }
            }
            throw new Exceptions("Not found house id");
        } catch (Exceptions exceptions) {
            System.out.println(exceptions.getMessage());
        }
        return null;
    }

    @Override
    public String updateAgency(Long id, Agency agency) {
        try {
            for (Agency agency1 : DataBase.agencies) {
                if (agency1.getId().equals(id)) {
                    agency1.setName(agency.getName());
                    agency1.setAddress(agency.getAddress());
                    return "Successfully update";
                }
            }
            throw new Exceptions("Not found agency id");
        } catch (Exceptions exceptions) {
            System.out.println(exceptions.getMessage());
        }
        return null;
    }

    @Override
    public List<Agency> getAllAgency() {
        return DataBase.agencies;
    }
}
