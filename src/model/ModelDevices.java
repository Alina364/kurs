package model;

import java.io.*;
import java.util.ArrayList;

public class ModelDevices {

    public ArrayList<Device> deviceArrayList;

    public ModelDevices() {
        deviceArrayList = new ArrayList<>();
        try {
            loadfile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public int getSize(){
        return deviceArrayList.size();
    }

    private int loadfile() throws IOException {

        BufferedReader bf = new BufferedReader(new FileReader("text1"));
        String temp;
        String delimeter = " ";


        String[] subStr = new String[1000];
        temp = bf.readLine();
        while (temp != null) {
            subStr = temp.split(delimeter);

            DeviceComp deviceComp = new DeviceComp();

            deviceComp.deviceName = subStr[0];
            deviceComp.deviceKount = Float.parseFloat(subStr[1]);
            deviceComp.devicePower = Float.parseFloat(subStr[2]);
            deviceComp.deviceTime = Float.parseFloat(subStr[3]);

            for (int i = 4; i < subStr.length; i++) {
                deviceComp.deviceListPower.add(new Float(subStr[i]));
            }

            deviceArrayList.add(deviceComp);
            System.out.println(deviceComp.deviceKount);
            System.out.println(deviceComp.deviceName);
            System.out.println(deviceComp.deviceTime);
            System.out.println(deviceComp.deviceListPower);
            temp = bf.readLine();
        }

        DeviceAppliances deviceAppliances = new DeviceAppliances();
        deviceAppliances.deviceName = subStr[0];
        deviceAppliances.deviceKount = Float.parseFloat(subStr[1]);
        deviceAppliances.devicePower = Float.parseFloat(subStr[2]);
        deviceAppliances.deviceTime = Float.parseFloat(subStr[3]);
        for (int i = 4; i < subStr.length; i++) {
            deviceAppliances.deviceListPower.add(new Float((subStr[i])));
        }
        deviceArrayList.add(deviceAppliances);
        System.out.println(deviceAppliances.deviceKount);
        System.out.println(deviceAppliances.deviceName);
        System.out.println(deviceAppliances.deviceTime);


        DevicePowerTool devicePowerTool = new DevicePowerTool();
        devicePowerTool.deviceName = subStr[0];
        devicePowerTool.deviceKount = Float.parseFloat(subStr[1]);
        devicePowerTool.devicePower = Float.parseFloat(subStr[2]);
        devicePowerTool.deviceTime = Float.parseFloat(subStr[3]);
        for (int i = 4; i < subStr.length; i++) {
            devicePowerTool.deviceListPower.add(new Float((subStr[i])));
        }
        System.out.println(devicePowerTool.deviceKount);
        System.out.println(devicePowerTool.deviceName);
        System.out.println(devicePowerTool.deviceTime);


        DeviceLighting deviceLighting = new DeviceLighting();
        deviceLighting.deviceName = subStr[0];
        deviceLighting.deviceKount = Float.parseFloat(subStr[1]);
        deviceLighting.devicePower = Float.parseFloat(subStr[2]);
        deviceLighting.deviceTime = Float.parseFloat(subStr[3]);
        for (int i = 4; i < subStr.length; i++) {
            deviceLighting.deviceListPower.add(new Float((subStr[i])));
        }
        System.out.println(deviceLighting.deviceKount);
        System.out.println(deviceLighting.deviceName);
        System.out.println(deviceLighting.deviceTime);

        return 1;
    }


    public float calc() {

        float calcSUM = 0;
        for (int i = 0; i < deviceArrayList.size(); i++) {

            calcSUM += deviceArrayList.get(i).deviceKount * deviceArrayList.get(i).devicePower * deviceArrayList.get(i).deviceTime;
            System.out.println(calcSUM);
        }
        return calcSUM;
    }


}
