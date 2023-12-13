package com.example.demo.sql;

public class persons {
    private int ID_P;
    private String Lastname;
    private String Firstname;
    private String Address;
    private String City;

    public persons() {
    }

    public persons(int ID_P, String Lastname, String Firstname, String Address, String City) {
        this.ID_P = ID_P;
        this.Lastname = Lastname;
        this.Firstname = Firstname;
        this.Address = Address;
        this.City = City;
    }

    /**
     * 获取
     * @return ID_P
     */
    public int getID_P() {
        return ID_P;
    }

    /**
     * 设置
     * @param ID_P
     */
    public void setID_P(int ID_P) {
        this.ID_P = ID_P;
    }

    /**
     * 获取
     * @return Lastname
     */
    public String getLastname() {
        return Lastname;
    }

    /**
     * 设置
     * @param Lastname
     */
    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    /**
     * 获取
     * @return Firstname
     */
    public String getFirstname() {
        return Firstname;
    }

    /**
     * 设置
     * @param Firstname
     */
    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    /**
     * 获取
     * @return Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * 设置
     * @param Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * 获取
     * @return City
     */
    public String getCity() {
        return City;
    }

    /**
     * 设置
     * @param City
     */
    public void setCity(String City) {
        this.City = City;
    }

    public String toString() {
        return "persons{ID_P = " + ID_P + ", Lastname = " + Lastname + ", Firstname = " + Firstname + ", Address = " + Address + ", City = " + City + "}";
    }
}
