package com.realdolmen.ood020.factorymethod;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public class VehicleCreatorImp implements VehicleCreator {
    @Override
    public Vehicle createVehicle(boolean type, int noPass, String reg, int berths) {
        if (type) {
            return new Vehicle(noPass, reg);
        } else {
            return new Truck(noPass, reg, berths);// Bij het
        }
    }
}

