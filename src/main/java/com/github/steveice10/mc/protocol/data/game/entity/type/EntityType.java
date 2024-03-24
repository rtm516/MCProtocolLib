package com.github.steveice10.mc.protocol.data.game.entity.type;

public interface EntityType {
    String getName();
    int getId();

    public static EntityType from(int id) {
        if (id < 0 || id >= BuiltinEntityType.values().length) {
            return new CustomEntityType("", id);
        }

        return BuiltinEntityType.from(id);
    }
}
