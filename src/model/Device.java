package model;

import java.util.ArrayList;

public abstract class Device {

    public String deviceName;
    public float deviceKount;
    public float devicePower;
    public float deviceTime;
    public ArrayList<Float> deviceListPower;

    public Device() {
       //инициализировть значениями
       deviceListPower=new ArrayList<>();

    }


    public float getDeviceKount() {
        return deviceKount;
    }

    public float getDevicePower() {
        return devicePower;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public float getDeviceTime() {
        return deviceTime;
    }

    public void setDeviceKount(float deviceKount) {
        this.deviceKount = deviceKount;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setDevicePower(float devicePower) {
        this.devicePower = devicePower;
    }

    public void setDeviceTime(float deviceTime) {
        this.deviceTime = deviceTime;
    }

}
