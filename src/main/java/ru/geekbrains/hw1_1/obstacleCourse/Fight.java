package ru.geekbrains.hw1_1.obstacleCourse;

import ru.geekbrains.hw1_1.team.TeamMember;

public class Fight extends Obstacle {
    public Fight(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.fight(super.getDifficulty());
    }
}

