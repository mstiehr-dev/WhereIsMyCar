package com.mstiehr_dev.whereismycar.net.api;


import com.mstiehr_dev.whereismycar.data.Car;
import com.mstiehr_dev.whereismycar.data.Driver;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;

public interface CarService
{
    @GET("/drivers/{driverId}/cars")
    List<Car> listCars(@Path("driverId") String driverId);

    @GET("/drivers/all")
    List<Driver> listDrivers();
}
