package model;

public class House {
    private Long id;
    private String address;
    private String houseType;
    private int price;
    private String description;
    private String isBooked;

    public House(Long id, String address, String houseType, int price, String description, String isBooked) {
        this.id = id;
        this.address = address;
        this.houseType = houseType;
        this.price = price;
        this.description = description;
        this.isBooked = isBooked;
    }

    public House(String address, String houseType, int price, String description, String isBooked) {
        this.address = address;
        this.houseType = houseType;
        this.price = price;
        this.description = description;
        this.isBooked = isBooked;
    }

    public House() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsBooked() {
        return isBooked;
    }

    public void setIsBooked(String isBooked) {
        this.isBooked = isBooked;
    }

    @Override
    public String toString() {
        return "\n House{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", houseType=" + houseType +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", isBooked='" + isBooked + '\'' +
                '}';
    }
}
