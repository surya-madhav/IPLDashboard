package dev.surya.ipldashboard.repository;

import dev.surya.ipldashboard.model.Match;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface MatchRepository extends CrudRepository<Match ,Long> {

    List<Match> getByTeam1OrTeam2OrderByDateDesc(String team1 , String team2 , Pageable pageable);

    default List<Match> findLatestMatchesByTeam(String teamName ,int count){
        return getByTeam1OrTeam2OrderByDateDesc(teamName ,teamName , PageRequest.of(0 ,count));
    }
}
