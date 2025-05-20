package com.pbsuperior.fnlist.repositories;

import com.pbsuperior.fnlist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGameRepository extends JpaRepository<Game,Long> {
}
