package com.company.generators;

import static com.company.randomizers.NumberRandomizer.getRandomNumberInRange;
import static com.company.randomizers.NameRandomizer.generateName;
import com.company.tables.Team;
import java.util.ArrayList;
import java.util.List;

public final class TeamGenerator {
    
    public static Team generateTeam(int minId, int maxId, int minNameLength, int maxNameLength, int minNumberOfMembers, int maxNumberOfMembers) {
        int teamId = getRandomNumberInRange(minId, maxId);
        String name = generateName(minNameLength, maxNameLength);
        int numberOfMembers = getRandomNumberInRange(minNumberOfMembers, maxNumberOfMembers);
        return new Team(teamId, name, numberOfMembers);
    }
    
    public static List<Team> generateListOfTeams(int numberOfTeams, int minId, int maxId, int minNameLength, int maxNameLength, int minNumberOfMembers, int maxNumberOfMembers) {
        List<Team> teams  = new ArrayList<>();
        for(int i=0; i<numberOfTeams; i++) {
            teams.add(generateTeam(minId, maxId, minNameLength, maxNameLength, minNumberOfMembers, maxNumberOfMembers));
        }
        return teams;
    }
    
}
