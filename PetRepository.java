package com.controlePet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.controlePet.PetEntity;

public interface PetRepository extends JpaRepository<PetEntity, Long>{

}
