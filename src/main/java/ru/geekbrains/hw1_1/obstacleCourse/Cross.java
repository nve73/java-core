package ru.geekbrains.hw1_1.obstacleCourse;

import ru.geekbrains.hw1_1.team.TeamMember;

public class Cross extends Obstacle {

    public Cross(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.run(super.getDifficulty());
    }

}