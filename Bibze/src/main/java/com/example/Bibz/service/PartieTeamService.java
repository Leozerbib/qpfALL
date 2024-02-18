package com.example.Bibz.service;

import com.example.Bibz.model.Partie;
import com.example.Bibz.model.Partie_team;
import com.example.Bibz.model.Team;

import java.util.Set;

public interface PartieTeamService {
    public Partie_team savePartieTeam(Partie_team partieTeam);
    public Partie_team updatePArtiTeam(Partie_team partieTeam);
    public void deltePArtieTeam(Partie_team partieTeam);
    public Set<Team> findTeamByPArtieID(Long id);
    public Set<Partie> findPartieByTeamID(Long id);
    public boolean checkIfExist(Long id);

    public Partie_team checkIfExistDouble(Long id, Long idx);
}
