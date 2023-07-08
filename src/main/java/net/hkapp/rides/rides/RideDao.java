package net.hkapp.rides.rides;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideDao extends JpaRepository<Ride, Integer> {

}
