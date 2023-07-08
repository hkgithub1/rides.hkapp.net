package net.hkapp.rides.rides;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rides")
public class RideController {

    @Autowired
    RideService rideService;

    @CrossOrigin
    @GetMapping("allRides")
    public ResponseEntity<List<Ride>> getAllRides(){
        return rideService.getAllRides();
    }

    @CrossOrigin
    @GetMapping("ride/{id}")
    public ResponseEntity<?> getByRideId(@PathVariable Integer id){
        return rideService.getByRideId(id);
    }    

    @CrossOrigin
    @PostMapping("addRide")
    public ResponseEntity<String> addRide(@RequestBody Ride ride){
        return rideService.addRide(ride);
    }

}
