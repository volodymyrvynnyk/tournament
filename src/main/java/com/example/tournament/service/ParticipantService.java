package com.example.tournament.service;

import com.example.tournament.dto.form.ParticipantsAddForm;
import com.example.tournament.dto.response.ParticipantDto;

import java.util.List;

public interface ParticipantService {

    List<ParticipantDto> findAllByTournamentId(Long tournamentId);

    int countByTournamentId(Long tournamentId);

    ParticipantDto findById(Long tournamentId, Long participantId);

    List<ParticipantDto> createAll(Long tournamentId, ParticipantsAddForm participantsAddForm);

    void delete(Long tournamentId, Long participantId);

    void deleteAllByTournamentId(Long tournamentId);

}
