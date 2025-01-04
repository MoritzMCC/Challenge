package de.MoritzMCC.challenges;

import java.util.HashMap;
import java.util.Map;

public class ChallengeRegistery {

    Map<String,AbstractChallenge> challengeRegistry = new HashMap<>();

    public void addChallenge( AbstractChallenge challenge) {
        challengeRegistry.put(challenge.getName(), challenge);
    }

    public Map<String, AbstractChallenge> getChallengeRegistry() {
        return challengeRegistry;
    }
}
