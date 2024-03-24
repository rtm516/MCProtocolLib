package com.github.steveice10.mc.protocol.data.game.entity.type;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomEntityType implements EntityType {
    private final int id;
}
