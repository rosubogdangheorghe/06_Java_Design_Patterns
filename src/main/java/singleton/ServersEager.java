package singleton;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ServersEager {

    private static final ServersEager INSTANCE = new ServersEager();

    public static ServersEager getInstance(){
        return INSTANCE;
    }

    private Set<String> serversList;

    private ServersEager(){
        serversList =new LinkedHashSet<>();
    }
    public boolean addServer(final String server) {
        if(server.startsWith("http") || server.startsWith("https")) {
            serversList.add(server);
            return true;
        } else {
            return false;
        }
    }
    public Set<String> getServerStartingWith(String prefix) {
        return serversList.stream().filter(server->server.startsWith(prefix)).
                collect(Collectors.toUnmodifiableSet());
    }
    public Set<String> getHttpsServers(){
        return serversList.stream().filter(server->server.startsWith("https")).
                collect(Collectors.toUnmodifiableSet());
    }
}
