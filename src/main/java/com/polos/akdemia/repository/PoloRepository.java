package com.polos.akdemia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polos.akdemia.model.Polo;

public interface PoloRepository extends JpaRepository<Polo, Long> {
	
	// JpaRepository ya te da métodos como findAll(), findById(), save(), delete()

}
