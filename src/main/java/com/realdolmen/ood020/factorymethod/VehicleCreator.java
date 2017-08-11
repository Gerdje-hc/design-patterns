package com.realdolmen.ood020.factorymethod;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public interface VehicleCreator {
    Vehicle createVehicle(boolean type,int noPass, String reg, int berths);

}
