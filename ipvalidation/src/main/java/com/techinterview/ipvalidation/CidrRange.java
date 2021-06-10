package com.techinterview.ipvalidation;

public class CidrRange {

    String cidrRange;
    IPAddress ip;
    int bitsToIgnore = 32;

    public CidrRange(String cidrRange){
        this.cidrRange = cidrRange;
        String[] cidrParts = cidrRange.split("/");
        ip = new IPAddress(cidrParts[0]);
        if(cidrParts.length > 1 && !cidrParts[1].equals("")) {
            bitsToIgnore = Integer.parseInt(cidrParts[1]);
        }

    }

    public boolean isValidCidrMatching(IPAddress ipAddress){

        int convertedIp = ipAddress.bitwiseConversion();
        int convertedCidr = this.ip.bitwiseConversion();

        convertedIp = ((convertedIp >> bitsToIgnore) << bitsToIgnore);
        convertedCidr = ((convertedCidr >> bitsToIgnore) << bitsToIgnore);

        return convertedCidr == convertedIp;
    }
    public boolean isValid() {
        if(bitsToIgnore < 0 || bitsToIgnore > 32 || !this.ip.isValid())
            return false;
        return true;
    }
}
