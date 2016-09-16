package be.vdab.spring.mvc.repository;

import be.vdab.spring.mvc.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {
}
