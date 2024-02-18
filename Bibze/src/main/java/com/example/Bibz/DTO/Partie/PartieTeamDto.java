package com.example.Bibz.DTO.Partie;

import com.example.Bibz.Enums.stateGame;
import com.example.Bibz.model.Team;

import java.util.Set;

public class PartieTeamDto {
    private Long id;
    private int nbr_manche;
    private stateGame state;
    private Set<Team> teams;
}
