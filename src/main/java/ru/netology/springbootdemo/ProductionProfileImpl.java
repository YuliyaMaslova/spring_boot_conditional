package ru.netology.springbootdemo;

public class ProductionProfileImpl implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
