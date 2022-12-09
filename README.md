# PandaGKitAPI
PandaGKit official API.


## How to create a Custom Enchantment?

Just create a new class which is going to be extended by ``ICustomEnchant``, then fill the constructor with the name of your enchant, with the properties using the builder of `CustomEnchantProperties` and if you want permanent effects, you should add it as well in the constructor.
If you want, also you can use the methods `onMove(Player)`, `onKill(Player, Player)` or even `onHit(Player, Player, double)` (which in the last one, it can be used to change the damage).
Then register it using `PandaGKitAPI#registerCustomEnchantment(ICustomEnchant)`.
<br>
Like this:

```java
import dev.panda.gkit.commons.customenchant.CustomEnchantProperties;
import dev.panda.gkit.commons.customenchant.ICustomEnchant;
import dev.panda.gkit.utilities.JavaUtil;
import dev.panda.gkit.utilities.PotionRestorer;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import java.util.Arrays;

public class TestEnchant extends ICustomEnchant {

    public TestEnchant() {
        super("test", CustomEnchantProperties.builder()
                        .setGlow(true)
                        .setDisplayName("&8Test")
                        .setDescription(Arrays.asList(
                                "&6&m---------------------",
                                "&7This is a test enchantment!",
                                "",
                                "&eDrag to your armor to apply",
                                "&6&m---------------------")
                        )
                        .setMaterial(Material.BOOK)
                        .setData(0)
                        .setLevel(1)
                        .addCustomProperty("chance", 1.0D)
                        .addCustomProperty("duration", 5)
                        .addCustomProperty("jumpLevel", 1)
                        .build(),
                PotionEffectType.SPEED
        );
    }

    @Override
    public double onMove(Player player, Player damager, double damage) {
        double chance = (double) this.getProperties().getCustomProperty("chance");

        if (!getChance(chance)) return damage;

        PotionRestorer
                .builder()
                .effect(PotionEffectType.JUMP, (int) this.getProperties().getCustomProperty("duration"), (int) this.getProperties().getCustomProperty("jumpLevel"))
                .player(player)
                .build()
                .run();

        return damage;
    }
    
    // You can use onMove(Player), onKill(Player, Player) or onHit(Player, Player, double)

    private boolean getChance(double minimalChance) {
        return ThreadLocalRandom.current().nextDouble(99) + 1 >= (100 - minimalChance);
    }
}

```

## How to get a custom enchantment?
Use: `PandaGKitAPI#getCustomEnchantment(String)`.

## How to give the item of a custom enchantment?

Use: `PandaGKitAPI#giveCustomEnchant(Player, ICustomEnchant, int)` or if you just want to give only one item use: `PandaGKitAPI#giveCustomEnchant(Player, ICustomEnchant)`.

## How to get a kit?
Use: `PandaGKitAPI#getKit(String)`.

## How to apply a kit to a player?

Use: `PandaGKitAPI#applyKit(Player, Kit)`, if you want to force it, use: `PandaGKitAPI#applyKitForced(Player, Kit)`.