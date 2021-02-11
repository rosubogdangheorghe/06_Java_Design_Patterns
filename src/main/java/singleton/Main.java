package singleton;

public class Main {
    public static void main(String[] args) {

        ServersLazy servers = ServersLazy.getInstance();
        ServersLazy servers1 = ServersLazy.getInstance();
        System.out.println(servers == servers1);
        servers.addServer("http//....111");
        servers.addServer("https//...222");
        System.out.println(servers.getServersStartingWith("http"));
        System.out.println(servers.getHttpsServers());

        ServersEager serversEager = ServersEager.getInstance();
        ServersEager serversEager1 = ServersEager.getInstance();
        System.out.println(serversEager == serversEager1);

        ServersEnum serversEnum = ServersEnum.INSTANCE;
        ServersEnum serversEnum1 = ServersEnum.INSTANCE;
        System.out.println(serversEnum == serversEnum1);
    }
}
