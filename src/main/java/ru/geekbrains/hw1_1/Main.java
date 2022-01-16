package ru.geekbrains.hw1_1;

import ru.geekbrains.hw1_1.obstacleCourse.Course;
import ru.geekbrains.hw1_1.obstacleCourse.Cross;
import ru.geekbrains.hw1_1.obstacleCourse.Fight;
import ru.geekbrains.hw1_1.obstacleCourse.Swimming;
import ru.geekbrains.hw1_1.team.Team;
import ru.geekbrains.hw1_1.team.TeamMember;

public class Main {

    public static void main(String[] args) {
        Team dreamTeam = new Team("Dreamteam",
                new TeamMember("A", 6),
                new TeamMember("B", 6),
                new TeamMember("C", 6),
                new TeamMember("D" ,6));

        Course course = new Course(new Cross(5), new Swimming(5), new Fight(7));
        course.doIt(dreamTeam);

    }
}
