package org.trk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.trk.entity.Position;

import java.util.Optional;

public interface PositionRepository extends JpaRepository<Position, Integer> {

}
