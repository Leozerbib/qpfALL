package com.example.Bibz.service;

import com.example.Bibz.DTO.Partie.PArtieCreateDto;
import com.example.Bibz.DTO.Partie.PartieDto;
import com.example.Bibz.DTO.Partie.PartieTeamDto;

public interface PartieService {
    public PartieDto savePartie(PArtieCreateDto partieCreateDto);
    public PartieDto updatePArtie(Long id);
    public void deletePartie(Long id);
    public PartieTeamDto findById(Long id);

}
