package model.service;

import model.Agency;
import model.Customer;
import model.House;
import model.HouseType;
import model.enums.Gender;

import java.util.List;

public interface HouseService {
    String addHouse(House house);
    String deleteHouse(Long id);
    String updateHouse(Long id, House house);
    Agency getAllHouseByAgencyId(Long agencyId);
    String filterAgencyByHouseType(String houseType);
    String sortCustomerBeGender(Gender gender);
    List<House> getAllHouse();
}
