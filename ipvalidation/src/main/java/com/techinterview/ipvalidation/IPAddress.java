package com.techinterview.ipvalidation;

public class IPAddress {

    String ipAddress;
    int[] parts;
    public IPAddress(String ipAddress){

        this.ipAddress = ipAddress;
        String[] ipv4Parts = ipAddress.split("\\.");
        this.parts = new int[ipv4Parts.length];

        for(int i = 0 ; i < ipv4Parts.length; i++){
            parts[i] = Integer.parseInt(ipv4Parts[i]);
        }
    }

    public boolean isValid(){

        if(parts.length != 4){
            return false;
        }
        for(Integer part: parts){
            if(part < 0 || part > 255){
                return false;
            }
        }
        return true;
    }

    public  int bitwiseConversion(){
        int convertedNum = 0;

        convertedNum = (1 << 24)*parts[0] + (1 << 16)*parts[1] + (1 << 8)*parts[2] + parts[3];

        return convertedNum;
    }
}
