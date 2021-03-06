package com.example.tournament.dto.response;

import com.example.tournament.model.EventStatus;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class TournamentDto {

    private Long id;

    private String title;

    private int numberOfParticipants;

    private int maxNumberOfParticipants;

    private int numberOfSingleEliminationMatches;

    private EventStatus status;
}
