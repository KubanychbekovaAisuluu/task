package model.service.serviceImpl;

import db.DataBase;
import exeption.Exceptions;
import model.Agency;
import model.Customer;
import model.House;
import model.enums.Gender;
import model.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl  implements CustomerService {
    private DataBase dataBase;
    private Long customerID = 1L;


    @Override
    public String addCustomer(Customer customer) {
        customer.setId(customerID++);
        DataBase.customers.add(customer);
        return "Successfully added";
    }

    @Override
    public String deleteCustomer(Long id) {
        try {
            for (Customer customer : DataBase.customers) {
                if (customer.getId().equals(id)) {
                    DataBase.customers.remove(customer);
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
    public String updateCustomer(Long id, Customer customer) {
        try {
            for (Customer customer1 : DataBase.customers) {
                if (customer1.getId().equals(id)) {
                    customer1.setFullName(customer.getFullName());
                    customer1.setPhoneNumber(customer.getPhoneNumber());
                    customer1.setEmail(customer.getEmail());
                    customer1.setGender(customer1.getGender());
                    return "Successfully update";
                }
            }
            throw new Exceptions("Not found customer id");
        } catch (Exceptions exceptions) {
            System.out.println(exceptions.getMessage());
        }
        return null;
    }



    @Override
    public String sortCustomerBeGender(Gender gender) {
        List<Customer> male = new ArrayList<>();
        List<Customer> female = new ArrayList<>();
        try {
            for (Customer customer : DataBase.customers) {
                if (customer.getGender() == Gender.MALE) {
                    male.add(customer);
                    return male;
                } else {
                    female.add(customer);
                    return female;
                }
            }

            throw new Exceptions("Not found");
        } catch (Exceptions exceptions) {
            System.out.println(exceptions.getMessage());
        }
        return null;
    }

    @Override
    public List<Customer> getAllCustomer() {
        return DataBase.customers;

    }
}
