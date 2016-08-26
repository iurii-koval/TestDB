package com.company.tables;

public class Team {
    
    private int id;
    private String teamName;
    private int numberOfMembers;

    public Team(int id, String teamName, int numberOfMembers) {
        this.id = id;
        this.teamName = teamName;
        this.numberOfMembers = numberOfMembers;
    }
    
    public int getId() {
        return id;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }
    
    
        
        
    
}
