package model;

import java.util.ArrayList;

public class DevicePowerTool extends Device{

    public DevicePowerTool(String deviceName, float deviceKount, float devicePower, float deviceTime, ArrayList<Float> deviceListPower){
        this.deviceName=deviceName;
        this.deviceKount=deviceKount;
        this.devicePower=devicePower;
        this.deviceTime=deviceTime;
        this.deviceListPower=deviceListPower;
    }


    public DevicePowerTool(){
        deviceName="11";
        deviceKount=1;
        devicePower=1;
        deviceTime=1;
        deviceListPower.add(new Float(1.0));
        deviceListPower.add(new Float(2.0));
        deviceListPower.add(new Float(3.0));
        deviceListPower.add(new Float(4.0));
    }
}
