package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum ServersEnum {
    INSTANCE;

    private final List<String> serversList;

    ServersEnum(){
        serversList = new ArrayList<>();
    }
    public boolean addServer(final String server) {
        if(server.startsWith("http") || server.startsWith("https") && !serversList.contains(server)) {
            serversList.add(server);
            return true;
        }
        return false;
    }
    public List<String> getHttpServers(){
        return serversList.stream().filter(server->server.startsWith("http")).
                collect(Collectors.toUnmodifiableList());
    }
    public List<String> getHttpsServers(){
        return serversList.stream().filter(server->server.startsWith("https")).
                collect(Collectors.toUnmodifiableList());
    }
    public List<String> getServersStaringWith(final String prefix){
        return serversList.stream().filter(server->server.startsWith(prefix)).
                collect(Collectors.toUnmodifiableList());
    }
}
