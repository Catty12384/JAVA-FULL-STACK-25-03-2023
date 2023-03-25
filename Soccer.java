class Soccer extends Sports
{
    @Override
    String getName()
    {
        return "Soccer Class";
    }
    void getNumberOfTeamMembers()
    {
        System.out.println( "Each team has 11 players in " + getName() );
    }
    public static void main(String[] args) 
    {
        Sports d = new Sports();
        System.out.println(d.getName());
        d.getNumberOfTeamMembers();
        Soccer s = new Soccer();
        System.out.println(s.getName());
        s.getNumberOfTeamMembers();
    }
}

