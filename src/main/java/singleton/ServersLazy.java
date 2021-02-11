package singleton;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ServersLazy {
    private static ServersLazy INSTANCE;

    public static ServersLazy getInstance(){
        if(INSTANCE == null) {
            INSTANCE = new ServersLazy();
        }
        return INSTANCE;
    }
    //multithreaded app
//    public static ServersLazy getInstance() {
//        if(INSTANCE == null) {
//            synchronized (ServersLazy.class) {
//                if(INSTANCE == null) {
//                    INSTANCE = new ServersLazy();
//                }
//            }
//        }
//    }

    private Set<String> serversList;
    private ServersLazy() {
        serversList = new LinkedHashSet<>();
    }

    public boolean addServer(final String server) {
        if(server.startsWith("http") || server.startsWith("https")) {
            serversList.add(server);
            return true;
        } else {
            return false;
        }
    }
    public Set<String> getServersStartingWith(final String prefix) {
    return serversList.stream().
            filter(server->server.startsWith(prefix)).collect(Collectors.toUnmodifiableSet());
    }
    public Set<String> getHttpsServers(){
        return serversList.stream().
                filter(server->server.startsWith("https")).collect(Collectors.toUnmodifiableSet());
    }
}
