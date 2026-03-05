package ru.drugaddict.command;

import org.bukkit.GameMode;

import java.util.HashMap;
import java.util.Map;

public enum GamemodeType {

    SURVIVAL("0", GameMode.SURVIVAL),
    CREATIVE("1", GameMode.CREATIVE),
    SPECTATOR("3", GameMode.SPECTATOR);

    private final String id;
    private final GameMode gamemode;

    private static final Map<String, GamemodeType> BY_ID = new HashMap<>();

    static {
        for (GamemodeType type : GamemodeType.values()) {
            BY_ID.put(type.id, type);
        }
    }
    GamemodeType(String id, GameMode gamemode) {
        this.id = id;
        this.gamemode = gamemode;
    }
    public static GamemodeType byId(String id) {
        return BY_ID.get(id);
    }
    public GameMode getGamemode() {
        return gamemode;
    }


    }

