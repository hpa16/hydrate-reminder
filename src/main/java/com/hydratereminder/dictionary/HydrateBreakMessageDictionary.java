package com.hydratereminder.dictionary;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hydratereminder.HydrateReminderPersonalityType;

public class HydrateBreakMessageDictionary {

    /**
     * Hydrate Reminder interval break text to display in simple form
     */
    private static final List<String> HYDRATE_BREAK_SIMPLE_TEXT_LIST =
            Collections.unmodifiableList(
                    new ArrayList<String>() {{
                        add("It's time for a quick hydration break");
                    }}
            );
    /**
     * Hydrate Reminder interval break text to display in funny form
     */
    private static final List<String> HYDRATE_BREAK_FUNNY_TEXT_LIST =
            Collections.unmodifiableList(
                    new ArrayList<String>() {{
                        add("It's time for a quick hydration break");
                        add("Dehydration causes fatigue so take a hydration break");
                        add("It's time to drink some good ol' water");
                        add("Stay healthy by taking a hydration break");
                        add("Time to glug, glug, glug some water");
                        add("It is now time to take a hydration break");
                        add("Time to hydrate");
                        add("Power up with a hydration break now");
                        add("Got water? It's time to hydrate");
                        add("Cheers to this hydration break");
                        add("Hydration time is now");
                        add("Fuel up with a hydration break");
                        add("3... 2... 1... It's hydration time");
                        add("Feeling parched yet? It's hydration time");
                        add("Now would be a fantastic time to hydrate");
                        add("Water... you need... water");
                        add("Thirsty? Time to grab a drink");
                        add("Water: a liquid that is necessary for life. Why don't you drink some");
                        add("Hello, this is your reminder to take a hydration break");
                        add("Remember to stay hydrated");
                        add("What'cha drinking there? It's time to take another sip");
                        add("Ding ding ding! Hydration time");
                        add("Everyone needs water, you should drink some now");
                        add("Time for another glass of water");
                        add("You've been grinding hard, time to reward your self with a hydration break");
                        add("Water makes the world go 'round, you should drink some now");
                        add("Hydration can improve your ability to focus, time for a hydration break");
                        add("Time to take a break and hydrate");
                        add("Dehydration can cause you to feel dizzy and lightheaded, take a hydration break");
                        add("Dehydration can cause dry mouth, lips, and eyes. Take a hydration break");
                    }}
            );
    
    /**
     * Hydrate Reminder interval break text to display in caring form
     */
    private static final List<String> HYDRATE_BREAK_CARING_TEXT_LIST =
            Collections.unmodifiableList(
                    new ArrayList<String>() {{
                        add("Drink water before it's too late");
                        add("Drink water and you shall be saved");
                        add("No matter how rich you are, remember to drink water");
                        add("Pure water = better life. Drink it");
                        add("A good day starts with water");
                        add("Don't be thirsty. Drink water");
                        add("Water is sacred! Drink it");
                        add("Water is a human right! Use it right now");
                        add("No water = no life! Bring yourself back to life");
                        add("Why are you dehydrated? Drink water");
                        add("Save yourself from being thirsty! Drink water");
                        add("Take care of your mental health! Drink some water");
                        add("Your future seems brighter when you drink water");
                        add("Clear your thoughts! Drink some water");
                        add("Take a sip of water because I care for you and want to see you healthy");
                    }}
            );
    
    /**
     * Hydrate Reminder interval break text to display in polite form
     */
    private static final List<String> HYDRATE_BREAK_POLITE_TEXT_LIST =
            Collections.unmodifiableList(
                    new ArrayList<String>() {{
                        add("Drinking water will boost your concentration. Kindly have a sip");
                        add("Your beautiful skin will shine brighter when hydrated. Please go ahead");
                        add("If you don't mind, please take a short break to hydrate");
                        add("Hydration time! Please drink some water");
                        add("Keep that smile on! Kindly have some water");
                        add("Water is the best of all things. Please keep yourself hydrated");
                        add("I'd prefer you to take a quick hydration break, please");
                        add("Let your body sing you a lullaby. Please hydrate");
                        add("It'll be great if you take a small hydration break");
                        add("You seem dehydrated! Please drink some water");
                        add("Please don't hesitate to take a small water break");
                        add("Please take care of yourself! Drink some water");
                        add("Your future seems brighter when you drink water. Please have a sip");
                        add("To be honest, you really need a hydration break. Kindly grab a drink");                  
                    }}
            );
    
    private static String getRandomBreakMessage(List<String> hydrateBreakTextList)
    {
        final SecureRandom randomGenerator = new SecureRandom();
        final int randomNumber = randomGenerator.nextInt(hydrateBreakTextList.size());
        return hydrateBreakTextList.get(randomNumber);
    }
    
    public static String getRandomHydrateBreakMessageForPersonality(HydrateReminderPersonalityType personalityType)
    {
        String breakMessage;
        switch (personalityType)
        {
            case SIMPLE:
                breakMessage = HYDRATE_BREAK_SIMPLE_TEXT_LIST.get(0);
                break;
            case FUN:
                breakMessage = getRandomBreakMessage(HYDRATE_BREAK_FUNNY_TEXT_LIST);
                break;
            case CARING:
                breakMessage = getRandomBreakMessage(HYDRATE_BREAK_CARING_TEXT_LIST);
                break;
            case POLITE:
                breakMessage = getRandomBreakMessage(HYDRATE_BREAK_POLITE_TEXT_LIST);
                break;
            default:
                throw new IllegalStateException("Provided personality type is not supported");
        }
        return breakMessage;
    }

}