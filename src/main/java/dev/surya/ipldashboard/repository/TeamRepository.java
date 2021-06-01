package dev.surya.ipldashboard.repository;

import dev.surya.ipldashboard.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team ,Long> {

    Team findByTeamName(String teamName);
}
