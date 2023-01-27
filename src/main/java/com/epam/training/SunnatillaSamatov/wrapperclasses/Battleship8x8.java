package com.epam.training.SunnatillaSamatov.wrapperclasses;

import java.util.Arrays;


public class Battleship8x8 {
    private final long ships;
    private long shots = 0L;

    public Battleship8x8(final long ships) {
        this.ships = ships;
    }

    public boolean shoot(String shot) {

        int index = position(shot);

        if(shots==0){

            char[] shipsInCharArray = convertLongToCharArray(ships);
            char[] shotsInCharArray = new char[64];
            Arrays.fill(shotsInCharArray,'0');
            shotsInCharArray[index]='1';
            shots = Long.parseUnsignedLong(String.valueOf(shotsInCharArray),2);

            return shipsInCharArray[index] == '1';

        }else {
            char[] shotsInCharArray = convertLongToCharArray(shots);
            char[] shipsInCharArray = convertLongToCharArray(ships);
            shotsInCharArray[index]='1';
            shots = Long.parseUnsignedLong(String.valueOf(shotsInCharArray),2);

            return shipsInCharArray[index] == '1';
        }

    }

    public String state() {

        char[] shotsCharArray = convertLongToCharArray(shots);
        char[] shipsCharArray = convertLongToCharArray(ships);

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<shotsCharArray.length;i++){
                 if (shipsCharArray[i]=='1' && shotsCharArray[i]=='1') sb.append('☒');
            else if (shipsCharArray[i]=='1' && shotsCharArray[i]=='0') sb.append('☐');
            else if (shipsCharArray[i]=='0' && shotsCharArray[i]=='1') sb.append('×');
            else if (shipsCharArray[i]=='0' && shotsCharArray[i]=='0') sb.append('.');

            if(i%8==7 ) {

                sb.append('\n');
            }

        }

        return sb.toString();
    }


    public char[] convertLongToCharArray(long value){

        char[] charArray = Long.toBinaryString(value).toCharArray();
        char[] newCharArray = new char[64];
        Arrays.fill(newCharArray,'0');
        int desPos = Long.numberOfLeadingZeros(value);
        System.arraycopy(charArray,0,newCharArray,desPos,charArray.length);
        return newCharArray;

    }
    public int position(String shot){
        char[] charArray = shot.toCharArray();
        int number = Character.getNumericValue(charArray[1]);
        switch (charArray[0]){
            case 'A':
                return number*8-8;
            case 'B':
                return number*8-7;
            case 'C':
                return number*8-6;
            case 'D':
                return number*8-5;
            case 'E':
                return number*8-4;
            case 'F':
                return number*8-3;
            case 'G':
                return number*8-2;
            case 'H':
                return number*8-1;
            default:
                return 100;
        }


    }

}
