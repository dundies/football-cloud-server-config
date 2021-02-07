package nunez.emman.footballcloudserverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FootballCloudServerConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(FootballCloudServerConfigApplication.class, args);
    }

}
