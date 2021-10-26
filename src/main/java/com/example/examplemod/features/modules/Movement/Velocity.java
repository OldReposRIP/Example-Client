package com.example.examplemod.features.modules.Movement;

import com.example.examplemod.backend.event.events.PacketEvent;
import com.example.examplemod.features.modules.Module;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.network.play.server.SPacketEntityVelocity;
import net.minecraft.network.play.server.SPacketExplosion;

public class Velocity extends Module {

    public Velocity() {
        super("Velocity", 0, com.example.examplemod.features.modules.Category.Movement);
    }

    @EventHandler
    private final Listener<PacketEvent.Receive> receiveListener = new Listener<>(event -> {
        if (event.getPacket() instanceof SPacketEntityVelocity){
            if(((SPacketEntityVelocity) event.getPacket()).getEntityID() == mc.player.getEntityId()) {
                event.cancel();
            }
        }
        if (event.getPacket() instanceof SPacketExplosion){
            event.cancel();
        }
    });
}
