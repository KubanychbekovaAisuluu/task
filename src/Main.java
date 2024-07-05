import model.Agency;
import model.Customer;
import model.House;
import model.enums.Gender;
import model.service.AgencyService;
import model.service.CustomerService;
import model.service.HouseService;
import model.service.serviceImpl.AgenceServiceImpl;
import model.service.serviceImpl.CustomerServiceImpl;
import model.service.serviceImpl.HouseServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HouseService houseService = new HouseServiceImpl();
        House house = new House("chyi 152","Cottege", 1500, "cottage good!","yes");
        House house1 = new House("jibek joly 412","Cottege", 1300, "cottage good!","yes");
        House house2 = new House("togolok moldo 154","Cottege", 1000, "cottage good!","yes");
        System.out.println(houseService.addHouse(house));
        System.out.println(houseService.addHouse(house1));
        System.out.println(houseService.addHouse(house2));
        System.out.println(houseService.getAllHouse());


        System.out.println(houseService.deleteHouse(3L));
        System.out.println(houseService.getAllHouse());

        System.out.println(houseService.getAllHouseByAgencyId(1L));

        houseService.filterAgencyByHouseType("Cottage");


        System.out.println(houseService.updateHouse(1L, house));
        System.out.println(houseService.getAllHouse());

        AgencyService agencyService = new AgenceServiceImpl();
        Agency agency = new Agency("Alim","naryn 144");
        Agency agency1 = new Agency("Akyl","boctok-5");
        Agency agency2 = new Agency("Aibek","naryn 14");
        System.out.println(agencyService.addAgency(agency));
        System.out.println(agencyService.addAgency(agency1));
        System.out.println(agencyService.addAgency(agency2));
        System.out.println(agencyService.getAllAgency());

        System.out.println(agencyService.deleteAgency(2L));
        System.out.println(agencyService.getAllAgency());

        System.out.println(agencyService.updateAgency(1L, agency2));
        System.out.println(agencyService.getAllAgency());

        CustomerService customerService =new CustomerServiceImpl();
        Customer customer = new Customer("Asss ssss", "784545","@asdfghj", Gender.MALE);
        Customer customer1 = new Customer("KKKK ssss", "7782545","@jjjjjj", Gender.FEMALE);
        Customer customer2 = new Customer("LLL ssss", "78555","@akkkj", Gender.MALE);
        System.out.println(customerService.addCustomer(customer));
        System.out.println(customerService.addCustomer(customer1));
        System.out.println(customerService.addCustomer(customer2));
        System.out.println(customerService.getAllCustomer());

        System.out.println(customerService.deleteCustomer(1L));
        System.out.println(customerService.getAllCustomer());

        System.out.println(customerService.updateCustomer(2L, customer1));
        System.out.println(customerService.getAllCustomer());

        System.out.println(customerService.sortCustomerBeGender(Gender.MALE));
        System.out.println(customerService.getAllCustomer());

    }
}