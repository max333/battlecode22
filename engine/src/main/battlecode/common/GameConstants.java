package battlecode.common;

/**
 * Defines constants that affect gameplay.
 */
@SuppressWarnings("unused")
public class GameConstants {

    /**
     * The current spec version the server compiles with.
     */
    public static final String SPEC_VERSION = "1.0";

    // *********************************
    // ****** MAP CONSTANTS ************
    // *********************************

    /** The minimum possible map height. */
    public static final int MAP_MIN_HEIGHT = 32;

    /** The maximum possible map height. */
    public static final int MAP_MAX_HEIGHT = 64;

    /** The minimum possible map width. */
    public static final int MAP_MIN_WIDTH = 32;

    /** The maximum possible map width. */
    public static final int MAP_MAX_WIDTH = 64;

    // *********************************
    // ****** GAME PARAMETERS **********
    // *********************************

    /** The number of indicator strings that a player can associate with a robot. */
    public static final int NUMBER_OF_INDICATOR_STRINGS = 3;

    /** The bytecode penalty that is imposed each time an exception is thrown. */
    public static final int EXCEPTION_BYTECODE_PENALTY = 500;

    /** Maximum ID a Robot will have */
    public static final int MAX_ROBOT_ID = 32000;

    // *********************************
    // ****** POLLUTION ****************
    // *********************************

    /** The coefficient that the sensor radius squared will be multiplied by, as a function of pollution.
     * @param pollution the pollution
     * @return the sensor radius coefficient at the given pollution
     * */
    public static float getSensorRadiusPollutionCoefficient(int pollution) {
        return (float) (1.0 / Math.pow((1.0 + pollution / 4000.0),2));
    }

    /** The coefficient that the cooldown will be multiplied by, as a function of pollution.
     * @param pollution the pollution
     * @return the cooldown coefficient at the given pollution
     * */
    public static float getCooldownPollutionCoefficient(int pollution) {
        return (float) (1.0 + pollution / 2000.0);
    }

    // *********************************
    // ****** WATER ********************
    // *********************************

    /** The function determining current water level as a function of the round number.
     * @param roundNumber the round number
     * @return the water level at the given round
     * */
    public static float getWaterLevel(int roundNumber) {
        double x = roundNumber;
        return (float) (Math.exp(0.0028*x-1.38*Math.sin(0.00157*x-1.73)+1.38*Math.sin(-1.73))-1);
    }

    // *********************************
    // ****** MOVEMENT *****************
    // *********************************

    /** The maximum difference between dirt levels that a robot can cross. */
    public static final int MAX_DIRT_DIFFERENCE = 3;

    // *********************************
    // ****** ATTACKING ****************
    // *********************************

    /** The radius that delivery drones can pick up. */
    public static final int DELIVERY_DRONE_PICKUP_RADIUS_SQUARED = 3;

    /** The radius that net guns can shoot. */
    public static final int NET_GUN_SHOOT_RADIUS_SQUARED = 15;

    // *********************************
    // ****** COOLDOWNS ****************
    // *********************************

    /** The initial cooldown level. How many turns a newly created robot (that is, excluding the HQ) needs to wait. */
    public static final int INITIAL_COOLDOWN_TURNS = 10;

    // *********************************
    // ****** GAMEPLAY PROPERTIES ******
    // *********************************

    /** The default game seed. **/
    public static final int GAME_DEFAULT_SEED = 6370;

    /** The maximum number of rounds in a game. In practice, this is not needed, because the water level at round 10,000 will be huge. **/
    public static final int GAME_MAX_NUMBER_OF_ROUNDS = 10000;
}
