package ru.geekbrains.hw1_1.team;

import ru.geekbrains.hw1_1.Status;

public class Team {
    private TeamMember[] members;
    private final String nameTeam;

    public Team(String nameTeam, TeamMember... members) {
        this.members = members;
        this.nameTeam = nameTeam;
    }

    public void showResults() {
        printDivider();
        System.out.println("Полосу препятствий преодолевала команда: " + nameTeam);
        for (TeamMember member: members) {
            if (member.getStatus() == Status.NoPassedDistance) {
                showResultMemberNoPassed(member);
            }
            else {
                showResultMemberPassed(member);
            }
        }
        printDivider();
    }

    private void showResultMemberNoPassed(TeamMember member) {
        printDivider();
        System.out.println(member.getNameTeamMember() + " Не прошел полосу препятствий");
    }

    private void showResultMemberPassed(TeamMember member) {
        printDivider();
        System.out.println(member.getNameTeamMember() + " Успешно прошел полосу препятствий");
    }

    public TeamMember[] getMembers() {
        return members;
    }

    private void printDivider() {
        System.out.println("-----------------------------------------------------------");
    }
}

