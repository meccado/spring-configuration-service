package za.co.meccado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServiceApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting the Spring boot Applicatiojn!" );
        SpringApplication.run(ConfigServiceApplication.class, args);
    }
}
