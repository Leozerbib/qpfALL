package com.example.Bibz.DTO.Partie;

import com.example.Bibz.Enums.stateGame;

import java.time.LocalDate;

public class PartieInfoDto {
    private Long id;
    private LocalDate endDate;
    private LocalDate startDate;
    private int nbr_manche;
    private stateGame state;
}
