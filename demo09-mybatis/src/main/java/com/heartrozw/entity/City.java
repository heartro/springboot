package com.heartrozw.entity;

public class City {
    private Long id;
    private Long province;
    private String name;
    private String fixLetter;
    private String namePY;
    private Integer order;

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", name='" + name + '\'' +
                ", fixLetter='" + fixLetter + '\'' +
                ", namePY='" + namePY + '\'' +
                ", order=" + order +
                '}';
    }

    public City() {
    }
    public City(Long province, String name, String fixLetter, String namePY, Integer order) {
        this.province = province;
        this.name = name;
        this.fixLetter = fixLetter;
        this.namePY = namePY;
        this.order = order;
    }
    public City(Long id, Long province, String name, String fixLetter, String namePY, Integer order) {
        this.id = id;
        this.province = province;
        this.name = name;
        this.fixLetter = fixLetter;
        this.namePY = namePY;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProvince() {
        return province;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFixLetter() {
        return fixLetter;
    }

    public void setFixLetter(String fixLetter) {
        this.fixLetter = fixLetter;
    }

    public String getNamePY() {
        return namePY;
    }

    public void setNamePY(String namePY) {
        this.namePY = namePY;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
