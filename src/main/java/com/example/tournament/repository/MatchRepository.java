package com.example.tournament.repository;

import com.example.tournament.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MatchRepository extends JpaRepository<Match, Long> {

    List<Match> findAllByTournamentId(Long tournamentId);

    void deleteAllByTournamentId(Long tournamentId);

    List<Match> findByFirstParticipantIdOrSecondParticipantId(Long firstParticipantId,
                                                              Long secondParticipantId);

    Optional<Match> findByNextMatchLabelIsNullAndTournamentId(Long tournamentId);
}
