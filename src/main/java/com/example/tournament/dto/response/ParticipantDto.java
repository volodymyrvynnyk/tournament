package com.example.tournament.dto.response;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParticipantDto {

    private Long id;

    private Long tournamentId;

    private String name;

}
