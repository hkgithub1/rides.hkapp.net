package net.hkapp.rides.rides;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RideService {
    @Autowired
    RideDao rideDao;

    public ResponseEntity<List<Ride>> getAllRides() {
        try {
            return new ResponseEntity<>(rideDao.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }
    public ResponseEntity<?> getByRideId(Integer id) {
        try {
            return new ResponseEntity<>(rideDao.findById(id), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addRide(Ride ride) {
        rideDao.save(ride);
        return new ResponseEntity<>("success",HttpStatus.CREATED);
    }
}


