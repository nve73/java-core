package ru.geekbrains.hw1_1.obstacleCourse;

import ru.geekbrains.hw1_1.Status;
import ru.geekbrains.hw1_1.team.Team;
import ru.geekbrains.hw1_1.team.TeamMember;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (TeamMember member: team.getMembers()) {
            for (Obstacle obs :obstacles) {
                obs.goChallenge(member);
                if (member.getStatus()== Status.NoPassedDistance){
                    break;
                }
            }
        }
    }

}
