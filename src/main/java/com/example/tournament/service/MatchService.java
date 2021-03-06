package com.example.tournament.service;

import com.example.tournament.dto.form.MatchUpdateForm;
import com.example.tournament.dto.response.MatchDto;
import com.example.tournament.dto.response.MatchListDto;
import com.example.tournament.model.Match;
import com.example.tournament.model.Participant;
import com.example.tournament.model.Tournament;

import java.util.List;
import java.util.Optional;


public interface MatchService {

    MatchListDto findMatchListByTournamentId(Long tournamentId);

    MatchDto findById(Long tournamentId, Long matchId);

    MatchDto startMatch(Long tournamentId, Long matchId);

    MatchDto updateMatch(Long tournamentId, Long id, MatchUpdateForm matchUpdateForm);

    void deleteAllByTournamentId(Long tournamentId);

    Optional<Match> findUncompletedMatchByParticipantId(Long tournamentId, Long participantId);

    void disqualifyParticipantById(Match match, Long participantId);

    Match findFinalMatchByTournamentId(Long tournamentId);

    List<Match> generateMatches(List<Participant> participants, Tournament tournament);
}
