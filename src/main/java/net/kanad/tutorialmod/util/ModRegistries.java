package net.kanad.tutorialmod.util;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.kanad.tutorialmod.command.ReturnHomeCommand;
import net.kanad.tutorialmod.command.SetHomeCommand;
import net.kanad.tutorialmod.event.ModPlayerEventCopyFrom;

public class ModRegistries {
    public static void registerModStuff() {
        registerEvents();
        registerCommands();
    }
    private static void registerEvents() {
        ServerPlayerEvents.COPY_FROM.register(new ModPlayerEventCopyFrom());
    }

    private static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }}
