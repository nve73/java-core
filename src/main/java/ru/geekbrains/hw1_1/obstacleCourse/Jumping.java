package ru.geekbrains.hw1_1.obstacleCourse;

import ru.geekbrains.hw1_1.team.TeamMember;

public class Jumping extends Obstacle {
    public Jumping(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.jump(super.getDifficulty());
    }
}
