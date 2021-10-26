package com.example.examplemod.backend.mixin.mixins;

import com.example.examplemod.Example;
import com.example.examplemod.backend.event.events.NetworkPacketEvent;
import com.example.examplemod.backend.event.events.PacketEvent;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(NetworkManager.class)
public class MixinNetworkManager {

    @Inject(method = "sendPacket(Lnet/minecraft/network/Packet;)V", at = @At("HEAD"), cancellable = true)
    private void onSendPacket(Packet<?> p_Packet, CallbackInfo callbackInfo) {
        NetworkPacketEvent event = new NetworkPacketEvent(p_Packet);
        Example.EVENT_BUS.post(event);

        if (event.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method = "sendPacket(Lnet/minecraft/network/Packet;)V", at = @At("HEAD"), cancellable = true)
    private void preSendPacket(Packet<?> packet, CallbackInfo callbackInfo) {
        PacketEvent.Send event = new PacketEvent.Send(packet);
        Example.EVENT_BUS.post(event);

        if (event.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method = "channelRead0", at = @At("HEAD"), cancellable = true)
    private void preChannelRead(ChannelHandlerContext context, Packet<?> packet, CallbackInfo callbackInfo) {
        PacketEvent.Receive event = new PacketEvent.Receive(packet);
        Example.EVENT_BUS.post(event);

        if (event.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method = "sendPacket(Lnet/minecraft/network/Packet;)V", at = @At("TAIL"), cancellable = true)
    private void postSendPacket(Packet<?> packet, CallbackInfo callbackInfo) {
        PacketEvent.PostSend event = new PacketEvent.PostSend(packet);
        Example.EVENT_BUS.post(event);

        if (event.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method = "channelRead0", at = @At("TAIL"), cancellable = true)
    private void postChannelRead(ChannelHandlerContext context, Packet<?> packet, CallbackInfo callbackInfo) {
        PacketEvent.PostReceive event = new PacketEvent.PostReceive(packet);
        Example.EVENT_BUS.post(event);

        if (event.isCancelled()) {
            callbackInfo.cancel();
        }
    }
}
