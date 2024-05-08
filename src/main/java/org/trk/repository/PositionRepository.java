package org.trk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.trk.entity.Position;

import java.util.Optional;

public interface PositionRepository extends JpaRepository<Position, Integer> {
    Optional<Position> findById(Integer id);
    Optional<Position> findByCode(String code);

    @Override
    Position save(Position entity);
}
