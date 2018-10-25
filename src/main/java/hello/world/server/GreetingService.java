package hello.world.server;

import io.micronaut.context.annotation.Primary;

import javax.inject.Singleton;

@Primary
@Singleton
public class GreetingService {
    public String getGreeting() {
        return "Hello ";
   }
}
