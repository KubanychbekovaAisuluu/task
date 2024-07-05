package model.service;

import model.Agency;
import model.Customer;
import model.enums.Gender;

import java.util.List;

public interface CustomerService {
    String addCustomer(Customer customer);
    String deleteCustomer(Long id);
    String updateCustomer(Long id, Customer customer);
    String sortCustomerBeGender(Gender gender);
    List<Customer> getAllCustomer();


}
