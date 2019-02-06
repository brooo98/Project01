package Project00;

public class TeamTeam  extends Project00.Team {

    public TeamTeam( ) {
        super("TeamTeam");
        createTeamMembers();
    }

    @Override
    public void createTeamMembers() {
        members.add(new Project00.AdamsMember());
        members.add(new Project00.SchirripaMember());

    }
}

