package model.service.serviceImpl;

import db.DataBase;
import exeption.Exceptions;
import model.Agency;
import model.House;
import model.HouseType;
import model.enums.Gender;
import model.service.HouseService;

import java.util.ArrayList;
import java.util.List;

public class HouseServiceImpl implements HouseService {
    private DataBase dataBase;
    private Long houseID = 1L;
    @Override
    public String addHouse(House house) {
        house.setId(houseID++);
        DataBase.houses.add(house);
        return "Successfully added";
    }

    @Override
    public String deleteHouse(Long id) {
        try {
            for (House house : DataBase.houses) {
                if (house.getId().equals(id)) {
                    DataBase.houses.remove(house);
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
    public String updateHouse(Long id, House house) {
        try {
            for (House house1 : DataBase.houses) {
                if (house1.getId().equals(id)) {
                    house1.setAddress(house.getAddress());
                    house1.setHouseType(house.getHouseType());
                    house1.setPrice(house.getPrice());
                    house1.setDescription(house.getDescription());
                    house1.setIsBooked(house.getIsBooked());
                    return "Successfully update";
                }
            }
            throw new Exceptions("Not found group id");
        } catch (Exceptions exceptions) {
            System.out.println(exceptions.getMessage());
        }
        return null;
    }

    @Override
    public Agency getAllHouseByAgencyId(Long agencyId) {
        try {
            for (Agency agency : DataBase.agencies) {
                if ((agency.getId().equals(agencyId))) {
                    return agency;
                }

            }

            throw new Exceptions("Not found agency id");
        } catch (Exceptions exceptions) {
            System.out.println(exceptions.getMessage());
        }
        return null;
    }

    @Override
    public String filterAgencyByHouseType(String houseType) {
        List<Agency> filteredAgencies = new ArrayList<>();
        for (Agency agency : DataBase.agencies) {
            for (House house : agency.getHouses()) {
                if (house.getHouseType() == houseType) {
                    filteredAgencies.add(agency);
                }
                return "successfully";
            }
        } return null;
    }

    @Override
    public String sortCustomerBeGender(Gender gender) {
        return null;
    }

    @Override
    public List<House> getAllHouse() {
        return DataBase.houses;
    }
}
