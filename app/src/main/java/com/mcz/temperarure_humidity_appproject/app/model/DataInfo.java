package com.mcz.temperarure_humidity_appproject.app.model;

import java.io.Serializable;

/**
 * Created by mcz on 2018/1/10.
 */

public class DataInfo implements Serializable{
    private String DeviceId ;
    private String DeviceName;
    private String DeviceStatus;
    private String DeviceType;
    private String Devicetemperature;
    private String Devicehumidity;
    private String error_code;
    ////////////////////////////////
    private String lasttime;
    private String Devicetimestamp;


    public String Devicelight2;


    public String Devicelight;
    public String Light_LUX;



    public void setDevicelight2(String devicelight2) {
        Devicelight2 = devicelight2;
    }   //光敏板led

    public String getDevicelight2() {
        return Devicelight2;
    }

    public void setLight_LUX(String light_LUX) {
        Light_LUX = light_LUX;
    }


    public String getLight_LUX() {
        return Light_LUX;
    }



    public void setDevicelight(String dv_light) {   //板载led
        Devicelight = dv_light;
    }

    public String getDevicelight() {
        return Devicelight;
    }


    public void setDevicetemperature(String dv_temperature) {
        Devicetemperature = dv_temperature;
    }

    public String getDevicetemperature() {
        return Devicetemperature;
    }


    public void setDevicehumidity(String dv_humidity) {
        Devicehumidity = dv_humidity;
    }

    public String getDevicehumidity() {
        return Devicehumidity;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }



    public String getLasttime() {
        return lasttime;
    }

    public void setLasttime(String lasttime) {
        this.lasttime = lasttime;
    }

    public String getDeviceName() {
        return DeviceName;
    }

    public void setDeviceName(String deviceName) {
        DeviceName = deviceName;
    }


    public String getDeviceStatus() {
        return DeviceStatus;
    }

    public void setDevicetimestamp(String timestamp) {
        Devicetimestamp = timestamp;
    }



    public String getDevicetimestamp() {
        return Devicetimestamp;
    }

    public void setDeviceStatus(String deviceStatus) {
        DeviceStatus = deviceStatus;
    }

    public String getDeviceType() {
        return DeviceType;
    }

    public void setDeviceType(String deviceType) {
        DeviceType = deviceType;
    }

    public String getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(String deviceId) {
        this.DeviceId = deviceId;
    }
    public String getGatewayId() {
        return DeviceId;
    }

    public void setGatewayId(String deviceId) {
        this.DeviceId = deviceId;
    }
}
