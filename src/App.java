public class App {
    public static void main(String[] args) throws Exception {
        PCBuilder builder=new PCBuilder();
        PCDirector GamingPCDirector = new GamingPCDirector(builder);
        GamingPCDirector.directorPC();
        PC gamingPC = builder.build();
        System.out.println(gamingPC);

        PCDirector offDirector = new OfficePCDirector(builder);
        offDirector.directorPC();
        PC officePC = builder.build();
        System.out.println(officePC);
    }
}
