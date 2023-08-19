package ru.netology.springbootdemo;

public class DevProfileImpl implements SystemProfile {

    @Override
    public String getProfile() {

        return "Current profile is dev";
    }
}
