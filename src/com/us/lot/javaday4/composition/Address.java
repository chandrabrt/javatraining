package com.us.lot.javaday4.composition;

/*
  @author : welcome-to-hell
  @since : 2021-01-15
*/
public class Address {

    private String province;
    private String district;
    private Integer wardNumber;
    private String tole;

    public Address(String province, String district, Integer wardNumber, String tole) {
        this.province = province;
        this.district = district;
        this.wardNumber = wardNumber;
        this.tole = tole;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getWardNumber() {
        return wardNumber;
    }

    public void setWardNumber(Integer wardNumber) {
        this.wardNumber = wardNumber;
    }

    public String getTole() {
        return tole;
    }

    public void setTole(String tole) {
        this.tole = tole;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", wardNumber=" + wardNumber +
                ", tole='" + tole + '\'' +
                '}';
    }
}
