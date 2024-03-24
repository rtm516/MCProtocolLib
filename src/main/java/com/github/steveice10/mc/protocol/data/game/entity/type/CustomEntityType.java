package com.github.steveice10.mc.protocol.data.game.entity.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
public class CustomEntityType implements EntityType {
    private final @NotNull String name;
    private final int id;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof CustomEntityType other)) {
            return false;
        } else {
            // Only compare the ID as the name is just for human readability
            return this.getId() == other.getId();
        }
    }
}
